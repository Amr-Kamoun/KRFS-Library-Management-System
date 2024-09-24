
package com.example.krfs;

import com.example.krfs.Classes.Book;
import com.example.krfs.Classes.Loader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewBooksAdmin implements Initializable {
    @FXML
    private TextField NewAuthor;

    @FXML
    private TextField NewName;

    @FXML
    private TextField NewPrice;

    @FXML
    private TextField NewType;

    @FXML
    private TableColumn<com.example.krfs.Classes.Book,String> Book;

    @FXML
    private TableColumn<Book,Double> Price;

    @FXML
    private  TableView<Book> Table  ;
    @FXML
    private TableColumn<Book,String> Type;

    @FXML
    private TableColumn<Book,String> author;

    @FXML
    private Button logOutButton;
    @FXML
    private Button AddButton;
    @FXML
    private Button RemoveButton;



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


    @FXML
    void AddButtonClicked(MouseEvent event) {
        //            new Book ("aa", 555, "","fouad"),
        Book book = new Book( NewName.getText(),
           Integer.parseInt(NewPrice.getText()),
                NewType.getText(),
                NewAuthor.getText());
        ObservableList<Book> books= Table.getItems();
        books.add(book);
        Table.setItems(books);
        Loader.list=books;


    }
    @FXML
    void RemoveButtonClicked(MouseEvent event) {
        int selectedId= Table.getSelectionModel().getSelectedIndex();
        Table.getItems().remove(selectedId);

    }


    ObservableList<Book> list = FXCollections.observableArrayList(

            new Book ("aa", 555, "","fouad"),
            new Book ("aaaa", 5555555, " kamoun Fashel","fouad"),
            new Book ("aaaaa", 5555555, " yasmin","fouad")

    );
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Book.setCellValueFactory(new PropertyValueFactory<Book,String>("BookName"));
        Type.setCellValueFactory(new PropertyValueFactory<Book,String>("type"));
        Price.setCellValueFactory(new PropertyValueFactory<Book,Double>("price"));
        author.setCellValueFactory(new PropertyValueFactory<Book,String>("author"));

        Table.setItems(Loader.list);
    }
}




