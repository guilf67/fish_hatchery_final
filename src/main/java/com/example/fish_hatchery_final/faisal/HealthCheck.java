package com.example.fish_hatchery_final.faisal;

public class HealthCheck {

    private String parameter;
    private String value;
    private String date;
    private String pond;
    private String healthStatus;
    private String observation;

    public HealthCheck(String parameter, String value, String date, String pond, String healthStatus, String observation) {
        this.parameter = parameter;
        this.value = value;
        this.date = date;
        this.pond = pond;
        this.healthStatus = healthStatus;
        this.observation = observation;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPond() {
        return pond;
    }

    public void setPond(String pond) {
        this.pond = pond;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Override
    public String toString() {
        return "HealthCheck{" +
                "parameter='" + parameter + '\'' +
                ", value='" + value + '\'' +
                ", date='" + date + '\'' +
                ", pond='" + pond + '\'' +
                ", healthStatus='" + healthStatus + '\'' +
                ", observation='" + observation + '\'' +
                '}';
    }
}
