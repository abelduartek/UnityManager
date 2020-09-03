package br.com.unitymanager.model;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_cliente")
    private int codigoCliente;
    
    @NotNull
    @Column(name = "doc_cliente")
    private String docCliente;
    
    @NotNull
    @Column(name = "razao_social_cliente")
    private String razaoSocialCliente;
    
    
    @Column(name = "nome_fantasia_cliente")
    private String nomeFantasiaCliente;
    
    @NotNull
    @Column(name = "endereco_cliente")
    private String enderecoCliente;
    
    @NotNull
    @Column(name = "bairro_cliente")
    private String bairroCliente;
    
    @NotNull
    @Column(name = "cidade_cliente")
    private String cidadeCliente;
    
    @NotNull
    @Column(name = "uf_cliente")
    private String ufCliente;
    
    @NotNull
    @Column(name = "cep_cliente")
    private String cepCliente;
    
    @NotNull
    @Column(name = "personalidade_cliente")
    private String personalidadeCliente;
    
    @NotNull
    @Column(name = "situacao_funcionamento_cliente")
    private String situacaoFuncionamentoCliente;
    
    @Column(name = "ramo_atividade_cliente")
    private String ramoAtividadeCliente;
    
    @NotNull
    @Column(name = "ie_cliente")
    private String ieCliente;
    
    @NotNull
    @Column(name = "telefone_cliente")
    private String telefoneCliente;
    
    @NotNull
    @Column(name = "email_cliente")
    private String emailCliente;
    
    @NotNull
    @Column(name = "contato_cliente")
    private String contatoCliente;
    
    @NotNull
    @Column(name = "vendedor_cliente")
    private String vendedorCliente;
    
    @NotNull
    @Column(name = "prioridade_cliente")
    private String prioridadeCliente;
    
    @NotNull
    @Column(name = "email_ti_cliente")
    private String emailTICliente;
    
    @NotNull
    @Column(name = "contato_ti_cliente")
    private String contatoTICliente;
    
    @NotNull
    @Column(name = "data_cadastro_cliente")
    private String dataCadastroCliente;
    
    @NotNull
    @Column(name = "usuario_cadastro_cliente")
    private String usuarioCadastroCliente;
    
    @NotNull
    @Column(name = "SLA_cliente")
    private String slaCliente;
    
     public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDocCliente() {
        return docCliente;
    }

    public void setDocCliente(String docCliente) {
        this.docCliente = docCliente;
    }

    public String getRazaoSocialCliente() {
        return razaoSocialCliente;
    }

    public void setRazaoSocialCliente(String razaoSocialCliente) {
        this.razaoSocialCliente = razaoSocialCliente;
    }

    public String getNomeFantasiaCliente() {
        return nomeFantasiaCliente;
    }

    public void setNomeFantasiaCliente(String nomeFantasiaCliente) {
        this.nomeFantasiaCliente = nomeFantasiaCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getUfCliente() {
        return ufCliente;
    }

    public void setUfCliente(String ufCliente) {
        this.ufCliente = ufCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getPersonalidadeCliente() {
        return personalidadeCliente;
    }

    public void setPersonalidadeCliente(String personalidadeCliente) {
        this.personalidadeCliente = personalidadeCliente;
    }

    public String getSituacaoFuncionamentoCliente() {
        return situacaoFuncionamentoCliente;
    }

    public void setSituacaoFuncionamentoCliente(String situacaoFuncionamentoCliente) {
        this.situacaoFuncionamentoCliente = situacaoFuncionamentoCliente;
    }

    public String getRamoAtividadeCliente() {
        return ramoAtividadeCliente;
    }

    public void setRamoAtividadeCliente(String ramoAtividadeCliente) {
        this.ramoAtividadeCliente = ramoAtividadeCliente;
    }

    public String getIeCliente() {
        return ieCliente;
    }

    public void setIeCliente(String ieCliente) {
        this.ieCliente = ieCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getContatoCliente() {
        return contatoCliente;
    }

    public void setContatoCliente(String contatoCliente) {
        this.contatoCliente = contatoCliente;
    }

    public String getVendedorCliente() {
        return vendedorCliente;
    }

    public void setVendedorCliente(String vendedorCliente) {
        this.vendedorCliente = vendedorCliente;
    }

    public String getPrioridadeCliente() {
        return prioridadeCliente;
    }

    public void setPrioridadeCliente(String prioridadeCliente) {
        this.prioridadeCliente = prioridadeCliente;
    }

    public String getEmailTICliente() {
        return emailTICliente;
    }

    public void setEmailTICliente(String emailTICliente) {
        this.emailTICliente = emailTICliente;
    }

    public String getContatoTICliente() {
        return contatoTICliente;
    }

    public void setContatoTICliente(String contatoTICliente) {
        this.contatoTICliente = contatoTICliente;
    }

    public String getDataCadastroCliente() {
        return dataCadastroCliente;
    }

    public void setDataCadastroCliente(String dataCadastroCliente) {
        this.dataCadastroCliente = dataCadastroCliente;
    }

    public String getUsuarioCadastroCliente() {
        return usuarioCadastroCliente;
    }

    public void setUsuarioCadastroCliente(String usuarioCadastroCliente) {
        this.usuarioCadastroCliente = usuarioCadastroCliente;
    }
 
    
    
}
