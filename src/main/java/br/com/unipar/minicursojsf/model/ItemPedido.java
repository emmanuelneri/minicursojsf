package br.com.unipar.minicursojsf.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ItemPedido implements Serializable {
    
    private Produto produto;
    private int quatidade;
    private BigDecimal valor = BigDecimal.ZERO;
    
    public BigDecimal getValorTotal() {
        return valor.multiply(BigDecimal.valueOf(quatidade));
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuatidade() {
        return quatidade;
    }

    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
}
