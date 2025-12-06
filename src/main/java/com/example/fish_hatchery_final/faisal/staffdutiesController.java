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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class staffdutiesController {

    @javafx.fxml.FXML
    private ComboBox<String> staffCB;
    @javafx.fxml.FXML
    private ComboBox<String> taskCB;
    @javafx.fxml.FXML
    private ComboBox<String> shiftCB;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private TableView<StaffDuties> allocationTable;
    @javafx.fxml.FXML
    private TableColumn<StaffDuties, String> staffCol;
    @javafx.fxml.FXML
    private TableColumn<StaffDuties, String> taskCol;
    @javafx.fxml.FXML
    private TableColumn<StaffDuties, String> shiftCol;

    private final ObservableList<StaffDuties> allocationList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        staffCB.getItems().addAll("John", "Rahim", "Karim", "Salma", "Aisha");
        taskCB.getItems().addAll("Feeding", "Water Change", "Tank Cleaning", "Monitoring");
        shiftCB.getItems().addAll("Morning", "Afternoon", "Night");

        staffCol.setCellValueFactory(new PropertyValueFactory<>("staffName"));
        taskCol.setCellValueFactory(new PropertyValueFactory<>("task"));
        shiftCol.setCellValueFactory(new PropertyValueFactory<>("shift"));

        allocationTable.setItems(allocationList);
    }

    @javafx.fxml.FXML
    public void assignTaskOA(ActionEvent actionEvent) {

        String staff = staffCB.getValue();
        String task = taskCB.getValue();
        String shift = shiftCB.getValue();

        if (staff == null || task == null || shift == null) {
            statusLabel.setText("Please select staff, task and shift.");
            return;
        }

        allocationList.add(new StaffDuties(staff, task, shift));
        statusLabel.setText("Task assigned successfully.");

        staffCB.setValue(null);
        taskCB.setValue(null);
        shiftCB.setValue(null);
    }

    @javafx.fxml.FXML
    public void notifyStaffOA(ActionEvent actionEvent) {
        statusLabel.setText("Staff notified successfully.");
        System.out.println("Notification sent to all assigned staff.");
    }

    @javafx.fxml.FXML
    public void saveRecordsOA(ActionEvent actionEvent) {

        for (StaffDuties sd : allocationList) {
            System.out.println(
                    sd.getStaffName() + " - " +
                            sd.getTask() + " - " +
                            sd.getShift()
            );
        }

        statusLabel.setText("Records saved.");
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
            e.printStackTrace();
        }
    }
}