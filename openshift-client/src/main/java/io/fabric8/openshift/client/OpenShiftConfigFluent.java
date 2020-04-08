package io.fabric8.openshift.client;

import io.fabric8.kubernetes.client.ConfigFluent;

public interface OpenShiftConfigFluent<A extends OpenShiftConfigFluent<A>> extends ConfigFluent<A>{


    public String getOapiVersion();
    public A withOapiVersion(String oapiVersion);
    public Boolean hasOapiVersion();
    public A withNewOapiVersion(String arg1);
    public A withNewOapiVersion(StringBuilder arg1);
    public A withNewOapiVersion(StringBuffer arg1);
    public String getOpenShiftUrl();
    public A withOpenShiftUrl(String openShiftUrl);
    public Boolean hasOpenShiftUrl();
    public A withNewOpenShiftUrl(String arg1);
    public A withNewOpenShiftUrl(StringBuilder arg1);
    public A withNewOpenShiftUrl(StringBuffer arg1);
    public long getBuildTimeout();
    public A withBuildTimeout(long buildTimeout);
    public Boolean hasBuildTimeout();
    public boolean isOpenshiftApiGroupsEnabled();
    public A withOpenshiftApiGroupsEnabled(boolean openshiftApiGroupsEnabled);
    public Boolean hasOpenshiftApiGroupsEnabled();
    public boolean isDisableApiGroupCheck();
    public A withDisableApiGroupCheck(boolean disableApiGroupCheck);
    public Boolean hasDisableApiGroupCheck();



}
