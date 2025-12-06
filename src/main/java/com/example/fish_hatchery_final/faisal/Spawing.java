package com.example.fish_hatchery_final.faisal;

public class Spawing {
    private String broodStock;
    private String tank;
    private String equipment;
    private String date;
    private String eggCount;
    private String note;

    public Spawing(String broodStock, String tank, String equipment, String date, String eggCount, String note) {
        this.broodStock = broodStock;
        this.tank = tank;
        this.equipment = equipment;
        this.date = date;
        this.eggCount = eggCount;
        this.note = note;
    }

    public String getBroodStock() {
        return broodStock;
    }

    public void setBroodStock(String broodStock) {
        this.broodStock = broodStock;
    }

    public String getTank() {
        return tank;
    }

    public void setTank(String tank) {
        this.tank = tank;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEggCount() {
        return eggCount;
    }

    public void setEggCount(String eggCount) {
        this.eggCount = eggCount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Spawing{" +
                "broodStock='" + broodStock + '\'' +
                ", tank='" + tank + '\'' +
                ", equipment='" + equipment + '\'' +
                ", date='" + date + '\'' +
                ", eggCount='" + eggCount + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
