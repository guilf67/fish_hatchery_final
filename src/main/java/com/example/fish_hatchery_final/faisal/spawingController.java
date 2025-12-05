package com.example.fish_hatchery_final.faisal;

import com.example.fish_hatchery_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class spawingController
{
    @javafx.fxml.FXML
    private TableColumn broodStockTC;
    @javafx.fxml.FXML
    private TableColumn tankTC;
    @javafx.fxml.FXML
    private TableView PrepTV;
    @javafx.fxml.FXML
    private TextField eggCountTF;
    @javafx.fxml.FXML
    private TextArea hatchingNoteTA;
    @javafx.fxml.FXML
    private TableColumn equipmentTC;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private TableView spawningScheduleTV;

    @javafx.fxml.FXML
    public void initialize() {
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


    @javafx.fxml.FXML
    public void recordDataOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveHatchingOA(ActionEvent actionEvent) {
    }
}