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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class pHcontrolController
{
    @javafx.fxml.FXML
    private TextField currentpHTF;
    @javafx.fxml.FXML
    private AnchorPane targetpHTF;
    @javafx.fxml.FXML
    private TextField targetphTF;
    @javafx.fxml.FXML
    private TextField adjustDatetimeTF;
    @javafx.fxml.FXML
    private ComboBox pondCB;
    @javafx.fxml.FXML
    private TextField doseAmountTF;
    @javafx.fxml.FXML
    private ComboBox chemicalCB;
    @javafx.fxml.FXML
    private TableView pHcontrolTV;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TableColumn lastAdjustmentCol;
    @javafx.fxml.FXML
    private TableColumn pondCol;
    @javafx.fxml.FXML
    private TableColumn CurrentphCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveGenerateReportOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void logOutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verifypHOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void applyDoseOA(ActionEvent actionEvent) {
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