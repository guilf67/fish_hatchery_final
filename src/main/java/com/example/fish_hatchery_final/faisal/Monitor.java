package com.example.fish_hatchery_final.faisal;

import java.time.LocalDate;

public class Monitor {
    private String hatcheryId;
    private int eggsCount;
    private int larvaeCount;
    private double temperature;
    private String status;
    private String alert;
    private String history;
    private LocalDate startDate;
    private LocalDate endDate;
    private String observations;

    public Monitor(String hatcheryId, int eggsCount, int larvaeCount, double temperature, String status, String alert, String history, LocalDate startDate, LocalDate endDate, String observations) {
        this.hatcheryId = hatcheryId;
        this.eggsCount = eggsCount;
        this.larvaeCount = larvaeCount;
        this.temperature = temperature;
        this.status = status;
        this.alert = alert;
        this.history = history;
        this.startDate = startDate;
        this.endDate = endDate;
        this.observations = observations;
    }

    public String getHatcheryId() {
        return hatcheryId;
    }

    public void setHatcheryId(String hatcheryId) {
        this.hatcheryId = hatcheryId;
    }

    public int getEggsCount() {
        return eggsCount;
    }

    public void setEggsCount(int eggsCount) {
        this.eggsCount = eggsCount;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getLarvaeCount() {
        return larvaeCount;
    }

    public void setLarvaeCount(int larvaeCount) {
        this.larvaeCount = larvaeCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "hatcheryId='" + hatcheryId + '\'' +
                ", eggsCount=" + eggsCount +
                ", larvaeCount=" + larvaeCount +
                ", temperature=" + temperature +
                ", status='" + status + '\'' +
                ", alert='" + alert + '\'' +
                ", history='" + history + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", observations='" + observations + '\'' +
                '}';
    }
}
