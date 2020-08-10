package br.com.unitymanager.controller;

import br.com.unitymanager.dao.UsuarioDao;
import br.com.unitymanager.util.Constants;
import br.com.unitymanager.util.DataSistema;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class FXMLTelaLoginController implements Initializable {
    
    //As linhas abaixo são objetos da Tela de Login
    @FXML private VBox vboxPrincipal;
    @FXML private Pane paneCabecalho;
    @FXML private Label lblTItuloEmpresa;
    @FXML public JFXTextField txtUsuario;
    @FXML private JFXPasswordField txtSenha;
    @FXML private Label lblEsqueciMinhaSenha;
    @FXML private JFXButton btnEntrar;
    @FXML private JFXButton btnSair;
    @FXML private TextField teste;
    
    //As linhas abaixo são as instancias de Objetos
    public static FXMLTelaPrincipalController controller;
    public static DataSistema dataSistema = new DataSistema();
    
   
    @FXML
    void actionButtonEntrar(ActionEvent event) throws IOException {
    	logar();
    	
    }
    
    @FXML
    void actionButtonSair(ActionEvent event) {
    	System.exit(0);
    }
    
    private void logar() throws IOException{

        UsuarioDao dao = new UsuarioDao(); //Criando objeto da classe UsuarioDao
        String usuarioTeste = txtUsuario.getText(); //Armazenando as informações do campo de login na área de login
        String senhaTeste = txtSenha.getText(); //Armazenando as informações do campo de senha na área de login
      
        
        if(dao.login(usuarioTeste, senhaTeste)) //Autenticação de usuário e senha
        {
            
            
            //As linhas abaixo são responsáveis por capturar o Stage atual(Tela de Login) e fecha-lá
            Stage telaLogin = (Stage) btnEntrar.getScene().getWindow(); 
            telaLogin.close();
            
            //As linhas abaixo são responsáveis por chamar a Tela principal e definem o controller da scene
            Stage telaPrincipal = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader();
            Parent root = fxmlLoader.load(getClass().getResource(Constants.telaPrincipalFxml).openStream()); //Carregando o FXMLTelaPrincipal.fxml
            controller = (FXMLTelaPrincipalController) fxmlLoader.getController(); //Definindo o controller da scene(FXMLTelaPrincipalController.java)
	    Image applicationIcon = new Image(getClass().getResourceAsStream(Constants.iconeUnityManager));
	    telaPrincipal.getIcons().add(applicationIcon);
	    telaPrincipal.setTitle(Constants.tituloTelaPrincipal);
            Scene scene = new Scene(root);
            scene.getStylesheets().add(Constants.telaPrincipalCss);
            telaPrincipal.setScene(scene);
            controller.lblData.setText(dataSistema.dataAtual());
            controller.lblUsuario.setText(dao.usuarioLogado());
            telaPrincipal.show();
        	
        }else {
        	
        	JOptionPane.showMessageDialog(null, "Usuário Inexistente!");
        }
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
