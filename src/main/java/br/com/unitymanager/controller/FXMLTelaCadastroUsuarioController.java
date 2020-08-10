package br.com.unitymanager.controller;

import br.com.unitymanager.dao.UsuarioDao;
import br.com.unitymanager.model.Usuario;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;


public class FXMLTelaCadastroUsuarioController implements Initializable {

    @FXML private TextField txtNome;
    @FXML private TextField txtSobrenome;
    @FXML private TextField txtIdade;
    @FXML private TextField txtDataNascimento;
    @FXML private TextField txtEstadoCivil;
    @FXML private TextField txtCPF;
    @FXML private TextField txtRG;
    @FXML private TextField txtId;
    @FXML private TextField txtUsuario;
    @FXML private TextField txtSenha;
    @FXML private TextField txtPerfil;
    @FXML private TextField txtSetor;
    @FXML private TextField txtCargo;
    @FXML private TextField txtEmail;
    @FXML private TextField txtTelefone;
    @FXML private TextField txtCelular;
    @FXML private TextField txtEndereco;
    @FXML private TextField txtBairro;
    @FXML private TextField txtCidade;
    @FXML private TextField txtUF;
    @FXML private Button btnAdicionar;
    @FXML private Button btnEditar;

    
    @FXML
    void actionBotaoAdicionarUsuario(ActionEvent event) {
        
        Usuario user = new Usuario();
        UsuarioDao dao = new UsuarioDao();
        
        user.setLogin(txtUsuario.getText());
        user.setSenha(txtSenha.getText());
        user.setCpf(txtCPF.getText());
        user.setRg(txtRG.getText());
        user.setNome(txtNome.getText());
        user.setSobrenome(txtSobrenome.getText());
        user.setIdade(txtIdade.getText());
        user.setDataNascimento(txtDataNascimento.getText());
        user.setEndereco(txtEndereco.getText());
        user.setBairro(txtBairro.getText());
        user.setCidade(txtCidade.getText());
        user.setUf(txtUF.getText());
        user.setCivil(txtEstadoCivil.getText());
        user.setCargo(txtCargo.getText());
        user.setEmail(txtEmail.getText());
        user.setTelefone(txtTelefone.getText());
        user.setCelular(txtCelular.getText());
        user.setSetor(txtSetor.getText());
        user.setPerfil(txtPerfil.getText());
        
        dao.adicionarUsuario(user);
        
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
        
        limparCampos();
        
        
        
    }
    @FXML
    void actionBotaoEditar(ActionEvent event) {

    }
    
    private void limparCampos(){
    
    txtNome.setText("");
    txtSobrenome.setText("");
    txtIdade.setText("");
    txtDataNascimento.setText("");
    txtEstadoCivil.setText("");
    txtCPF.setText("");
    txtRG.setText("");
    txtId.setText("");
    txtUsuario.setText("");
    txtSenha.setText("");
    txtPerfil.setText("");
    txtSetor.setText("");
    txtCargo.setText("");
    txtEmail.setText("");
    txtTelefone.setText("");
    txtCelular.setText("");
    txtEndereco.setText("");
    txtBairro.setText("");
    txtCidade.setText("");
    txtUF.setText("");
    
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
