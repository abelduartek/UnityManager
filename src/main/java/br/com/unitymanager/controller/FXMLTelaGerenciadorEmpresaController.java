/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unitymanager.controller;

import br.com.unitymanager.stage.Telas;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Abel
 */
public class FXMLTelaGerenciadorEmpresaController implements Initializable {
    public Telas chamarTelas = new Telas();
    
    @FXML
    void actionButtonCadastrarCliente(ActionEvent event) throws IOException {
        chamarTelas.telaCadastroCliente();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
