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

public class analyzealertsController
{
    @javafx.fxml.FXML
    private TextField actionTakenTF;
    @javafx.fxml.FXML
    private TableView contiminationAlertsTV;
    @javafx.fxml.FXML
    private TextField causeparameterTF;
    @javafx.fxml.FXML
    private TextField historicalTrendInsightTF;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TableColumn detectedAtCol;
    @javafx.fxml.FXML
    private TableColumn pondCol;
    @javafx.fxml.FXML
    private TableColumn alertTypeCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void markResolvedOA(ActionEvent actionEvent) {
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
    public void generateFileOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void uploadFileOA(ActionEvent actionEvent) {
    }
}