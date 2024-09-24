package com.example.krfs;

import com.example.krfs.Classes.Book;
import com.example.krfs.Classes.DB_Library;
import com.example.krfs.Classes.Person;
import com.example.krfs.Classes.User;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

//import java.awt.*;
import javafx.scene.control.TextField;
import javafx.util.Callback;

import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Vector;

public class AREmployee  implements Initializable {
    String query;
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    User user;

    @FXML
     TextField email;
    @FXML
    private TextField passkey;

    @FXML
    private Button AddEmployee;



    @FXML
    private Button RemoveEmployee;


    @FXML
    private TableColumn<Person, Boolean> isAdmin;

    @FXML
    private CheckBox isAdminCheck;

    @FXML
    private Button logOutButton;

    @FXML
    private TableColumn<Person, String> password;

    @FXML
    private TableColumn<Person, String> username;

    @FXML
    private TableView<Person> users;

    public AREmployee() throws SQLException {
    }








    @FXML
    void RemoveClicked(MouseEvent event) {
        int selectedId= users.getSelectionModel().getSelectedIndex();
        users.getItems().remove(selectedId);

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



    int y=0;
    private ArrayList<String> loadNames() throws SQLException {
        int x=1;

        //private ArrayList<String> loadNames() throws SQLException {
        ArrayList<String>  names = new ArrayList<>();
        //names.add("alo");

        Connection  connection= DriverManager.getConnection(String.format("jdbc:mysql://localhost:3306/db_library"),"root","");
        String query= "SELECT * FROM Users";
        try{
            Statement statement = connection.createStatement();
            ResultSet queryOutput = statement.executeQuery(query);

            while(queryOutput.next()){
                //System.out.println(x);
                //System.out.println(queryOutput.getString(x));
                names.add(queryOutput.getString(x));
                y++;
                //x++;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return names;
    }
    ArrayList<String> names= loadNames();




    ObservableList<Person> list = FXCollections.observableArrayList(

            new Person(loadNames().get(0),"1234",true),
            new Person(loadNames().get(1),"5678"),
            new Person(loadNames().get(2),"2468"),
            new Person(loadNames().get(3),"01099090110")


    );


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        try {
//            loadList();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        //names.add("a");

        username.setCellValueFactory(new PropertyValueFactory<Person,String>("name"));
        password.setCellValueFactory(new PropertyValueFactory<Person,String>("Pass"));
//        isAdmin.setCellValueFactory(new PropertyValueFactory<Person,Boolean>("isAdmin"));

        users.setItems(list);
    }
    @FXML
    void AddEmployeeClicked(MouseEvent event) {
        Person person = new Person(email.getText(),
                passkey.getText(),
                isAdminCheck.isSelected());
        //list.add(person);

        ObservableList<Person> persons = users.getItems();
        persons.add(person);
        users.setItems(persons);

//
    }}



