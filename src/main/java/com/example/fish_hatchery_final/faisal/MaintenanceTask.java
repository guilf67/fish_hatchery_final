package com.example.fish_hatchery_final.faisal;

public class MaintenanceTask {

    private String task;
    private String status;

    public MaintenanceTask(String task, String status) {
        this.task = task;
        this.status = status;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MaintenanceTask{" +
                "task='" + task + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
