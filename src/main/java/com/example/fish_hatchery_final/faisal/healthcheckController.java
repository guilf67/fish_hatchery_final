package com.example.fish_hatchery_final.faisal;

import com.example.fish_hatchery_final.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class healthcheckController {

    @javafx.fxml.FXML
    private ComboBox<String> healthStatusCB;

    @javafx.fxml.FXML
    private TableView<HealthCheck> waterParamsTV;

    @javafx.fxml.FXML
    private TableView<String> healthScheduleTV;

    @javafx.fxml.FXML
    private TableColumn<HealthCheck, String> parameterTC;

    @javafx.fxml.FXML
    private TableColumn<HealthCheck, String> valueTC;

    @javafx.fxml.FXML
    private TableColumn<HealthCheck, String> dateTC;

    @javafx.fxml.FXML
    private TableColumn<HealthCheck, String> pondTC;

    @javafx.fxml.FXML
    private TextArea observationTA;

    private final ObservableList<HealthCheck> healthList =
            FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        healthStatusCB.getItems().addAll(
                "Healthy",
                "Minor Issues",
                "Critical"
        );

        parameterTC.setCellValueFactory(new PropertyValueFactory<>("parameter"));
        valueTC.setCellValueFactory(new PropertyValueFactory<>("value"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        pondTC.setCellValueFactory(new PropertyValueFactory<>("pond"));

        waterParamsTV.setItems(healthList);
    }

    @javafx.fxml.FXML
    public void saveReportOA(ActionEvent actionEvent) {

        String status = healthStatusCB.getValue();
        String note = observationTA.getText();

        healthList.add(new HealthCheck(
                "pH",
                "7.5",
                java.time.LocalDate.now().toString(),
                "Pond A",
                status,
                note
        ));

        observationTA.clear();
        healthStatusCB.setValue(null);
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("faisal/aquadashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Aqua Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public TableView<String> getHealthScheduleTV() {
        return healthScheduleTV;
    }

    public void setHealthScheduleTV(TableView<String> healthScheduleTV) {
        this.healthScheduleTV = healthScheduleTV;
    }
}
