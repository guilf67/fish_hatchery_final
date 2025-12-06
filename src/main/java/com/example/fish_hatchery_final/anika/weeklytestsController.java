package com.example.fish_hatchery_final.anika;

import com.example.fish_hatchery_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class weeklytestsController
{
    @javafx.fxml.FXML
    private ComboBox technicianCB;
    @javafx.fxml.FXML
    private TextField timeTF;
    @javafx.fxml.FXML
    private TableView waterTestTV;
    @javafx.fxml.FXML
    private ComboBox pondCB;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TableColumn statusTCCol;
    @javafx.fxml.FXML
    private TableColumn technicianCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn timeTCCol;
    @javafx.fxml.FXML
    private TableColumn pondCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveUpdateOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void logOutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deleteSelectesOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void validateScheduleOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("anika/waterqualityspecialist.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("water quality specialist");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }
    }
}