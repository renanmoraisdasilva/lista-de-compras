package br.com.stefanini.developerup.dao;

import br.com.stefanini.developerup.model.Produto;

import io.quarkus.panache.common.Sort;
import javax.enterprise.context.RequestScoped;
import java.util.List;


@RequestScoped
public class ProdutoDao {

    public List<Produto> listar(){
        return Produto.listAll(Sort.by("Id,comprado,nome").ascending());
    }
}