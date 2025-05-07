module org.example.parkingvehiculosalquiler {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.parkingvehiculosalquiler to javafx.fxml;
    exports org.example.parkingvehiculosalquiler;
}