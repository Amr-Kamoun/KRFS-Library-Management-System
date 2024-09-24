package com.example.krfs;

import com.example.krfs.Classes.Book;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewBorrowedBooks implements Initializable {
    @FXML
    private TableColumn<Book, String> Author;

    @FXML
    private TableColumn<Book, String> Book;

    @FXML
    private TableColumn<Book, Double> Price;

    @FXML
    private TableView<Book> Table2;

    @FXML
    private TableColumn<Book,String> Type;

    @FXML
    private Button logOutButton;
    public static ObservableList<Book> list2 = FXCollections.observableArrayList();

    @FXML
    void logOutButtonClicked(MouseEvent event) throws IOException {
        Stage stage= (Stage) this.logOutButton.getScene().getWindow();
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("UserLogin.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load());
        stage.setTitle("KRFS");
        stage.setScene(scene2);
        stage.setResizable(false);
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Book.setCellValueFactory(new PropertyValueFactory<Book,String>("BookName"));
        Type.setCellValueFactory(new PropertyValueFactory<Book,String>("type"));
        Price.setCellValueFactory(new PropertyValueFactory<Book,Double>("price"));
        Author.setCellValueFactory(new PropertyValueFactory<Book,String>("author"));
        for(int i=0; i<BooksTablesTest.list.size();i++){
            if(!BooksTablesTest.list.get(i).isBorrowed()) list2.add(BooksTablesTest.list.get(i));
            //if(BooksTablesTest.list.)
        }

        Table2.setItems(list2);
    }

    @FXML
    void ReturnBookButtonClicked(MouseEvent event) {
        int selectedId= Table2.getSelectionModel().getSelectedIndex();
        BooksTablesTest.list.get(selectedId).setBorrowed(true);
        Table2.getItems().remove(selectedId);




    }

}