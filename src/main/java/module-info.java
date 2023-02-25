module com.example.dreambank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.example.dreambank to javafx.fxml;
    exports com.example.dreambank;
    exports com.example.dreambank.Controllers;
    exports com.example.dreambank.Controllers.Admin;
    exports com.example.dreambank.Controllers.Client;
    exports com.example.dreambank.Models;
    exports com.example.dreambank.Views;
}