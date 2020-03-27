package io.fabric8.kubernetes.client.mock.crd;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.client.CustomResourceDoneable;

public class DoneableFooBar extends CustomResourceDoneable<FooBar> {
  public DoneableFooBar(FooBar resource, Function<FooBar, FooBar> function) {
    super(resource, function);
  }
}
