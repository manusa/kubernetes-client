
package io.fabric8.openshift.api.model.miscellaneous.cloudcredential.v1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "cloudTokenPath",
    "providerSpec",
    "secretRef",
    "serviceAccountNames"
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
    @BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class CredentialsRequestSpec implements Editable<CredentialsRequestSpecBuilder> , KubernetesResource
{

    @JsonProperty("cloudTokenPath")
    private java.lang.String cloudTokenPath;
    @JsonProperty("providerSpec")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, Object> providerSpec = new LinkedHashMap<>();
    @JsonProperty("secretRef")
    private io.fabric8.kubernetes.api.model.ObjectReference secretRef;
    @JsonProperty("serviceAccountNames")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<java.lang.String> serviceAccountNames = new ArrayList<>();
    @JsonIgnore
    private Map<java.lang.String, java.lang.Object> additionalProperties = new LinkedHashMap<java.lang.String, java.lang.Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CredentialsRequestSpec() {
    }

    public CredentialsRequestSpec(java.lang.String cloudTokenPath, Map<String, Object> providerSpec, io.fabric8.kubernetes.api.model.ObjectReference secretRef, List<java.lang.String> serviceAccountNames) {
        super();
        this.cloudTokenPath = cloudTokenPath;
        this.providerSpec = providerSpec;
        this.secretRef = secretRef;
        this.serviceAccountNames = serviceAccountNames;
    }

    @JsonProperty("cloudTokenPath")
    public java.lang.String getCloudTokenPath() {
        return cloudTokenPath;
    }

    @JsonProperty("cloudTokenPath")
    public void setCloudTokenPath(java.lang.String cloudTokenPath) {
        this.cloudTokenPath = cloudTokenPath;
    }

    @JsonProperty("providerSpec")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, Object> getProviderSpec() {
        return providerSpec;
    }

    @JsonProperty("providerSpec")
    public void setProviderSpec(Map<String, Object> providerSpec) {
        this.providerSpec = providerSpec;
    }

    @JsonProperty("secretRef")
    public io.fabric8.kubernetes.api.model.ObjectReference getSecretRef() {
        return secretRef;
    }

    @JsonProperty("secretRef")
    public void setSecretRef(io.fabric8.kubernetes.api.model.ObjectReference secretRef) {
        this.secretRef = secretRef;
    }

    @JsonProperty("serviceAccountNames")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<java.lang.String> getServiceAccountNames() {
        return serviceAccountNames;
    }

    @JsonProperty("serviceAccountNames")
    public void setServiceAccountNames(List<java.lang.String> serviceAccountNames) {
        this.serviceAccountNames = serviceAccountNames;
    }

    @JsonIgnore
    public CredentialsRequestSpecBuilder edit() {
        return new CredentialsRequestSpecBuilder(this);
    }

    @JsonIgnore
    public CredentialsRequestSpecBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<java.lang.String, java.lang.Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
