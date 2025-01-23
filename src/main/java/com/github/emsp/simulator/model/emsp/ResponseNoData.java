package com.github.emsp.simulator.model.emsp;

import java.util.Date;

public class ResponseNoData {
    private String statusCode = "1000"; //success
    private String statusMessage = "Success";
    private Date timestamp = new Date();

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

}
