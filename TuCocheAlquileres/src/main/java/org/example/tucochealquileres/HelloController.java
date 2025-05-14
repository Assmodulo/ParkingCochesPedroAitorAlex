package org.example.tucochealquileres;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;


import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private BorderPane menu_principal;

    @FXML
    private HBox barra_superior;

    @FXML
    private Button btn_parkings;

    @FXML
    private TilePane menu_parkings;

    @FXML
    private Button btn_registroParking;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }



    @FXML
    public void mostrarVentanaRegistro() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ventanaRegistroParkings.fxml"));
        Pane ventanaCentral = loader.load();
        menu_principal.setCenter(ventanaCentral);
    }

}