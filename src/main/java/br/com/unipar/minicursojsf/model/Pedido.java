package br.com.unipar.minicursojsf.model;

import java.math.BigDecimal;
import java.util.Date;

public class Pedido {
    
    private Cliente cliente;
    
    private Date data = new Date();
    private BigDecimal valorTotal = BigDecimal.ZERO;

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
    
}
