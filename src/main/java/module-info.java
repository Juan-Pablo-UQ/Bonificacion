module com.example.preparcialprueba3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.desktop;
    exports com.example.preparcialprueba3.model;
    exports com.example.preparcialprueba3.util;


    opens com.example.preparcialprueba3 to javafx.fxml;
    exports com.example.preparcialprueba3;
}