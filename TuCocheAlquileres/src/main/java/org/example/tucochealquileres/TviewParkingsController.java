package org.example.tucochealquileres;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalTime;
import java.util.ResourceBundle;

public class TviewParkingsController implements Initializable {

    @FXML
    private TableView<Parkings> tview_Parkings = new TableView<>();

    @FXML
    private TableColumn<Parkings, String> columnNombre, columnDireccion, columnCiudad, columnCP;

    @FXML
    private TableColumn<Parkings, Integer> columnId, columnCapacidad, columnDisponibles;

    @FXML
    private TableColumn<Parkings, LocalTime> columnApertura, columnCierre;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Parkings> parkings = FXCollections.observableArrayList();

        SQLAccces sqlAccces = new SQLAccces();

        parkings.addAll(sqlAccces.getListaParkings());

        tview_Parkings.setItems(parkings);


    }
}
