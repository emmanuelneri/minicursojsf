package br.com.unipar.minicursojsf.controller;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class EsqueciMinhaSenhaController {
   
    private String email;
    
    public String enviar() {
        // TODO envia email
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_WARN, "Senha recuperada com sucesso!", 
                        "A nova senha foi enviado para o email: " + email));
        
        return "";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
