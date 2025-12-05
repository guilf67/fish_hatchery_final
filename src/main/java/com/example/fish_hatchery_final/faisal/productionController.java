package com.example.fish_hatchery_final.faisal;

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

public class productionController
{
    @javafx.fxml.FXML
    private TableColumn<Production,String> resourcesTC;
    @javafx.fxml.FXML
    private TableColumn<Production,String> healthStatusTC;
    @javafx.fxml.FXML
    private TableColumn<Production,String> tankTC;
    @javafx.fxml.FXML
    private TableColumn<Production,String> broodStockTC;
    @javafx.fxml.FXML
    private TableColumn<Production,String> targetTC;
    @javafx.fxml.FXML
    private TableView<String> productionPlanTV;
    @javafx.fxml.FXML
    private TableColumn<Production,String> pondTC;
    @javafx.fxml.FXML
    private TableColumn<Production,String> targetQuantityTC;
    @javafx.fxml.FXML
    private TableView<String> broodStockTV;
    @javafx.fxml.FXML
    private TableView<String> spawningTargetsTV;
    @javafx.fxml.FXML
    private TableColumn<Production,String> speciesTC;
    @javafx.fxml.FXML
    private TextField spawningTargetTF;
    @javafx.fxml.FXML
    private ComboBox<String> pondCB;
    @javafx.fxml.FXML
    private TableColumn<Production,String> idTC;
    @javafx.fxml.FXML
    private TableColumn<Production,String> scheduleStatusTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void allocateResourcesOA(ActionEvent actionEvent) {
    }



    @javafx.fxml.FXML
    public void addTargetOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("faisal/production.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void validateScheduleOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void notifyStaffOA(ActionEvent actionEvent) {
    }


}