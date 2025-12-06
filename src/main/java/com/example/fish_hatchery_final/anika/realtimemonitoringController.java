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

public class realtimemonitoringController
{
    @javafx.fxml.FXML
    private TableColumn doCol;
    @javafx.fxml.FXML
    private TextField doTF;
    @javafx.fxml.FXML
    private TextField ammoniaTF;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TableView realTimeTV;
    @javafx.fxml.FXML
    private TextField lastUpdateTF;
    @javafx.fxml.FXML
    private TextField correctiveActionNotesTF;
    @javafx.fxml.FXML
    private TableColumn ammoniaCol;
    @javafx.fxml.FXML
    private TableColumn timeCol;
    @javafx.fxml.FXML
    private TextField doMinTF;
    @javafx.fxml.FXML
    private TextField ammoniaMaxTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void startMonitorOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void archiveOA(ActionEvent actionEvent) {
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
    public void generateSummaryOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateOA(ActionEvent actionEvent) {
    }
}