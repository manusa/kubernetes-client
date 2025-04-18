/*
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
package io.fabric8.istio.client;

import io.fabric8.kubernetes.client.Client;

/**
 * Main interface for Istio Client.
 */
public interface IstioClient extends Client {

  /**
   * API entrypoint for istio.io/v1 API group resources
   *
   * @return {@link V1APIGroupDSL} for Istio resource operations in this API group.
   */
  V1APIGroupDSL v1();

  /**
   * API entrypoint for istio.io/v1beta1 API group resources
   *
   * @return {@link V1beta1APIGroupDSL} for Istio resource operations in this API group.
   */
  V1beta1APIGroupDSL v1beta1();

  /**
   * API entrypoint for istio.io/v1alpha3 API group resources
   *
   * @return {@link V1alpha3APIGroupDSL} for Istio resource operations in this API group.
   */
  V1alpha3APIGroupDSL v1alpha3();
}
