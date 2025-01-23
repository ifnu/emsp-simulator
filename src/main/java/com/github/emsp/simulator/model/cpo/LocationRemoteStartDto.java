package com.github.emsp.simulator.model.cpo;

public class LocationRemoteStartDto {
    public int connectorId;

    public String partyId;

    public String authorizationReference;

    public String authId;

    public String uid;

    public String issuer;

    public String visualNumber;

    public String emsproviderId;

    public String requestUniqueId;

    public int getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(int connectorId) {
        this.connectorId = connectorId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getAuthorizationReference() {
        return authorizationReference;
    }

    public void setAuthorizationReference(String authorizationReference) {
        this.authorizationReference = authorizationReference;
    }

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getVisualNumber() {
        return visualNumber;
    }

    public void setVisualNumber(String visualNumber) {
        this.visualNumber = visualNumber;
    }

    public String getEmsproviderId() {
        return emsproviderId;
    }

    public void setEmsproviderId(String emsproviderId) {
        this.emsproviderId = emsproviderId;
    }

    public String getRequestUniqueId() {
        return requestUniqueId;
    }

    public void setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
    }

}