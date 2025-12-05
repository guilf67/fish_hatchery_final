package com.example.fish_hatchery_final.faisal;

import com.example.fish_hatchery_final.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class staffdutiesController
{
    @javafx.fxml.FXML
    private TableColumn<StaffDuties,String> shiftCol;
    @javafx.fxml.FXML
    private TableView<StaffDuties> allocationTable;
    @javafx.fxml.FXML
    private TableColumn<StaffDuties, String> taskCol;
    @javafx.fxml.FXML
    private ComboBox<String> staffCB;
    @javafx.fxml.FXML
    private ComboBox<String> taskCB;
    @javafx.fxml.FXML
    private TableColumn<StaffDuties,String> staffCol;
    @javafx.fxml.FXML
    private ComboBox<String> shiftCB;
    @javafx.fxml.FXML
    private Label statusLabel;

    private final ObservableList<StaffDuties> allocationList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {


    }

    @javafx.fxml.FXML
    public void assignTaskOA(ActionEvent actionEvent) {

        staffCB.getItems().addAll("John", "Rahim", "Karim", "Salma", "Aisha");
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
        System.out.println("Returning to dashboard...");

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("faisal/dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }


    }

    @javafx.fxml.FXML
    public void notifyStaffOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveRecordsOA(ActionEvent actionEvent) {
    }
}