package com.example.fish_hatchery_final.anika;

import com.example.fish_hatchery_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class treatmentrecordsController
{
    @javafx.fxml.FXML
    private TextField responsibleTF;
    @javafx.fxml.FXML
    private TableColumn dosageCol;
    @javafx.fxml.FXML
    private TextField dosageTF;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TableColumn pondCol;
    @javafx.fxml.FXML
    private TableColumn responsibleCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn notesCol;
    @javafx.fxml.FXML
    private TableColumn treatmentTypeCol;
    @javafx.fxml.FXML
    private ComboBox pondCB;
    @javafx.fxml.FXML
    private TextField treatmentTypeTF;
    @javafx.fxml.FXML
    private TableColumn timeCol;
    @javafx.fxml.FXML
    private TableView previousTreatmentLogTV;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveRecordOA(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void uploadFileOA(ActionEvent actionEvent) {
    }
}