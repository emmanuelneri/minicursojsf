package br.com.unipar.minicursojsf.controller;

import br.com.unipar.minicursojsf.model.Cliente;
import br.com.unipar.minicursojsf.model.ItemPedido;
import br.com.unipar.minicursojsf.model.Pedido;
import br.com.unipar.minicursojsf.model.Produto;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PedidoController implements Serializable {
    
    private Pedido pedido;
    private ItemPedido itemPedido;
    
    @ManagedProperty("#{clienteController.clientes}")
    private List<Cliente> clientes;
    
    @ManagedProperty("#{produtoController.produtos}")
    private List<Produto> produtos;
    
    public PedidoController() {
        pedido = new Pedido();
        itemPedido = new ItemPedido();
    }
    
    public void adicionarItem() {
        pedido.adicionarItem(itemPedido);
        itemPedido = new ItemPedido();
    }
    
    public void removerItem(ItemPedido itemPedido) {
        pedido.removerItem(itemPedido);
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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(ItemPedido itemPedido) {
        this.itemPedido = itemPedido;
    }
    
  
}
