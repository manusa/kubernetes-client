/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client;

public class V1beta1AuthorizationAPIGroupExtensionAdapter extends APIGroupExtensionAdapter<V1beta1AuthorizationAPIGroupClient> {
  @Override
  protected String getAPIGroupName() {
    return "authorization/v1beta1";
  }

  @Override
  public Class<V1beta1AuthorizationAPIGroupClient> getExtensionType() {
    return V1beta1AuthorizationAPIGroupClient.class;
  }

  @Override
  protected V1beta1AuthorizationAPIGroupClient newInstance(Client client) {
    return new V1beta1AuthorizationAPIGroupClient(client);
  }
}