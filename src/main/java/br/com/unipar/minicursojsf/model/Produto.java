package br.com.unipar.minicursojsf.model;

import java.io.Serializable;

public class Produto implements Serializable {
    
    private int codigo;
    private String nome;

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
