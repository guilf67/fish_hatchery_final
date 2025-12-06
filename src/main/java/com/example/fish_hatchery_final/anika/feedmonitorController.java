package com.example.fish_hatchery_final.anika;

import com.example.fish_hatchery_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class feedmonitorController
{
    @javafx.fxml.FXML
    private TableView plannedVsActualTV;
    @javafx.fxml.FXML
    private DatePicker endDateDP;
    @javafx.fxml.FXML
    private TextField correctiveActionTF;
    @javafx.fxml.FXML
    private ComboBox pondCB;
    @javafx.fxml.FXML
    private TableColumn plannedFeedTC;
    @javafx.fxml.FXML
    private TextField actualFeedTF;
    @javafx.fxml.FXML
    private DatePicker startDateDP;
    @javafx.fxml.FXML
    private TableColumn deviationCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn actualFeedCol;
    @javafx.fxml.FXML
    private TableColumn correctiveActionCol;
    @javafx.fxml.FXML
    private TableColumn alertCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateRecordOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveMonthlyReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("anika/feedmanager.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Feed Manager");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void loadDataOA(ActionEvent actionEvent) {
    }
}