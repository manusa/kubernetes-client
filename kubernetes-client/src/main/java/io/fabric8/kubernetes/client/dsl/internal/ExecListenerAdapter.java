/*
 * ExecAdapter.java
 *
 * Created on 2019-11-11, 10:22
 */
package io.fabric8.kubernetes.client.dsl.internal;

import io.fabric8.kubernetes.client.dsl.ExecListener;
import okhttp3.Response;

public class ExecListenerAdapter implements ExecListener {

  @Override
  public void onOpen(Response response) {

  }

  @Override
  public void onFailure(Throwable t, Response response) {

  }

  @Override
  public void onClose(int code, String reason) {

  }
}
