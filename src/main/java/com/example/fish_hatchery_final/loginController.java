package com.example.fish_hatchery_final;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class loginController {

    @FXML
    private TextField passwordBox;
    @FXML
    private TextField usernameBox;
    @FXML
    private Label massageLabel;

    @FXML
    public void onLogin(ActionEvent actionEvent) throws IOException {
        String username = usernameBox.getText();
        String password = passwordBox.getText();

        if ("Hatcherymanager".equals(username) && "faisal".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("faisal/dashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if ("Aquatec".equals(username) && "faisal".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("faisal/aquadashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
           stage.show();
        
        } else {
            massageLabel.setText("Incorrect username or password. Please try again.");
        }
    }
}
