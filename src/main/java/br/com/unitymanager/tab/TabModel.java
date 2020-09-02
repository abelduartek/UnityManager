package br.com.unitymanager.tab;

import br.com.unitymanager.util.Constants;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.paint.Color;

public class TabModel {
    
    FontAwesomeIconView iconTabGerenciadorUsuario = new FontAwesomeIconView(FontAwesomeIcon.USER);
    FontAwesomeIconView iconTabGerenciadorOS = new FontAwesomeIconView(FontAwesomeIcon.FILE_TEXT);
    
    public Tab tabTelaGerenciadorUsuario() throws IOException{
        
        URL url = getClass().getResource(Constants.telaGerenciadorUsuarioFxml);
        Node node = FXMLLoader.load(url);
        Tab tabGerenciadorUsuario = new Tab();
        tabGerenciadorUsuario.setGraphic(iconTabGerenciadorUsuario);
        iconTabGerenciadorUsuario.setFill(Color.rgb(65,105,225));
        iconTabGerenciadorUsuario.setGlyphSize(18);
        tabGerenciadorUsuario.contentProperty().set(node);
        tabGerenciadorUsuario.setText("Gerenciador de Usuário");
    
        return tabGerenciadorUsuario;
    
    }
    
    public Tab tabTelaGerenciadorOS() throws IOException{
        
        URL url = getClass().getResource(Constants.telaGerenciadorOSFxml);
        Node node = FXMLLoader.load(url);
        Tab tabGerenciadoOS = new Tab();
        tabGerenciadoOS.setGraphic(iconTabGerenciadorOS);
        iconTabGerenciadorOS.setFill(Color.rgb(65,105,225));
        iconTabGerenciadorOS.setGlyphSize(18);
        tabGerenciadoOS.contentProperty().set(node);
        tabGerenciadoOS.setText("Gerenciador de Ordem de Serviço");
    
        return tabGerenciadoOS;
    
    }
    
}
