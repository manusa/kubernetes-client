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

package io.fabric8.kubernetes.api.model.flowcontrol.v1beta1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "nonResourceRules",
    "resourceRules",
    "subjects"
})
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
public class PolicyRulesWithSubjects implements KubernetesResource
{

    @JsonProperty("nonResourceRules")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<NonResourcePolicyRule> nonResourceRules = new ArrayList<NonResourcePolicyRule>();
    @JsonProperty("resourceRules")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ResourcePolicyRule> resourceRules = new ArrayList<ResourcePolicyRule>();
    @JsonProperty("subjects")
    private List<Subject> subjects = new ArrayList<Subject>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PolicyRulesWithSubjects() {
    }

    /**
     * 
     * @param nonResourceRules
     * @param resourceRules
     * @param subjects
     */
    public PolicyRulesWithSubjects(List<NonResourcePolicyRule> nonResourceRules, List<ResourcePolicyRule> resourceRules, List<Subject> subjects) {
        super();
        this.nonResourceRules = nonResourceRules;
        this.resourceRules = resourceRules;
        this.subjects = subjects;
    }

    @JsonProperty("nonResourceRules")
    public List<NonResourcePolicyRule> getNonResourceRules() {
        return nonResourceRules;
    }

    @JsonProperty("nonResourceRules")
    public void setNonResourceRules(List<NonResourcePolicyRule> nonResourceRules) {
        this.nonResourceRules = nonResourceRules;
    }

    @JsonProperty("resourceRules")
    public List<ResourcePolicyRule> getResourceRules() {
        return resourceRules;
    }

    @JsonProperty("resourceRules")
    public void setResourceRules(List<ResourcePolicyRule> resourceRules) {
        this.resourceRules = resourceRules;
    }

    @JsonProperty("subjects")
    public List<Subject> getSubjects() {
        return subjects;
    }

    @JsonProperty("subjects")
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
