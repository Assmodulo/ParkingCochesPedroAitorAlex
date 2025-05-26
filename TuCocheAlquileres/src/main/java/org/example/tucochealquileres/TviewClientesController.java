package org.example.tucochealquileres;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


import java.awt.*;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class TviewClientesController {


    @FXML
    private Pane ventana_registroClientes;

    @FXML
    private VBox cajaVertical_registroClientes;

    @FXML
    private HBox hbox_nombreClientes;

    @FXML
    private Label lbl_nombre_registroClientes;

    @FXML
    private TextField input_nombre_registroClientes;

    @FXML
    private HBox hbox_apellidoClientes;

    @FXML
    private Label lbl_apellido_registroClientes;

    @FXML
    private TextField input_apellidos_registroClientes;

    @FXML
    private HBox hbox_telefonoClientes;

    @FXML
    private Label lbl_telefono_registroClientes;

    @FXML
    private TextField input_telefono_registroClientes;

    @FXML
    private HBox hbox_dniClientes;

    @FXML
    private Label lbl_dni_registroClientes;

    @FXML
    private TextField input_dni_registroClientes;

    @FXML
    private HBox hbox_emailClientes;

    @FXML
    private Label lbl_email_registroClientes;

    @FXML
    private TextField input_email_registroClientes;

    @FXML
    private HBox hbox_ciudadClientes;

    @FXML
    private Label lbl_ciudad_registroClientes;

    @FXML
    private TextField input_ciudad_registroClientes;

    @FXML
    private HBox hbox_cpClientes;

    @FXML
    private Label lbl_cp_registroClientes;

    @FXML
    private TextField input_cp_registroClientes;

    @FXML
    private HBox hbox_direccionClientes;

    @FXML
    private Label lbl_direccion_registroClientes;

    @FXML
    private TextField input_direccion_registroClientes;

    @FXML
    private HBox registroFNacimiento_RegistroClientes;

    @FXML
    private Label lbl_registroFNacimiento_RegistroClientes;

    @FXML
    private ComboBox cmb_diaNacimiento_RegistroClientes;

    @FXML
    private ComboBox cmb_mesNacimiento_RegistroClientes;
    
    @FXML
    private ComboBox cmb_anioNacimiento_RegistroClientes;

    @FXML
    private DatePicker DatePicker_FechaNacimiento_registroClientes;



    public void initialize(URL url, ResourceBundle resourceBundle) {



    }
}
