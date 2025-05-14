package org.example.tucochealquileres;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

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

    @FXML
    private Pane ventana_registroParking;

    @FXML
    private VBox cajaVertical_registroParkings;

    @FXML
    private HBox hbox_nombreParking;

    @FXML
    private Label lbl_nombre_registroParking;

    @FXML
    private TextField input_nombre_registroParkings;

    @FXML
    private HBox hbox_direccionParking;

    @FXML
    private Label lbl_direccion_registroParking;

    @FXML
    private TextField input_direccion_registroParkings;

    @FXML
    private HBox hbox_localidadParking;

    @FXML
    private Label lbl_localidad_registroParking;

    @FXML
    private TextField input_localidad_registroParkings;

    @FXML
    private HBox hbox_cpParking;

    @FXML
    private Label lbl_cp_registroParking;

    @FXML
    private TextField input_cp_registroParkings;

    @FXML
    private HBox hbox_capacidadParking;

    @FXML
    private Label lbl_capacidad_registroParking;

    @FXML
    private TextField input_capacidad_registroParkings;

    @FXML
    private HBox hbox_horarios_RegistroParking;

    @FXML
    private Label lbl_horarioPicker_RegistroParking;

    @FXML
    private HBox registroHorarioApertura_RegistroParking;

    @FXML
    private ComboBox<String> cmb_HorasDesde_RegistroParking;

    @FXML
    private ComboBox<String> cmb_MinDesde_RegistroParking;

    @FXML
    private HBox registroHorarioCierre_RegistroParking;

    @FXML
    private ComboBox<String> cmb_HorasHasta_RegistroParking;

    @FXML
    private ComboBox<String> cmb_MinHasta_RegistroParking;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        DecimalFormat df = new DecimalFormat("00");

        String numeroFormateado = "";

        ObservableList<String> horas = FXCollections.observableArrayList();
        ObservableList<String> minutos = FXCollections.observableArrayList();

        for(int i = 0; i < 24; i++){
            numeroFormateado = df.format(i);
            horas.add(numeroFormateado);
        }

        for(int i = 0; i < 60; i++){
            numeroFormateado = df.format(i);
            minutos.add(numeroFormateado);
        }

        cmb_HorasDesde_RegistroParking.setItems(horas);
        cmb_HorasHasta_RegistroParking.setItems(horas);
        cmb_MinHasta_RegistroParking.setItems(minutos);
        cmb_MinDesde_RegistroParking.setItems(minutos);
    }

}