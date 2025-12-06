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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class spawingController {

    @javafx.fxml.FXML
    private TableColumn<Spawing, String> broodStockTC;
    @javafx.fxml.FXML
    private TableColumn<Spawing, String> tankTC;
    @javafx.fxml.FXML
    private TableColumn<Spawing, String> equipmentTC;
    @javafx.fxml.FXML
    private TableColumn<Spawing, String> dateTC;
    @javafx.fxml.FXML
    private TableView<Spawing> PrepTV;
    @javafx.fxml.FXML
    private TableView<Spawing> spawningScheduleTV;
    @javafx.fxml.FXML
    private TextField eggCountTF;
    @javafx.fxml.FXML
    private TextArea hatchingNoteTA;

    private final ObservableList<Spawing> spawningList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        broodStockTC.setCellValueFactory(new PropertyValueFactory<>("broodStock"));
        tankTC.setCellValueFactory(new PropertyValueFactory<>("tank"));
        equipmentTC.setCellValueFactory(new PropertyValueFactory<>("equipment"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));

        PrepTV.setItems(spawningList);
        spawningScheduleTV.setItems(spawningList);

        spawningList.add(new Spawing("Batch A", "Tank 1", "Incubator", "2025-01-15", "0", ""));
    }

    @javafx.fxml.FXML
    public void recordDataOA(ActionEvent actionEvent) {

        String eggs = eggCountTF.getText();
        String note = hatchingNoteTA.getText();

        if (eggs == null || eggs.isEmpty()) return;

        spawningList.add(new Spawing(
                "Batch X",
                "Tank 2",
                "Heater",
                java.time.LocalDate.now().toString(),
                eggs,
                note
        ));

        eggCountTF.clear();
        hatchingNoteTA.clear();
    }

    @javafx.fxml.FXML
    public void saveHatchingOA(ActionEvent actionEvent) {

        for (Spawing s : spawningList) {
            System.out.println(
                    s.getBroodStock() + " | " +
                            s.getTank() + " | " +
                            s.getEggCount()
            );
        }
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
            e.printStackTrace();
        }
    }
}