package com.example.preparcialprueba3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    public TextField textFieldContreseña;
    @FXML
    public TextField textFieldUsuario;
    @FXML
    private Label welcomeText;

    @FXML

    public void valiarCaracteres(){
        ResourceBundle resourceBundle;

        resourceBundle = ResourceBundle.getBundle("InicioSesion");
        String usuario=resourceBundle.getString("Usuario");
        String usuario2=resourceBundle.getString("Contresenio");
        if(textFieldUsuario.getText().equals(usuario) && textFieldContreseña.getText().equals(usuario2)){
            JOptionPane.showMessageDialog(null,"usuario Encontrado");
        }else{
            JOptionPane.showMessageDialog(null,"usuario no encomtrado");

        }


    }
}