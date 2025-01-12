package com.github.emsp.simulator.model;

public class Version {
    private String version;
    private String url;

    public Version() {
    }

    public Version(String version, String url) {
        this.version = version;
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
