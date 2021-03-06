package br.com.unipar.minicursojsf.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Pedido implements Serializable {
    
    private Cliente cliente;
    private List<ItemPedido> itensPedido = new ArrayList<>();
    
    private Date data = new Date();
    private BigDecimal valorTotal = BigDecimal.ZERO;
    
    public void adicionarItem(ItemPedido itemPedido) {
        itensPedido.add(itemPedido);
        valorTotal = valorTotal.add(itemPedido.getValorTotal());
    }
    
     public void removerItem(ItemPedido itemPedido) {
        itensPedido.remove(itemPedido);
        valorTotal = valorTotal.subtract(itemPedido.getValorTotal());
    }

    public Date getData() {
        return data;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }
    
    public String getValorTotaFormatado() {
        return new DecimalFormat("'R$ ' #,###,##0.00", 
                new DecimalFormatSymbols(new Locale("pt", "pt_BR"))).format(valorTotal);
    }
}
