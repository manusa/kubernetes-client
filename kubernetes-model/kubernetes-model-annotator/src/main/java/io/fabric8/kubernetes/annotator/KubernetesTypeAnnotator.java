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
package io.fabric8.kubernetes.annotator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sun.codemodel.*;
import io.fabric8.kubernetes.model.annotation.ApiGroup;
import io.fabric8.kubernetes.model.annotation.ApiVersion;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import io.sundr.builder.annotations.Inline;
import io.sundr.transform.annotations.VelocityTransformation;
import io.sundr.transform.annotations.VelocityTransformations;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.jsonschema2pojo.Jackson2Annotator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class KubernetesTypeAnnotator extends KubernetesCoreTypeAnnotator {

    @Override
    public void processBuildable(JDefinedClass clazz) {
      try {
        JAnnotationUse buildable = clazz.annotate(Buildable.class)
          .param("editableEnabled", false)
          .param("validationEnabled", false)
          .param("generateBuilderPackage", false)
          .param("lazyCollectionInitEnabled", false)
          .param("builderPackage", "io.fabric8.kubernetes.api.builder");

        buildable.paramArray("inline").annotate(Inline.class)
          .param("type", new JCodeModel()._class("io.fabric8.kubernetes.api.model.Doneable"))
          .param("prefix", "Doneable")
          .param("value", "done");

        JAnnotationArrayMember arrayMember = buildable.paramArray("refs");
        arrayMember.annotate(BuildableReference.class).param("value", new JCodeModel()._class("io.fabric8.kubernetes.api.model.ObjectMeta"));
        arrayMember.annotate(BuildableReference.class).param("value", new JCodeModel()._class("io.fabric8.kubernetes.api.model.LabelSelector"));
        arrayMember.annotate(BuildableReference.class).param("value", new JCodeModel()._class("io.fabric8.kubernetes.api.model.Container"));
        arrayMember.annotate(BuildableReference.class).param("value", new JCodeModel()._class("io.fabric8.kubernetes.api.model.PodTemplateSpec"));
        arrayMember.annotate(BuildableReference.class).param("value", new JCodeModel()._class("io.fabric8.kubernetes.api.model.ResourceRequirements"));
        arrayMember.annotate(BuildableReference.class).param("value", new JCodeModel()._class("io.fabric8.kubernetes.api.model.IntOrString"));
        arrayMember.annotate(BuildableReference.class).param("value", new JCodeModel()._class("io.fabric8.kubernetes.api.model.ObjectReference"));
        arrayMember.annotate(BuildableReference.class).param("value", new JCodeModel()._class("io.fabric8.kubernetes.api.model.LocalObjectReference"));

      } catch (JClassAlreadyExistsException e) {
        e.printStackTrace();
      }
    }

}
