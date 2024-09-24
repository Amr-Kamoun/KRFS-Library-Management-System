module com.example.krfs {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires java.desktop;
    requires org.jetbrains.annotations;
    requires javafx.media;
//    'javafx.media'
//

    opens com.example.krfs to javafx.fxml;
    exports com.example.krfs;
    exports com.example.krfs.Classes;
    opens com.example.krfs.Classes to javafx.fxml;
}