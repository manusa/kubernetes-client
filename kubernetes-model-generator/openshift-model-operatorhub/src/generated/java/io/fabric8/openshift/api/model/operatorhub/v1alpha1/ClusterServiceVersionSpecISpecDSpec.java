
package io.fabric8.openshift.api.model.operatorhub.v1alpha1;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
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
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "minReadySeconds",
    "paused",
    "progressDeadlineSeconds",
    "replicas",
    "revisionHistoryLimit",
    "selector",
    "strategy",
    "template"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
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
@Generated("jsonschema2pojo")
public class ClusterServiceVersionSpecISpecDSpec implements Editable<ClusterServiceVersionSpecISpecDSpecBuilder> , KubernetesResource
{

    @JsonProperty("minReadySeconds")
    private Integer minReadySeconds;
    @JsonProperty("paused")
    private Boolean paused;
    @JsonProperty("progressDeadlineSeconds")
    private Integer progressDeadlineSeconds;
    @JsonProperty("replicas")
    private Integer replicas;
    @JsonProperty("revisionHistoryLimit")
    private Integer revisionHistoryLimit;
    @JsonProperty("selector")
    private ClusterServiceVersionSpecISpecDSpecSelector selector;
    @JsonProperty("strategy")
    private ClusterServiceVersionSpecISpecDSpecStrategy strategy;
    @JsonProperty("template")
    private ClusterServiceVersionSpecISpecDSpecTemplate template;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClusterServiceVersionSpecISpecDSpec() {
    }

    public ClusterServiceVersionSpecISpecDSpec(Integer minReadySeconds, Boolean paused, Integer progressDeadlineSeconds, Integer replicas, Integer revisionHistoryLimit, ClusterServiceVersionSpecISpecDSpecSelector selector, ClusterServiceVersionSpecISpecDSpecStrategy strategy, ClusterServiceVersionSpecISpecDSpecTemplate template) {
        super();
        this.minReadySeconds = minReadySeconds;
        this.paused = paused;
        this.progressDeadlineSeconds = progressDeadlineSeconds;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = selector;
        this.strategy = strategy;
        this.template = template;
    }

    @JsonProperty("minReadySeconds")
    public Integer getMinReadySeconds() {
        return minReadySeconds;
    }

    @JsonProperty("minReadySeconds")
    public void setMinReadySeconds(Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
    }

    @JsonProperty("paused")
    public Boolean getPaused() {
        return paused;
    }

    @JsonProperty("paused")
    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    @JsonProperty("progressDeadlineSeconds")
    public Integer getProgressDeadlineSeconds() {
        return progressDeadlineSeconds;
    }

    @JsonProperty("progressDeadlineSeconds")
    public void setProgressDeadlineSeconds(Integer progressDeadlineSeconds) {
        this.progressDeadlineSeconds = progressDeadlineSeconds;
    }

    @JsonProperty("replicas")
    public Integer getReplicas() {
        return replicas;
    }

    @JsonProperty("replicas")
    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    @JsonProperty("revisionHistoryLimit")
    public Integer getRevisionHistoryLimit() {
        return revisionHistoryLimit;
    }

    @JsonProperty("revisionHistoryLimit")
    public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
    }

    @JsonProperty("selector")
    public ClusterServiceVersionSpecISpecDSpecSelector getSelector() {
        return selector;
    }

    @JsonProperty("selector")
    public void setSelector(ClusterServiceVersionSpecISpecDSpecSelector selector) {
        this.selector = selector;
    }

    @JsonProperty("strategy")
    public ClusterServiceVersionSpecISpecDSpecStrategy getStrategy() {
        return strategy;
    }

    @JsonProperty("strategy")
    public void setStrategy(ClusterServiceVersionSpecISpecDSpecStrategy strategy) {
        this.strategy = strategy;
    }

    @JsonProperty("template")
    public ClusterServiceVersionSpecISpecDSpecTemplate getTemplate() {
        return template;
    }

    @JsonProperty("template")
    public void setTemplate(ClusterServiceVersionSpecISpecDSpecTemplate template) {
        this.template = template;
    }

    @JsonIgnore
    public ClusterServiceVersionSpecISpecDSpecBuilder edit() {
        return new ClusterServiceVersionSpecISpecDSpecBuilder(this);
    }

    @JsonIgnore
    public ClusterServiceVersionSpecISpecDSpecBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}