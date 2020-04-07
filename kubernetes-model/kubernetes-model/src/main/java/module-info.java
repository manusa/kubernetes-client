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
module io.fabric8.kubernetes.model {
  requires static lombok;
  requires static builder.annotations;
  requires static transform.annotations;
  requires io.fabric8.kubernetes.model.common;
  requires java.annotation;
  requires com.fasterxml.jackson.core;
  requires com.fasterxml.jackson.databind;
  requires com.fasterxml.jackson.annotation;
  exports io.fabric8.kubernetes.api.builder;
  exports io.fabric8.kubernetes.api.model;
  exports io.fabric8.kubernetes.api.model.admissionregistration;
  exports io.fabric8.kubernetes.api.model.apiextensions;
  exports io.fabric8.kubernetes.api.model.apps;
  exports io.fabric8.kubernetes.api.model.authorization;
  exports io.fabric8.kubernetes.api.model.batch;
  exports io.fabric8.kubernetes.api.model.coordination.v1;
  exports io.fabric8.kubernetes.api.model.extensions;
  exports io.fabric8.kubernetes.api.model.metrics.v1beta1;
  exports io.fabric8.kubernetes.api.model.networking;
  exports io.fabric8.kubernetes.api.model.policy;
  exports io.fabric8.kubernetes.api.model.rbac;
  exports io.fabric8.kubernetes.api.model.scheduling;
  exports io.fabric8.kubernetes.api.model.storage;
  exports io.fabric8.kubernetes.api.model.settings;
  exports io.fabric8.kubernetes.api.model.v1;
  exports io.fabric8.kubernetes.internal;
  exports io.fabric8.openshift.api.model;
}
