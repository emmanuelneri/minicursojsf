package br.com.unipar.minicursojsf.controller;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class LoginController {
    
    private static final String EMAIL_ADMIN = "admin@gmail.com";
    private static final String SENHA_ADMIN = "admin";
    
    private String email;
    private String senha;
    
    public String logar() {
        if(EMAIL_ADMIN.equals(email) && SENHA_ADMIN.equals(senha)) {
            return "index.xhtml?faces-redirect=true";
        }
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_WARN, "Login incorreto", 
                        "Email ou senha inválido"));
        return "";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
