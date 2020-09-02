package br.com.unitymanager.controller;

import br.com.unitymanager.combobox.ComboBoxString;
import br.com.unitymanager.combobox.DadosComboBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;


public class FXMLTelaGerenciadorOSController implements Initializable {

    @FXML private ComboBox<ComboBoxString> cbTipoOS;
    @FXML private ComboBox<ComboBoxString> cbStatusOS;
    DadosComboBox dadosCbTipoOS = new DadosComboBox();
    
    
    private void setandoCamposComboBox(){
        
        //Setando campos do combo box tipo de OS
        for(ComboBoxString comboTipo : dadosCbTipoOS.dadosComboBoxTipoOS()){
        cbTipoOS.getItems().add(comboTipo);
        }
        
        //Setando campos do combo box Status OS
        for(ComboBoxString comboStatus : dadosCbTipoOS.dadosComboBoxStatusOS()){
        cbStatusOS.getItems().add(comboStatus);
        }
    }
    @FXML
    void actionButtonPesquisar(ActionEvent event) {
        System.out.println(cbTipoOS.getValue());
        System.out.println(cbStatusOS.getValue());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setandoCamposComboBox();  
    }    
    
}
