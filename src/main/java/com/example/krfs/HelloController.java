package com.example.krfs;

import com.example.krfs.Classes.Loader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

//import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.jar.Attributes;

public class HelloController {
    @FXML
    private TextField welcomeText;

    @FXML
    private TextField password;



    @FXML
    private Button Login;

    @FXML
    void enterPressed(KeyEvent event) throws IOException {
        if(event.getCode().toString().equals("ENTER"))
        {
            Stage stage = (Stage) this.Login.getScene().getWindow();
            FXMLLoader fxmlLoader2;
            if(Loader.IsAdmin(welcomeText.getText(),password.getText()))
            {

                fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("AdminLogin.fxml"));
                Scene scene = new Scene(fxmlLoader2.load());
                stage.setTitle("KRFS");
                stage.setScene(scene);

            }
            else if(Loader.IsUser(welcomeText.getText(),password.getText())) {
                fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("UserLogin.fxml"));
                Scene scene = new Scene(fxmlLoader2.load());
                stage.setTitle("KRFS");
                stage.setScene(scene);
            }
            else {
                fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("Error.fxml"));
                Scene scene = new Scene(fxmlLoader2.load());
                stage.setTitle("KRFS");
                stage.setScene(scene);
            }

            stage.show();
        }
    }


    @FXML
    void goNext(MouseEvent event) throws IOException {

        Stage stage = (Stage) this.Login.getScene().getWindow();
        FXMLLoader fxmlLoader2;
        if(Loader.IsAdmin(welcomeText.getText(),password.getText()))
        {
            fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("AdminLogin.fxml"));
        Scene scene = new Scene(fxmlLoader2.load());
        stage.setTitle("KRFS");
        stage.setScene(scene);

        }
        else if(Loader.IsUser(welcomeText.getText(),password.getText())) {
            fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("UserLogin.fxml"));
            Scene scene = new Scene(fxmlLoader2.load());
            stage.setTitle("KRFS");
            stage.setScene(scene);
        }
        else {
            fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("Error.fxml"));
            Scene scene = new Scene(fxmlLoader2.load());
            stage.setTitle("404 ;)");
            stage.setScene(scene);
        }

        stage.setResizable(false);
        stage.show();

    }

}