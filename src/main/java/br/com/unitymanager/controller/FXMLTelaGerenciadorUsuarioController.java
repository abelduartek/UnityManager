package br.com.unitymanager.controller;

import br.com.unitymanager.tabela.UsuarioTabela;
import br.com.unitymanager.util.Constants;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class FXMLTelaGerenciadorUsuarioController implements Initializable {

    
    @FXML private Button btnAdicionar;
    @FXML private TitledPane paneInfo;
    @FXML private TitledPane titledPane;
    @FXML private TableView<UsuarioTabela> tableViewPrincipal;
    @FXML private TableColumn<UsuarioTabela, Integer> columnID;
    @FXML private TableColumn<UsuarioTabela, String> columnCPF;
    @FXML private TableColumn<UsuarioTabela, String> columnLogin;
    @FXML private TableColumn<UsuarioTabela, String> columnNome;
    @FXML private TableColumn<UsuarioTabela, String> columnTelefone;
    @FXML private TableColumn<UsuarioTabela, String> columnEmail;
    public static FXMLTelaCadastroUsuarioController controller;
    
    
   
    @FXML
    void actionBotaoAdicionar(ActionEvent event) throws IOException {
            
            //As linhas abaixo são responsáveis por chamar a Tela principal e definem o controller da scene
            Stage telaCadastroAdicionarUsuario = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader();
            
            Parent root = fxmlLoader.load(getClass().getResource("/fxml/FXMLTelaCadastroUsuario.fxml").openStream()); 
            controller = (FXMLTelaCadastroUsuarioController) fxmlLoader.getController();
	    Image applicationIcon = new Image(getClass().getResourceAsStream(Constants.iconeUnityManager));
            
            //As linhas abaixo são responsáveis pelas configurações da janela cadastro usuário
            telaCadastroAdicionarUsuario.setResizable(false);
	    telaCadastroAdicionarUsuario.getIcons().add(applicationIcon);
	    telaCadastroAdicionarUsuario.setTitle(Constants.tituloTelaCadastroUsuario);
            Scene scene = new Scene(root);
            scene.getStylesheets().add(Constants.telaCadastroUsuarioCss);
            telaCadastroAdicionarUsuario.setScene(scene);
            telaCadastroAdicionarUsuario.show();
        
    }
    
    @FXML
    void actionBotaoPesquisar(ActionEvent event) {

    }
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
