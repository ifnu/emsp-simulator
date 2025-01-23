package com.github.emsp.simulator.model.cpo;

public class RemoteCommandResult {
    public String type;

    public boolean isOk = false;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getIsOk() {
        return isOk;
    }

    public void setIsOk(boolean isOk) {
        this.isOk = isOk;
    }

}
