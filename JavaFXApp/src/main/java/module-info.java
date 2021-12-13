module com.topyunp.javafxapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.topyunp.javafxapp to javafx.fxml;
    exports com.topyunp.javafxapp;
}