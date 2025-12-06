package com.example.fish_hatchery_final.anika;

import com.example.fish_hatchery_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class forecastController
{
    @javafx.fxml.FXML
    private TextField adjustNotesTF;
    @javafx.fxml.FXML
    private TableColumn statuaCol;
    @javafx.fxml.FXML
    private TextField speciesTF;
    @javafx.fxml.FXML
    private TableColumn monthCol;
    @javafx.fxml.FXML
    private TableColumn forecastFeedCol;
    @javafx.fxml.FXML
    private TableColumn suggestedActionCol;
    @javafx.fxml.FXML
    private TextField seasonTF;
    @javafx.fxml.FXML
    private TextField stockQuantityTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saceForecastOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void applyOA(ActionEvent actionEvent) {
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
}