package com.example.fish_hatchery_final.faisal;

import com.example.fish_hatchery_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class healthcheckController
{
    @javafx.fxml.FXML
    private ComboBox healthStatusCB;
    @javafx.fxml.FXML
    private TableView waterParamsTV;
    @javafx.fxml.FXML
    private TableColumn parameterTC;
    @javafx.fxml.FXML
    private TableColumn pondTC;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private TextArea observationTA;
    @javafx.fxml.FXML
    private TableView healthScheduleTV;
    @javafx.fxml.FXML
    private TableColumn valueTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveReportOA(ActionEvent actionEvent) {
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
            //
        }

    }

    @javafx.fxml.FXML
    public void updateHealthOA(ActionEvent actionEvent) {
    }
}