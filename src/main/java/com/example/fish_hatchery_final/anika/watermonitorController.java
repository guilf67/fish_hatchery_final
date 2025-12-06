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

public class watermonitorController
{
    @javafx.fxml.FXML
    private ComboBox ComboBox;
    @javafx.fxml.FXML
    private TableView previousReadingsTV;
    @javafx.fxml.FXML
    private TextField nitriteTF;
    @javafx.fxml.FXML
    private TextField dOTF;
    @javafx.fxml.FXML
    private TextField temperatureTF;
    @javafx.fxml.FXML
    private TextField amoniaTF;
    @javafx.fxml.FXML
    private TextField pHTF;
    @javafx.fxml.FXML
    private TableColumn pHCol;
    @javafx.fxml.FXML
    private TableColumn dateTimeCol;
    @javafx.fxml.FXML
    private TableColumn nitriteCol;
    @javafx.fxml.FXML
    private TableColumn dOCol;
    @javafx.fxml.FXML
    private TableColumn temperatureCol;
    @javafx.fxml.FXML
    private TableColumn ammoniaCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void returnToDashboardOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void validateDateOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void logOutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateDailyReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveReadingOA(ActionEvent actionEvent) {
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