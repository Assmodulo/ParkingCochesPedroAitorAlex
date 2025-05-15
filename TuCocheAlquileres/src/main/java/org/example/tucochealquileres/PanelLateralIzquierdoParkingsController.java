package org.example.tucochealquileres;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class PanelLateralIzquierdoParkingsController {


    private ventanaPrincipalController ventanaPrincipalController;

    @FXML
    public void mostrarVentanaRegistro() throws IOException {
        ventanaPrincipalController v = new ventanaPrincipalController();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ventanaRegistroParkings.fxml"));
        Pane ventanaCentral = loader.load();
        ventanaPrincipalController.getMenu_principal().setCenter(ventanaCentral);

    }

    public void setVentanaPrincipalController(ventanaPrincipalController ventanaPrincipalController) {
        this.ventanaPrincipalController = ventanaPrincipalController;
    }
}
