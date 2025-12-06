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

public class feedinventoryController
{
    @javafx.fxml.FXML
    private TableColumn availableCol;
    @javafx.fxml.FXML
    private TableColumn feedTypeCol;
    @javafx.fxml.FXML
    private TableColumn purchasedCol;
    @javafx.fxml.FXML
    private TextField feedTypeTF;
    @javafx.fxml.FXML
    private TableColumn usedCol;
    @javafx.fxml.FXML
    private TableView currentTV;
    @javafx.fxml.FXML
    private TextField supplierTF;
    @javafx.fxml.FXML
    private TextField quantityTF;
    @javafx.fxml.FXML
    private TableColumn alertCol;
    @javafx.fxml.FXML
    private ComboBox actionCB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void confirmRecordOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void recordeQtyTF(ActionEvent actionEvent) {
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
    public void recordUpdateOA(ActionEvent actionEvent) {
    }
}