
package com.example.krfs;

import com.example.krfs.Classes.Book;
import com.example.krfs.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewBooksForm implements Initializable {

    @FXML
    private TableColumn<com.example.krfs.Classes.Book,String> Book;

    @FXML
    private TableColumn<com.example.krfs.Classes.Book,Double> Price;


    @FXML
    public  TableView<Book> Table;
    @FXML
    private TableColumn<Book,String> Type;

    @FXML
    private TableColumn<Book,String> author;

    @FXML
    private Button logOutButton;
    @FXML
    private Button BorrowBook;

    @FXML
    void Borrow_Book(MouseEvent event) {

            int selectedId= Table.getSelectionModel().getSelectedIndex();
            BooksTablesTest.list.get(selectedId).setBorrowed(false);
            Table.getItems().remove(selectedId);


    }


    public  ObservableList<Book> list = FXCollections.observableArrayList( );


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
    BooksTablesTest b= new BooksTablesTest();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Book.setCellValueFactory(new PropertyValueFactory<Book,String>("BookName"));
        Type.setCellValueFactory(new PropertyValueFactory<Book,String>("type"));
        Price.setCellValueFactory(new PropertyValueFactory<Book,Double>("price"));
        author.setCellValueFactory(new PropertyValueFactory<Book,String>("author"));
        for(int i=0; i<BooksTablesTest.list.size();i++){
            if(BooksTablesTest.list.get(i).isBorrowed()) list.add(BooksTablesTest.list.get(i));
            //if(BooksTablesTest.list.)
        }

        Table.setItems(list);
    }
}




