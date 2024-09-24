package com.example.krfs;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ARAdmin {

    @FXML
    private Button Add_Remove_employee;

    @FXML
    private Button Add_Remove_employee1;

    @FXML
    private Button logOutButton;

    @FXML
    void ViewBooksClicked(MouseEvent event) {

    }

    @FXML
    void logOutButtonClicked(MouseEvent event) throws IOException {
        Stage stage= (Stage) this.logOutButton.getScene().getWindow();
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("AdminLogin.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load());
        stage.setTitle("KRFS");
        stage.setScene(scene2);
        stage.setResizable(false);
        stage.show();

    }

}
