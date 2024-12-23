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
package io.fabric8.openshift.client.impl;

import io.fabric8.kubernetes.client.dsl.NonNamespaceOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.client.extension.ClientAdapter;
import io.fabric8.openshift.api.model.autoscaling.v1.ClusterAutoscaler;
import io.fabric8.openshift.api.model.autoscaling.v1.ClusterAutoscalerList;
import io.fabric8.openshift.client.dsl.V1AutoscalingAPIGroupDSL;

public class V1OpenShiftAutoscalingAPIGroupClient extends ClientAdapter<V1OpenShiftAutoscalingAPIGroupClient>
    implements V1AutoscalingAPIGroupDSL {

  @Override
  public V1OpenShiftAutoscalingAPIGroupClient newInstance() {
    return new V1OpenShiftAutoscalingAPIGroupClient();
  }

  @Override
  public NonNamespaceOperation<ClusterAutoscaler, ClusterAutoscalerList, Resource<ClusterAutoscaler>> clusterAutoscalers() {
    return resources(ClusterAutoscaler.class, ClusterAutoscalerList.class);
  }
}
