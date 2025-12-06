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

public class feedformulationController
{
    @javafx.fxml.FXML
    private TableView saveFormulationTV;
    @javafx.fxml.FXML
    private TextField growthPhaseTF;
    @javafx.fxml.FXML
    private TextField fishSpeciesTF;
    @javafx.fxml.FXML
    private TextField proteinTF;
    @javafx.fxml.FXML
    private TextField lipidTF;
    @javafx.fxml.FXML
    private TextField vitaminLevelTF;
    @javafx.fxml.FXML
    private TableColumn lipidCol;
    @javafx.fxml.FXML
    private TableColumn vitaminLevelCol;
    @javafx.fxml.FXML
    private TableColumn notesCol;
    @javafx.fxml.FXML
    private TableColumn proteinCol;
    @javafx.fxml.FXML
    private TableColumn batchIdCol;
    @javafx.fxml.FXML
    private TableColumn fishSpeciesCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveOA(ActionEvent actionEvent) {
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
    public void validateOA(ActionEvent actionEvent) {
    }
}