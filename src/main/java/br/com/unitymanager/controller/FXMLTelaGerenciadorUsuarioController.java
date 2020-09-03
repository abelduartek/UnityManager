package br.com.unitymanager.controller;

import br.com.unitymanager.dao.UsuarioDao;
import br.com.unitymanager.entity.UsuarioTabela;
import br.com.unitymanager.model.Usuario;
import br.com.unitymanager.stage.Telas;
import br.com.unitymanager.util.Constants;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class FXMLTelaGerenciadorUsuarioController implements Initializable {

    
    @FXML private Button btnAdicionar;
    @FXML private TitledPane paneInfo;
    @FXML private TitledPane titledPane;
    @FXML private TableView<Usuario> tableViewPrincipal;
    @FXML private TableColumn<Usuario, Integer> columnID;
    @FXML private TextField txtNome;
    @FXML private TextField txtCodigo;
    public static FXMLTelaCadastroUsuarioController controller;
    public Telas chamandoTelas = new Telas();
    
   
    
    @FXML
    void actionBotaoAdicionar(ActionEvent event) throws IOException {
        chamandoTelas.telaCadastroUsuario();
    }
    
    @FXML
    void actionBotaoPesquisar(ActionEvent event) {
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
