package com.example.com.remotecommand.service.models;


import com.fasterxml.jackson.annotation.JsonProperty;

public class LockStatus {

    @JsonProperty("isLocked")
    public String isLocked;
    @JsonProperty("createdUser")
    public String createdUser;
    @JsonProperty("createdDate")
    public String createdDate;
    @JsonProperty("lastUpdatedUser")
    public String lastUpdatedUser;
    @JsonProperty("lastUpdatedDate")
    public String lastUpdatedDate;
    @JsonProperty("vin")
    public String vin;

    public LockStatus(String isLocked, String createdUser, String createdDate, String lastUpdatedUser,
                      String lastUpdatedDate, String vin) {
        this.isLocked = isLocked;
        this.createdUser = createdUser;
        this.createdDate = createdDate;

        this.vin = vin;
    }

    public LockStatus() {
    }

    public String getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(String isLocked) {
        this.isLocked = isLocked;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    public void setLastUpdatedUser(String lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
