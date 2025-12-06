package com.example.fish_hatchery_final.anika;

import com.example.fish_hatchery_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class monthlyreportController
{
    @javafx.fxml.FXML
    private TextField remarksTF;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn avgTenpCol;
    @javafx.fxml.FXML
    private TableColumn avgDoCol;
    @javafx.fxml.FXML
    private TableColumn avgAmmoniaCol;
    @javafx.fxml.FXML
    private TableView monthlysummaryTV;
    @javafx.fxml.FXML
    private ComboBox monthCB;
    @javafx.fxml.FXML
    private ComboBox pondCB;
    @javafx.fxml.FXML
    private TableColumn avgPhCol;
    @javafx.fxml.FXML
    private TableColumn alertsCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void applyEditOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveArchiveOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void emailReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void genarateReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportPdfOA(ActionEvent actionEvent) {
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
    public void exportCsvOA(ActionEvent actionEvent) {
    }
}