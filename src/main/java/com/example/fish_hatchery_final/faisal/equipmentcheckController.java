package com.example.fish_hatchery_final.faisal;

import com.example.fish_hatchery_final.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class equipmentcheckController
{
    @javafx.fxml.FXML
    private TextArea issueTA;
    @javafx.fxml.FXML
    private TableColumn<EquipmentCheck, String> dueDateTC;
    @javafx.fxml.FXML
    private TableView<EquipmentCheck> equipmentTV;
    @javafx.fxml.FXML
    private TableColumn<EquipmentCheck, String> nameTC;
    @javafx.fxml.FXML
    private TableView<MaintenanceTask> maintenanceTasksTV;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceTask, String> statusTC;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceTask,String> taskTC;
    @javafx.fxml.FXML
    private TableColumn<EquipmentCheck, Integer> idTC;

    private ObservableList<EquipmentCheck> equipmentList =
            FXCollections.observableArrayList();

    private ObservableList<MaintenanceTask> taskList =
            FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        idTC.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        dueDateTC.setCellValueFactory(new PropertyValueFactory<>("dueDate"));

        equipmentTV.setItems(equipmentList);

        taskTC.setCellValueFactory(new PropertyValueFactory<>("task"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));

        maintenanceTasksTV.setItems(taskList);

        loadDummyData();  // remove later

    }
    private void loadDummyData(){
        equipmentList.addAll(
                new EquipmentCheck(1, "Water Pump A", "Working", "2025-01-15"),
                new EquipmentCheck(2, "Aerator B", "Needs Check", "2025-02-05"));

        taskList.addAll(
                new MaintenanceTask("Oil Change", "Pending"),
                new MaintenanceTask("Filter Cleaning", "Completed"));
    }



    @javafx.fxml.FXML
    public void saveReportOA(ActionEvent actionEvent) {

        String issues = issueTA.getText();
        System.out.println("Saved Report:");
        System.out.println(issues);

        issueTA.clear();
    }

    @Deprecated
    public void okOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateLogOA(ActionEvent actionEvent) {
        System.out.println("Maintenance Log Updated.");
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("faisal/aquadashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Aqua Dashboard");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }
    }
    }
