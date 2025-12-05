package com.example.fish_hatchery_final.faisal;

import javafx.beans.property.StringProperty;
import javafx.scene.control.TableColumn;

public class Production {

    private final StringProperty pond;
    private final StringProperty broodStock;
    private final StringProperty targetQuantity;
    private final StringProperty resources;
    private final StringProperty scheduleStatus;

    public Production(StringProperty pond, StringProperty broodStock, StringProperty targetQuantity, StringProperty resources, StringProperty scheduleStatus) {
        this.pond = pond;
        this.broodStock = broodStock;
        this.targetQuantity = targetQuantity;
        this.resources = resources;
        this.scheduleStatus = scheduleStatus;
    }

    public String getPond() {
        return pond.get();
    }



    public StringProperty pondProperty() {
        return pond;
    }

    public String getBroodStock() {
        return broodStock.get();
    }

    public StringProperty broodStockProperty() {
        return broodStock;
    }

    public String getTargetQuantity() {
        return targetQuantity.get();
    }

    public StringProperty targetQuantityProperty() {
        return targetQuantity;
    }


    public String getResources() {
        return resources.get();
    }

    public StringProperty resourcesProperty() {
        return resources;
    }

    public String getScheduleStatus() {
        return scheduleStatus.get();
    }

    public StringProperty scheduleStatusProperty() {
        return scheduleStatus;
    }

    @Override
    public String toString() {
        return "Production{" +
                "pond=" + pond +
                ", broodStock=" + broodStock +
                ", targetQuantity=" + targetQuantity +
                ", resources=" + resources +
                ", scheduleStatus=" + scheduleStatus +
                '}';
    }
}
