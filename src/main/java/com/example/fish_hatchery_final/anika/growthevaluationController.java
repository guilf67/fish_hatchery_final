package com.example.fish_hatchery_final.anika;

import com.example.fish_hatchery_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class growthevaluationController
{
    @javafx.fxml.FXML
    private TableView batchGrowthSumTV;
    @javafx.fxml.FXML
    private TextField batchIdTF;
    @javafx.fxml.FXML
    private TableColumn sampleWeightCol;
    @javafx.fxml.FXML
    private TableColumn calculateFcrCol;
    @javafx.fxml.FXML
    private TableColumn targetFcrCol;
    @javafx.fxml.FXML
    private TableColumn feedingSugationCol;
    @javafx.fxml.FXML
    private TableColumn batchIdCol;
    @javafx.fxml.FXML
    private TextField avgSamWeightTF;
    @javafx.fxml.FXML
    private TextField targetFcrTF;
    @javafx.fxml.FXML
    private TableColumn performanceStatusCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void applyFeedSuggetionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void calculateFcrOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveReportOA(ActionEvent actionEvent) {
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
    public void saveToManagerOA(ActionEvent actionEvent) {
    }
}