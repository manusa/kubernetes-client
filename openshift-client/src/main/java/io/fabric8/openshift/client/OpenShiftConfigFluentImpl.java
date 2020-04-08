package io.fabric8.openshift.client;

import io.fabric8.kubernetes.client.ConfigFluentImpl;

public class OpenShiftConfigFluentImpl<A extends OpenShiftConfigFluent<A>> extends ConfigFluentImpl<A> implements OpenShiftConfigFluent<A>{

    private String oapiVersion;
    private String openShiftUrl;
    private long buildTimeout;
    private boolean openshiftApiGroupsEnabled;
    private boolean disableApiGroupCheck;

    public OpenShiftConfigFluentImpl(){
    }
    public OpenShiftConfigFluentImpl(OpenShiftConfig instance){
            this.withOpenShiftUrl(instance.getOpenShiftUrl());
            this.withOapiVersion(instance.getOapiVersion());
            this.withBuildTimeout(instance.getBuildTimeout());
            this.withOpenshiftApiGroupsEnabled(instance.isOpenshiftApiGroupsEnabled());
            this.withDisableApiGroupCheck(instance.isDisableApiGroupCheck());
            this.withMasterUrl(instance.getMasterUrl());
            this.withApiVersion(instance.getApiVersion());
            this.withNamespace(instance.getNamespace());
            this.withTrustCerts(instance.isTrustCerts());
            this.withDisableHostnameVerification(instance.isDisableHostnameVerification());
            this.withCaCertFile(instance.getCaCertFile());
            this.withCaCertData(instance.getCaCertData());
            this.withClientCertFile(instance.getClientCertFile());
            this.withClientCertData(instance.getClientCertData());
            this.withClientKeyFile(instance.getClientKeyFile());
            this.withClientKeyData(instance.getClientKeyData());
            this.withClientKeyAlgo(instance.getClientKeyAlgo());
            this.withClientKeyPassphrase(instance.getClientKeyPassphrase());
            this.withUsername(instance.getUsername());
            this.withPassword(instance.getPassword());
            this.withOauthToken(instance.getOauthToken());
            this.withWatchReconnectInterval(instance.getWatchReconnectInterval());
            this.withWatchReconnectLimit(instance.getWatchReconnectLimit());
            this.withConnectionTimeout(instance.getConnectionTimeout());
            this.withRequestTimeout(instance.getRequestTimeout());
            this.withRollingTimeout(instance.getRollingTimeout());
            this.withScaleTimeout(instance.getScaleTimeout());
            this.withLoggingInterval(instance.getLoggingInterval());
            this.withMaxConcurrentRequestsPerHost(instance.getMaxConcurrentRequestsPerHost());
            this.withHttp2Disable(instance.isHttp2Disable());
            this.withHttpProxy(instance.getHttpProxy());
            this.withHttpsProxy(instance.getHttpsProxy());
            this.withNoProxy(instance.getNoProxy());
            this.withErrorMessages(instance.getErrorMessages());
            this.withUserAgent(instance.getUserAgent());
            this.withTlsVersions(instance.getTlsVersions());
            this.withWebsocketTimeout(instance.getWebsocketTimeout());
            this.withWebsocketPingInterval(instance.getWebsocketPingInterval());
            this.withProxyUsername(instance.getProxyUsername());
            this.withProxyPassword(instance.getProxyPassword());
            this.withTrustStoreFile(instance.getTrustStoreFile());
            this.withTrustStorePassphrase(instance.getTrustStorePassphrase());
            this.withKeyStoreFile(instance.getKeyStoreFile());
            this.withKeyStorePassphrase(instance.getKeyStorePassphrase());
            this.withImpersonateUsername(instance.getImpersonateUsername());
            this.withImpersonateGroups(instance.getImpersonateGroups());
            this.withImpersonateExtras(instance.getImpersonateExtras());
            this.withOauthTokenProvider(instance.getOauthTokenProvider());
            this.withCustomHeaders(instance.getCustomHeaders());
            this.withMaxConcurrentRequests(instance.getMaxConcurrentRequests());

            this.withOauthTokenProvider(instance.getOauthTokenProvider());

            this.withImpersonateGroup(instance.getImpersonateGroup());

            this.withHttp2Disable(instance.isHttp2Disable());

            this.withCustomHeaders(instance.getCustomHeaders());

    }

    public String getOapiVersion(){
            return this.oapiVersion;
    }

    public A withOapiVersion(String oapiVersion){
            this.oapiVersion=oapiVersion; return (A) this;
    }

    public Boolean hasOapiVersion(){
            return this.oapiVersion != null;
    }

    public A withNewOapiVersion(String arg1){
            return (A)withOapiVersion(new String(arg1));
    }

    public A withNewOapiVersion(StringBuilder arg1){
            return (A)withOapiVersion(new String(arg1));
    }

    public A withNewOapiVersion(StringBuffer arg1){
            return (A)withOapiVersion(new String(arg1));
    }

    public String getOpenShiftUrl(){
            return this.openShiftUrl;
    }

    public A withOpenShiftUrl(String openShiftUrl){
            this.openShiftUrl=openShiftUrl; return (A) this;
    }

    public Boolean hasOpenShiftUrl(){
            return this.openShiftUrl != null;
    }

    public A withNewOpenShiftUrl(String arg1){
            return (A)withOpenShiftUrl(new String(arg1));
    }

    public A withNewOpenShiftUrl(StringBuilder arg1){
            return (A)withOpenShiftUrl(new String(arg1));
    }

    public A withNewOpenShiftUrl(StringBuffer arg1){
            return (A)withOpenShiftUrl(new String(arg1));
    }

    public long getBuildTimeout(){
            return this.buildTimeout;
    }

    public A withBuildTimeout(long buildTimeout){
            this.buildTimeout=buildTimeout; return (A) this;
    }

    public Boolean hasBuildTimeout(){
            return true;
    }

    public boolean isOpenshiftApiGroupsEnabled(){
            return this.openshiftApiGroupsEnabled;
    }

    public A withOpenshiftApiGroupsEnabled(boolean openshiftApiGroupsEnabled){
            this.openshiftApiGroupsEnabled=openshiftApiGroupsEnabled; return (A) this;
    }

    public Boolean hasOpenshiftApiGroupsEnabled(){
            return true;
    }

    public boolean isDisableApiGroupCheck(){
            return this.disableApiGroupCheck;
    }

    public A withDisableApiGroupCheck(boolean disableApiGroupCheck){
            this.disableApiGroupCheck=disableApiGroupCheck; return (A) this;
    }

    public Boolean hasDisableApiGroupCheck(){
            return true;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenShiftConfigFluentImpl that = (OpenShiftConfigFluentImpl) o;
            if (oapiVersion != null ? !oapiVersion.equals(that.oapiVersion) :that.oapiVersion != null) return false;
            if (openShiftUrl != null ? !openShiftUrl.equals(that.openShiftUrl) :that.openShiftUrl != null) return false;
            if (buildTimeout != that.buildTimeout) return false;
            if (openshiftApiGroupsEnabled != that.openshiftApiGroupsEnabled) return false;
            if (disableApiGroupCheck != that.disableApiGroupCheck) return false;
            return true;
    }




}
