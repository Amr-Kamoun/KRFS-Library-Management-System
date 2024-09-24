package com.example.krfs;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ErrorController {
    @FXML
    private Button GoBackButton;

    @FXML
    void GoBackClicked(MouseEvent event) throws IOException {

        Stage stage = (Stage) this.GoBackButton.getScene().getWindow();
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("Home.fxml"));
        Scene scene = new Scene(fxmlLoader2.load());
        stage.setTitle("KRFS");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
