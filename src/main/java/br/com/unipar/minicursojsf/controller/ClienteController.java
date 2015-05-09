package br.com.unipar.minicursojsf.controller;

import br.com.unipar.minicursojsf.model.Cliente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ClienteController implements Serializable {
    
    private Cliente cliente;
    private List<Cliente> clientes;
    
    public ClienteController() {
        cliente = new Cliente();
        clientes = new ArrayList<>();
    }
    
    public void limpar() {
        cliente = new Cliente();
    }
    
    public void adicionar() {
        clientes.add(cliente);
        limpar();
    }
    
    public void remover(Cliente cliente) {
        clientes.remove(cliente);
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
    public List<Cliente> getClientes() {
        return clientes;
    }
    
}