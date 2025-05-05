package org.example.demo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private TextField  nameTexField;

    @FXML
    private TextField emailTexField;

    @FXML
    private TextField fonoTexField;

    @FXML
    private TextField edadTextFiled;

    @FXML
    private TextField surenameTexFile;

    private Persona persona;

//Eventos

    @FXML
    protected void onSaveBotton(ActionEvent event){
        persona = new Persona();
        persona.setNombre(nameTexField.getText());
        persona.setApellido(surenameTexFile.getText());
        persona.setEdad(edadTextFiled.getText());
        persona.getEmail(emailTexField.getText());
        persona.getTelefono(fonoTexField.getText());
    }

    @FXML
    protected void onclouseBoutton(ActionEvent event){

        Platform.exit();
    }
}

