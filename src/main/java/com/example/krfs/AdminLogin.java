
package com.example.krfs;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;

public class AdminLogin {

    @FXML
    private Button Add_Remove_employee;

    @FXML
    private Button Add_or_Remove_Book;

    @FXML
    private Button View_Books;

    @FXML
    private Button logOutButton;

    @FXML
    void AR_BookClicked(MouseEvent event) throws IOException {
        Stage stage= (Stage) this.logOutButton.getScene().getWindow();
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("AR_Admin.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load());
        stage.setTitle("KRFS");
        stage.setScene(scene2);
        stage.show();

    }

    @FXML
    void AR_EmployeeClicked(MouseEvent event) throws IOException {
        Stage stage= (Stage) this.logOutButton.getScene().getWindow();
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("AR_Employee.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load());
        stage.setTitle("KRFS");
        stage.setScene(scene2);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    void ViewBooksClicked(MouseEvent event) throws IOException {


        Stage stage= (Stage) this.logOutButton.getScene().getWindow();
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("ViewBooksAdmin.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load());
        stage.setTitle("KRFS");
        stage.setScene(scene2);
        stage.show();



    }

    @FXML
    void logOutButtonClicked(MouseEvent event) throws IOException {
        Stage stage= (Stage) this.logOutButton.getScene().getWindow();
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("Home.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load());
        stage.setTitle("KRFS");
        stage.setScene(scene2);
        stage.show();

    }

}
