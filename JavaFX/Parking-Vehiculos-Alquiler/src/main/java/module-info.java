module org.example.parkingvehiculosalquiler {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.parkingvehiculosalquiler to javafx.fxml;
    exports org.example.parkingvehiculosalquiler;
}