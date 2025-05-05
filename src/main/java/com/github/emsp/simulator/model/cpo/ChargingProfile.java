package com.github.emsp.simulator.model.cpo;

import java.util.Date;
import java.util.List;

public class ChargingProfile {

    private Date startDateTime;
    private Integer duration;
    private String chargingRateUnit;
    private Integer minChargingRate;
    private List<ChargingProfilePeriod> chargingProfilePeriod;

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getChargingRateUnit() {
        return chargingRateUnit;
    }

    public void setChargingRateUnit(String chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }

    public Integer getMinChargingRate() {
        return minChargingRate;
    }

    public void setMinChargingRate(Integer minChargingRate) {
        this.minChargingRate = minChargingRate;
    }

    public List<ChargingProfilePeriod> getChargingProfilePeriod() {
        return chargingProfilePeriod;
    }

    public void setChargingProfilePeriod(List<ChargingProfilePeriod> chargingProfilePeriod) {
        this.chargingProfilePeriod = chargingProfilePeriod;
    }

}
