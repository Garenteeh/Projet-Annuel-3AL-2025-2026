module org.esgi.appjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.esgi.appjava to javafx.fxml;
    exports org.esgi.appjava;
}