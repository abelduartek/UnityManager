package br.com.unitymanager.controller;

import br.com.unitymanager.util.Constants;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

public class FXMLTelaPrincipalController implements Initializable {
    
    @FXML private MenuItem menuCadastroOS;
    @FXML private MenuItem menuCadastroProduto;
    @FXML private MenuItem menuCadastroEmpresa;
    @FXML private MenuItem menuCadastroUsuario;
    @FXML private MenuItem menuFinanceiroEmissaoFatura;
    @FXML private MenuItem menuFinanceiroEmissaoNF;
    @FXML private MenuItem menuRelatorioMovEstoque;
    @FXML private MenuItem menuRelatorioNF;
    @FXML private MenuItem menuRelatorioOS;
    @FXML private MenuItem menuRelatorioFatura;
    @FXML private MenuItem menuUtilitarioRomaneio;
    @FXML private MenuItem menuUtilitarioAcompanhamentoOS;
    @FXML private MenuItem menuUtilitarioFaturamentoOS;
    @FXML private MenuItem menuUtilitarioSeparacaoOS;
    @FXML private MenuItem menuUtilitarioCalculadora;
    @FXML private MenuItem menuSobreVersao;
    @FXML private MenuItem menuSobreManual;
    @FXML private MenuItem menuSairDeslogar;
    @FXML private MenuItem menuSair;
    @FXML private TabPane tabPanePrincipal;
    @FXML private AnchorPane tabHome;
    @FXML public Label lblUsuario;
    @FXML private Label lblBandoDeDados;
    @FXML public Label lblData;
    @FXML private Button btnTeste;
    FontAwesomeIconView iconTabGerenciadorUsuario = new FontAwesomeIconView(FontAwesomeIcon.USER);
    
    
    @FXML
    void action(ActionEvent event) {
        
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
    
    @FXML //O método abaixo é responsável por chamar a tela de cadastro de usuário
    void actionButtonMenuCadUsuario(ActionEvent event) throws IOException {
    
    URL url = getClass().getResource(Constants.telaGerenciadorUsuarioFxml);
    Node node = FXMLLoader.load(url);
    Tab tabCadastroUsuario = new Tab();
    tabCadastroUsuario.setGraphic(iconTabGerenciadorUsuario);
    iconTabGerenciadorUsuario.setFill(Color.rgb(65,105,225));
    iconTabGerenciadorUsuario.setGlyphSize(18);
    tabCadastroUsuario.contentProperty().set(node);
    tabCadastroUsuario.setText("Gerenciador de Usuário");
    
    tabPanePrincipal.getTabs().add(tabCadastroUsuario);

    }
    
}
