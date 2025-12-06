package com.example.fish_hatchery_final.anika;

import com.example.fish_hatchery_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class feedqualityController
{
    @javafx.fxml.FXML
    private TableColumn moistureCol;
    @javafx.fxml.FXML
    private TextField fatTF;
    @javafx.fxml.FXML
    private TextField feedBatchNoTF;
    @javafx.fxml.FXML
    private TextField moistureTF;
    @javafx.fxml.FXML
    private TableColumn batchNoCol;
    @javafx.fxml.FXML
    private TableColumn proteinCol;
    @javafx.fxml.FXML
    private TableColumn qcStatusCOL;
    @javafx.fxml.FXML
    private TableColumn fatCol;
    @javafx.fxml.FXML
    private TextField protienTF;
    @javafx.fxml.FXML
    private TableColumn remarksCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void evaluateQualityOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateCertificateOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveOA(ActionEvent actionEvent) {
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
    public void rejectOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveQCresultOA(ActionEvent actionEvent) {
    }
}