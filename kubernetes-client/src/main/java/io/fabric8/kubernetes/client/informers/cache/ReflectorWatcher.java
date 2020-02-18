package io.fabric8.kubernetes.client.informers.cache;

import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.Status;
import io.fabric8.kubernetes.client.KubernetesClientException;
import io.fabric8.kubernetes.client.Watcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.HttpURLConnection;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class ReflectorWatcher<T extends HasMetadata> implements Watcher<T> {

  private static final Logger log = LoggerFactory.getLogger(ReflectorWatcher.class);

  private final Store<T> store;
  private final AtomicReference<String> lastSyncResourceVersion;
  private final Runnable onClose;
  private final Runnable onHttpGone;

  public ReflectorWatcher(Store<T> store, AtomicReference<String> lastSyncResourceVersion, Runnable onClose, Runnable onHttpGone) {
    this.store = store;
    this.lastSyncResourceVersion = lastSyncResourceVersion;
    this.onClose = onClose;
    this.onHttpGone = onHttpGone;
  }

  @Override
  public void eventReceived(Action action, T resource) {
    if (action == null) {
      final String errorMessage = String.format("Unrecognized event %s", resource.getMetadata().getName());
      log.error(errorMessage);
      throw new KubernetesClientException(errorMessage);
    }
    log.info("Event received {}", action.name());
    switch (action) {
      case ERROR:
        final String errorMessage = String.format("ERROR event for %s", resource.getMetadata().getName());
        log.error(errorMessage);
        throw new KubernetesClientException(errorMessage);
      case ADDED:
        store.add(resource);
        break;
      case MODIFIED:
        store.update(resource);
        break;
      case DELETED:
        store.delete(resource);
        break;
    }
    lastSyncResourceVersion.set(resource.getMetadata().getResourceVersion());
    log.debug("{}#Receiving resourceVersion {}", resource.getKind(), lastSyncResourceVersion.get());
  }

  @Override
  public void onClose(KubernetesClientException exception) {
    log.error("Watch closing");
    Optional.ofNullable(exception)
      .map(e -> {
        log.debug("Exception received during watch", e);
        return exception;
      })
      .map(KubernetesClientException::getStatus)
      .map(Status::getCode)
      .filter(c -> c.equals(HttpURLConnection.HTTP_GONE))
      .ifPresent(c -> onHttpGone.run());
    onClose.run();
  }

}
