package com.example.fish_hatchery_final.Akkhorik;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import com.example.fish_hatchery_final.*;
import javafx.stage.Stage;

import java.util.Date;

public class hatcheryoperatorcontroller {

    @FXML
    private TableView productionReportTable;
    @FXML
    private Button submitRequestBtn;
    @FXML
    private TextField hatchRate;
    @FXML
    private TextField feedTankId;
    @FXML
    private TableView operatorWaterTable;
    @FXML
    private DatePicker mortalityDate;
    @FXML
    private TextField transferDate;
    @FXML
    private ComboBox urgencyLevel;
    @FXML
    private TextField equipmentId;
    @FXML
    private TextField opAmmonia;
    @FXML
    private TextArea mortalityNotes;
    @FXML
    private TextArea transferNotes;
    @FXML
    private ComboBox feedingResponse;
    @FXML
    private TextField opOxygen;
    @FXML
    private TableView feedingScheduleTable;
    @FXML
    private TextArea hatchNotes;
    @FXML
    private TextField opPH;
    @FXML
    private TextField broodstockSpecies;
    @FXML
    private TextField feedAmount;
    @FXML
    private DatePicker hatchDate;
    @FXML
    private ComboBox healthStatus;
    @FXML
    private TextField hatchTankId;
    @FXML
    private TextField opWaterTank;
    @FXML
    private TextField hatchRecordId;
    @FXML
    private TextField eggsHatched;
    @FXML
    private TextField larvaeCount;
    @FXML
    private Button generateReportBtn;
    @FXML
    private TextField ageMonths;
    @FXML
    private TextField mortalityTank;
    @FXML
    private TextField opTemperature;
    @FXML
    private ComboBox equipmentType;
    @FXML
    private TextArea broodstockNotes;
    @FXML
    private TableView maintenanceTable;
    @FXML
    private TextField deadCount;
    @FXML
    private TextField mortalityCause;
    @FXML
    private TextArea feedingNotes;
    @FXML
    private TextArea productionSummary;
    @FXML
    private TextField broodstockId;
    @FXML
    private TextField sourceTank;
    @FXML
    private TextArea problemDescription;
    @FXML
    private TextField destinationTank;
    @FXML
    private TableView mortalityTable;
    @FXML
    private DatePicker reportEndDate;
    @FXML
    private TableView transferTable;
    @FXML
    private DatePicker reportStartDate;
    @FXML
    private TableView broodstockTable;
    @FXML
    private TableView hatchingTable;
    @FXML
    private TextField feedingTime;
    @FXML
    private TextArea opWaterNotes;
    @FXML
    private ComboBox feedType;

    // Hatching Data Fields
    @FXML private TextField eggsCountField;
    @FXML private TextField hatchedCountField;
    @FXML private TextField tankIdField;
    @FXML private Button saveHatchingButton;
    @FXML private Label hatchingStatusLabel;


    @FXML
    private void initialize() {
        hatchingStatusLabel.setVisible(false);
    }

    @FXML
    private void handleSaveHatchingData() {
        try {
            int eggsCount = Integer.parseInt(eggsCountField.getText());
            int hatchedCount = Integer.parseInt(hatchedCountField.getText());
            String tankId = tankIdField.getText();

            HatchingRecord record = new HatchingRecord(
                    "HATCH_" + System.currentTimeMillis(),
                    new Date(),
                    eggsCount,
                    hatchedCount,
                    tankId
            );

            if (record.validate()) {
                boolean success = record.save();
                if (success) {
                    showStatus("Hatching data saved successfully!", true);
                    clearHatchingFields();
                } else {
                    showStatus("Error saving data!", false);
                }
            } else {
                showStatus("Invalid data! Please check your inputs.", false);
            }

        } catch (NumberFormatException e) {
            showStatus("Please enter valid numbers!", false);
        }
    }

    @FXML
    private void handleLogout(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/fish_hatchery_final/login.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Login");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }
    }

    private void showStatus(String message, boolean isSuccess) {
        hatchingStatusLabel.setText(message);
        hatchingStatusLabel.setStyle(isSuccess ? "-fx-text-fill: green;" : "-fx-text-fill: red;");
        hatchingStatusLabel.setVisible(true);
    }

    private void clearHatchingFields() {
        eggsCountField.clear();
        hatchedCountField.clear();
        tankIdField.clear();
    }

    @FXML
    public void handleRecordFeeding(ActionEvent actionEvent) {
    }

    @FXML
    public void handleGenerateProductionReport(ActionEvent actionEvent) {
    }

    @FXML
    public void handleRecordTransfer(ActionEvent actionEvent) {
    }

    @FXML
    public void handleRecordHatching(ActionEvent actionEvent) {
    }

    @FXML
    public void handleReportMortality(ActionEvent actionEvent) {
    }

    @FXML
    public void handleUpdateBroodstock(ActionEvent actionEvent) {
    }

    @FXML
    public void handleRecordWaterQuality(ActionEvent actionEvent) {
    }

    @FXML
    public void handleSubmitMaintenanceRequest(ActionEvent actionEvent) {
    }
}