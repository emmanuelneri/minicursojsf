package br.com.unipar.minicursojsf.controller;

import br.com.unipar.minicursojsf.model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ProdutoController {
    
    private List<Produto> produtos;
    
    public ProdutoController() {
        produtos = new ArrayList<>();
        
        produtos.add(new Produto(1, "Galaxy S6"));
        produtos.add(new Produto(2, "Galaxy S5"));
        produtos.add(new Produto(3, "IPhone 6"));
        produtos.add(new Produto(4, "Iphone 5"));
        produtos.add(new Produto(5, "Z3"));
        produtos.add(new Produto(6, "Moto Maxx"));
    } 

    public List<Produto> getProdutos() {
        return produtos;
    } 
}
