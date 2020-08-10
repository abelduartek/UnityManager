package br.com.unitymanager.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private int id;

	@NotNull
	@Column(name = "login_usuario")
	private String login;
	
	@NotNull
	@Column(name = "senha_usuario")
	private String senha;
	
	@NotNull
	@Column(name = "cpf_usuario")
	private String cpf;
	
	@NotNull
	@Column(name = "rg_usuario")
	private String rg;
	
	@NotNull
	@Column(name = "nome_usuario")
	private String nome;
	
	@NotNull
	@Column(name = "sobrenome_usuario")
	private String sobrenome;
	
	@NotNull
	@Column(name = "idade_usuario")
	private String idade;
	
	@NotNull
	@Column(name = "datanascimento_usuario")
	private String dataNascimento;
	
	@NotNull
	@Column(name = "endereco_usuario")
	private String endereco;
	
	@NotNull
	@Column(name = "bairro_usuario")
	private String bairro;
	
	@NotNull
	@Column(name = "cidade_usuario")
	private String cidade;
	
	@NotNull
	@Column(name = "uf_usuario")
	private String uf;
	
	@NotNull
	@Column(name = "civil_usuario")
	private String civil;
	
	@NotNull
	@Column(name = "cargo_usuario")
	private String cargo;
	
	@NotNull
	@Column(name = "email_usuario")
	private String email;
	
	@NotNull
	@Column(name = "telefone_usuario")
	private String telefone;
	
	@NotNull
	@Column(name = "celular_usuario")
	private String celular;
        
        @NotNull
        @Column(name = "setor_usuario")
        private String setor;
        
        @NotNull
        @Column(name = "perfil_usuario")
        private String perfil;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCivil() {
		return civil;
	}

	public void setCivil(String civil) {
		this.civil = civil;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
        
         public String getSetor() {
            return setor;
        }

        public void setSetor(String setor) {
            this.setor = setor;
        }

        public String getPerfil() {
            return perfil;
        }

        public void setPerfil(String perfil) {
            this.perfil = perfil;
        }

	
	
	
	
	
	

}
