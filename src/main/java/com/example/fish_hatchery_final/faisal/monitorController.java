package com.example.fish_hatchery_final.faisal;

import com.example.fish_hatchery_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.time.LocalDate;

public class monitorController {

    @javafx.fxml.FXML
    private ComboBox<String> hatcheryIdCB;

    @javafx.fxml.FXML
    private Label eggsLabel;

    @javafx.fxml.FXML
    private Label larvaeLabel;

    @javafx.fxml.FXML
    private Label temperatureLabel;

    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private Label alertLabel;

    @javafx.fxml.FXML
    private DatePicker startDateDP;

    @javafx.fxml.FXML
    private DatePicker endDateDP;

    @javafx.fxml.FXML
    private TextArea historyTA;

    @javafx.fxml.FXML
    private TextArea observationsTA;

    private Monitor currentData;

    @javafx.fxml.FXML
    public void initialize() {


        hatcheryIdCB.getItems().addAll("H-001", "H-002", "H-003");


        eggsLabel.setText("0");
        larvaeLabel.setText("0");
        temperatureLabel.setText("0 °C");
        statusLabel.setText("Unknown");
        alertLabel.setText("None");


        hatcheryIdCB.setOnAction(e -> loadMonitorData());
    }


    private void loadMonitorData() {

        String selectedId = hatcheryIdCB.getValue();
        if (selectedId == null) return;


        currentData = new Monitor(
                selectedId,
                12000,
                8500,
                28.5,
                "Stable",
                "No Alerts",
                "Last 3 days normal activity.",
                LocalDate.now().minusDays(5),
                LocalDate.now(),
                ""
        );


        eggsLabel.setText(String.valueOf(currentData.getEggsCount()));
        larvaeLabel.setText(String.valueOf(currentData.getLarvaeCount()));
        temperatureLabel.setText(currentData.getTemperature() + " °C");
        statusLabel.setText(currentData.getStatus());
        alertLabel.setText(currentData.getAlert());
        historyTA.setText(currentData.getHistory());
    }


    @javafx.fxml.FXML
    public void saveReportOA(ActionEvent actionEvent) {

        if (currentData == null) {
            System.out.println("No hatchery selected.");
            return;
        }

        String observations = observationsTA.getText();
        LocalDate start = startDateDP.getValue();
        LocalDate end = endDateDP.getValue();

        currentData = new Monitor(
                currentData.getHatcheryId(),
                currentData.getEggsCount(),
                currentData.getLarvaeCount(),
                currentData.getTemperature(),
                currentData.getStatus(),
                currentData.getAlert(),
                currentData.getHistory(),
                start,
                end,
                observations
        );

        System.out.println("Report Saved:");
        System.out.println("Observations: " + observations);
        System.out.println("Start: " + start + " End: " + end);

        observationsTA.clear();
    }


    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {

        System.out.println("Returning to dashboard...");

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("faisal/dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}