package br.com.unipar.minicursojsf.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletRequest;

@ManagedBean
@RequestScoped
public class PassagemParametroGetController {
    
    // Adicionar ? nome do parametro = valor do parametro
    //http://localhost:8080/parametro-get.xhtml?parametro=Teste
    public String getParametro() {
        final ServletRequest request = (ServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        return request.getParameter("parametro");
    }
    
}
