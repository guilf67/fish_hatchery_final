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

public class devicecalibrateController
{
    @javafx.fxml.FXML
    private TableColumn ReferenceCol;
    @javafx.fxml.FXML
    private TableView deviceTV;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn measuredCol;
    @javafx.fxml.FXML
    private TextField referenceValueTF;
    @javafx.fxml.FXML
    private TextField measuredValueTF;
    @javafx.fxml.FXML
    private ComboBox deviceCB;
    @javafx.fxml.FXML
    private TableColumn deviceCol;
    @javafx.fxml.FXML
    private TableColumn resultsCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void nextCalDueOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void manualAdjOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void startCalOA(ActionEvent actionEvent) {
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
    public void generateReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveSettingsOA(ActionEvent actionEvent) {
    }
}