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

public class feedscheduleController
{
    @javafx.fxml.FXML
    private TextField fishSpeciesTF;
    @javafx.fxml.FXML
    private TextField timeSlotTF;
    @javafx.fxml.FXML
    private TextField growthStageTF;
    @javafx.fxml.FXML
    private TextField feedTypeTF;
    @javafx.fxml.FXML
    private ComboBox pondCB;
    @javafx.fxml.FXML
    private TextField quantityTF;
    @javafx.fxml.FXML
    private TableView feedScheduleSumTV;
    @javafx.fxml.FXML
    private TableColumn feedTypeCol;
    @javafx.fxml.FXML
    private TableColumn timeSlotCol;
    @javafx.fxml.FXML
    private TableColumn pondCol;
    @javafx.fxml.FXML
    private TableColumn quantityCol;
    @javafx.fxml.FXML
    private TableColumn growthStageCol;
    @javafx.fxml.FXML
    private TableColumn fishSpeciesCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveNotifyOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void editOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void previewPlanOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void logOutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void calculateTotalFeedOA(ActionEvent actionEvent) {
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