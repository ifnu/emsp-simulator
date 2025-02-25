package com.github.emsp.simulator.model.cpo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RemoteCommandResult {
    public String type;

    public boolean isOk = false;

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("IsOk")
    public boolean getIsOk() {
        return isOk;
    }

    public void setIsOk(boolean isOk) {
        this.isOk = isOk;
    }

}
