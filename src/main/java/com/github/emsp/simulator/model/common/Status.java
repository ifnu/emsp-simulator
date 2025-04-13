package com.github.emsp.simulator.model.common;

public class Status {

    private String status;
    private String message;

    public static Status ok() {
        return new Status("OK", "");
    }

    public static Status ok(String message) {
        return new Status("OK", message);
    }

    public static Status error(String message) {
        return new Status("Error", message);
    }

    public Status() {}

    public Status(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
