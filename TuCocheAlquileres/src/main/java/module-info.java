module org.example.tucochealquileres {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires java.desktop;

    opens org.example.tucochealquileres to javafx.fxml;
    exports org.example.tucochealquileres;
}
