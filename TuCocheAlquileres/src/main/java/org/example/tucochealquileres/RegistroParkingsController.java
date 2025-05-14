package org.example.tucochealquileres;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class RegistroParkingsController implements Initializable {

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

    @FXML
    private HBox botonera_RegistroParkings;

    @FXML
    private Button botonGuardar_RegistroParking;

    @FXML
    private Button botonAtras_RegistroParkings;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<String> minutos = cargarMinutos();
        ObservableList<String> horas = cargarHoras();

        //Aquí cargamos los comboBox con los datos almacenados en las dos ObservableList que hemos creado. Horas desde la
        //00 hasta la 23 y minutos desde el 00 hasta el 59
        cmb_HorasDesde_RegistroParking.setItems(horas);
        cmb_HorasHasta_RegistroParking.setItems(horas);
        cmb_MinHasta_RegistroParking.setItems(minutos);
        cmb_MinDesde_RegistroParking.setItems(minutos);
    }

    /**
     * Este método está aquí para no cargar demasiado el método initialize. Lo que hace es devolver una colección
     * que va a cargar los comboBox de la ventana de registro de parking.
     * @return Una ObservableList con los resultados que necesitamos para cargar las horas
     */
    private ObservableList<String> cargarHoras(){

        DecimalFormat df = new DecimalFormat("00");

        String numeroFormateado = "";

        ObservableList<String> horas = FXCollections.observableArrayList();

        for(int i = 0; i < 24; i++){
            numeroFormateado = df.format(i);
            horas.add(numeroFormateado);
        }

        return horas;
    }

    private ObservableList<String> cargarMinutos(){
        DecimalFormat df = new DecimalFormat("00");
        String numeroFormateado = "";
        ObservableList<String> minutos = FXCollections.observableArrayList();
        for(int i = 0; i < 60; i++){
            numeroFormateado = df.format(i);
            minutos.add(numeroFormateado);
        }

        return minutos;
    }
}
