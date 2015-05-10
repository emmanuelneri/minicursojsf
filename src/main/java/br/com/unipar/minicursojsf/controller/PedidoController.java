package br.com.unipar.minicursojsf.controller;

import br.com.unipar.minicursojsf.model.Cliente;
import br.com.unipar.minicursojsf.model.Pedido;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class PedidoController implements Serializable {
    
    private Pedido pedido;
    
    @ManagedProperty("#{clienteController.clientes}")
    private List<Cliente> clientes;
    
    public PedidoController() {
        pedido = new Pedido();
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
