package com.example.fish_hatchery_final.Akkhorik;

import java.util.Date;

public class HatchingRecord {
    private String recordId;
    private Date date;
    private int eggsCount;
    private int hatchedCount;
    private String tankId;

    public HatchingRecord(String recordId, Date date, int eggsCount, int hatchedCount, String tankId) {
        this.recordId = recordId;
        this.date = date;
        this.eggsCount = eggsCount;
        this.hatchedCount = hatchedCount;
        this.tankId = tankId;
    }

    // Getters and Setters
    public String getRecordId() { return recordId; }
    public void setRecordId(String recordId) { this.recordId = recordId; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public int getEggsCount() { return eggsCount; }
    public void setEggsCount(int eggsCount) { this.eggsCount = eggsCount; }

    public int getHatchedCount() { return hatchedCount; }
    public void setHatchedCount(int hatchedCount) { this.hatchedCount = hatchedCount; }

    public String getTankId() { return tankId; }
    public void setTankId(String tankId) { this.tankId = tankId; }

    public Boolean save() {
        // Database save implementation
        return true;
    }

    public Boolean validate() {
        return eggsCount >= 0 && hatchedCount >= 0 && hatchedCount <= eggsCount;
    }
}