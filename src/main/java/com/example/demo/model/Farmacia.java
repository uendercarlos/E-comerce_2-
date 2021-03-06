
package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotEmpty;

/*
 
  @author Alcídia Cristina
 */
@Entity
public class Farmacia implements Serializable{

    private Long id;
    private String login;
    private String senha;
    @NotEmpty
    private String nome;
    @NotEmpty
    private String telefone;
    @NotEmpty
    private String endereço;
    @NotEmpty
    private String cnpj;
    @NotEmpty
    private String email;
    
   

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotEmpty
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @NotEmpty
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    @NotEmpty
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    @NotEmpty
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @NotEmpty
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    @NotEmpty
    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    @NotEmpty
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    @NotEmpty
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
