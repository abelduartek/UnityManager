package br.com.unitymanager.entity;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class UsuarioTabela {

    private SimpleIntegerProperty user_id;
    private SimpleStringProperty user_cpf;
    private SimpleStringProperty user_login;
    private SimpleStringProperty user_nome;
    private SimpleStringProperty user_telefone;
    private SimpleStringProperty user_email;
    
    public UsuarioTabela(int id_user, String cpf_user, String login_user, String user_nome, String tel_user, String email_user){
        this.user_id = new SimpleIntegerProperty(id_user);
        this.user_cpf = new SimpleStringProperty(cpf_user);
        this.user_login = new SimpleStringProperty(login_user);
        this.user_nome = new SimpleStringProperty(user_nome);
        this.user_telefone = new SimpleStringProperty(tel_user);
        this.user_email = new SimpleStringProperty(email_user);
    }
    
    public SimpleIntegerProperty getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer id) {
        this.user_id = new SimpleIntegerProperty(id);
    }

    public SimpleStringProperty getUser_cpf() {
        return user_cpf;
    }

    public void setUser_cpf(String cpf) {
        this.user_cpf = new SimpleStringProperty(cpf);
    }

    public SimpleStringProperty getUser_login() {
        return user_login;
    }

    public void setUser_login(String login) {
        this.user_login = new SimpleStringProperty(login);
    }

    public SimpleStringProperty getUser_nome() {
        return user_nome;
    }

    public void setUser_nome(String nome) {
        this.user_nome = new SimpleStringProperty(nome);
    }

    public SimpleStringProperty getUser_telefone() {
        return user_telefone;
    }

    public void setUser_telefone(String telefone) {
        this.user_telefone = new SimpleStringProperty(telefone);
    }

    public SimpleStringProperty getUser_email() {
        return user_email;
    }

    public void setUser_email(String email) {
        this.user_email = new SimpleStringProperty(email);
    }
}
