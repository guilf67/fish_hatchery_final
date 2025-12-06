package com.example.fish_hatchery_final.faisal;

public class StaffDuties {

    private String staffName;
    private String task;
    private String shift;

    public StaffDuties(String staffName, String task, String shift) {
        this.staffName = staffName;
        this.task = task;
        this.shift = shift;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "StaffDuties{" +
                "staffName='" + staffName + '\'' +
                ", task='" + task + '\'' +
                ", shift='" + shift + '\'' +
                '}';
    }
}
