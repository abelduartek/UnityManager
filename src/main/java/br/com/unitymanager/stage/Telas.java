package br.com.unitymanager.stage;

import br.com.unitymanager.controller.*;
import br.com.unitymanager.dao.UsuarioDao;
import br.com.unitymanager.util.Constants;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Telas {
    
   public FXMLTelaGerenciadorEmpresaController controllerTelaGerenciadorEmpresa;
   public FXMLTelaCadastroUsuarioController controllerTelaCadastoUsuario;
   public FXMLTelaPrincipalController controllerTelaPrincipal;
   public FXMLTelaCadastroClienteController controllerTelaCadastroCliente;
   UsuarioDao usuarioDao = new UsuarioDao();
   
    public Stage telaCadastroCliente() throws IOException{
        
            Stage telaCadastroCliente = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader();
            
            Parent root = fxmlLoader.load(getClass().getResource(Constants.telaCadastroClienteFxml).openStream()); 
            controllerTelaCadastroCliente = (FXMLTelaCadastroClienteController) fxmlLoader.getController();
	    Image applicationIcon = new Image(getClass().getResourceAsStream(Constants.iconeUnityManager));
            
            telaCadastroCliente.setResizable(false);
	    telaCadastroCliente.getIcons().add(applicationIcon);
	    telaCadastroCliente.setTitle(Constants.tituloTelaCadastroCliente);
            Scene scene = new Scene(root);
            scene.getStylesheets().add(Constants.telaCadastroClienteCss);
            telaCadastroCliente.setScene(scene);
            telaCadastroCliente.show();
            
            return telaCadastroCliente;
    }
    
    public Stage telaGerenciadorEmpresa() throws IOException{
           
            Stage telaGerenciadorEmpresa = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader();
            
            Parent root = fxmlLoader.load(getClass().getResource(Constants.telaGerenciadorEmpresaFxml).openStream()); 
            controllerTelaGerenciadorEmpresa = (FXMLTelaGerenciadorEmpresaController) fxmlLoader.getController();
	    Image applicationIcon = new Image(getClass().getResourceAsStream(Constants.iconeUnityManager));
            
            telaGerenciadorEmpresa.setResizable(false);
	    telaGerenciadorEmpresa.getIcons().add(applicationIcon);
	    telaGerenciadorEmpresa.setTitle(Constants.tituloTelaGerenciadorEmpresa);
            Scene scene = new Scene(root);
            scene.getStylesheets().add(Constants.telaGerenciadorEmpresaCss);
            telaGerenciadorEmpresa.setScene(scene);
            telaGerenciadorEmpresa.show();
            
            return telaGerenciadorEmpresa;
    }
    
    public Stage telaCadastroUsuario() throws IOException{
           
            Stage telaCadastroAdicionarUsuario = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader();
            
            Parent root = fxmlLoader.load(getClass().getResource(Constants.telaCadastroUsuarioFxml).openStream()); 
            controllerTelaCadastoUsuario = (FXMLTelaCadastroUsuarioController) fxmlLoader.getController();
	    Image applicationIcon = new Image(getClass().getResourceAsStream(Constants.iconeUnityManager));
            
            telaCadastroAdicionarUsuario.setResizable(false);
	    telaCadastroAdicionarUsuario.getIcons().add(applicationIcon);
	    telaCadastroAdicionarUsuario.setTitle(Constants.tituloTelaCadastroUsuario);
            Scene scene = new Scene(root);
            scene.getStylesheets().add(Constants.telaCadastroUsuarioCss);
            telaCadastroAdicionarUsuario.setScene(scene);
            telaCadastroAdicionarUsuario.show();
            
            return telaCadastroAdicionarUsuario;
    }
    
    public Stage telaPrincipal() throws IOException{
            
            //As linhas abaixo são responsáveis por chamar a Tela principal e definem o controller da scene
            Stage telaPrincipal = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader();
            Parent root = fxmlLoader.load(getClass().getResource(Constants.telaPrincipalFxml).openStream()); //Carregando o FXMLTelaPrincipal.fxml
            controllerTelaPrincipal= (FXMLTelaPrincipalController) fxmlLoader.getController(); //Definindo o controller da scene(FXMLTelaPrincipalController.java)
	    Image applicationIcon = new Image(getClass().getResourceAsStream(Constants.iconeUnityManager));
	    telaPrincipal.getIcons().add(applicationIcon);
	    telaPrincipal.setTitle(Constants.tituloTelaPrincipal);
            Scene scene = new Scene(root);
            scene.getStylesheets().add(Constants.telaPrincipalCss);
            telaPrincipal.setScene(scene);
            telaPrincipal.show();
            
            return telaPrincipal;
    
    }
}
