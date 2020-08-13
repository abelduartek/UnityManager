package br.com.unitymanager.tabela;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class UsuarioTabela {
    
    private final SimpleIntegerProperty id;
    private final SimpleStringProperty cpf;
    private final SimpleStringProperty login;
    private final SimpleStringProperty nome;
    private final SimpleStringProperty telefone;
    private final SimpleStringProperty email;

    public UsuarioTabela(int id, String cpf, String login, String nome, String telefone, String email) {

        
        this.id = new SimpleIntegerProperty(id);
        this.cpf = new SimpleStringProperty(cpf);
        this.login = new SimpleStringProperty(login);
        this.nome = new SimpleStringProperty(nome);
        this.telefone = new SimpleStringProperty(telefone);
        this.email = new SimpleStringProperty(email);




    }

    
    public Integer getId(){
        return id.get();
    
    }
    public String getCpf(){
        return cpf.get();
    }
    public String getLogin(){
        return login.get();
    }
    public String getNome(){
        return nome.get();
    }
    public String getTelefone(){
        return telefone.get();
    }
    public String getEmail(){
        return email.get();
    }

    
}
