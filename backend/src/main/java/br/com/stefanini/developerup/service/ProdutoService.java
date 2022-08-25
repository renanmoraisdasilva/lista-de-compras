package br.com.stefanini.developerup.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import br.com.stefanini.developerup.dao.ProdutoDao;
import br.com.stefanini.developerup.dto.ProdutoDto;
import br.com.stefanini.developerup.model.Produto;


@RequestScoped
public class ProdutoService {

    @Inject
    ProdutoDao dao;
    
    public List<ProdutoDto> listar(){
        List<Produto> lista = dao.listar();
        List<ProdutoDto> listaDto = new ArrayList<ProdutoDto>();
        for (Produto produto : lista) {
            ProdutoDto produtoDto = new ProdutoDto();
            produtoDto.setCodigo(produto.getId());
            produtoDto.setNome(produto.getNome());
            produtoDto.setComprado(produto.isComprado());
            listaDto.add(produtoDto);
        }
        return listaDto;
    }

    public Produto salvar(ProdutoDto request){
        Produto produto = new Produto();
        produto.setNome(request.getNome());
        produto.setComprado(request.isComprado());
        produto.persistAndFlush();        
        return produto;
    }

    public Produto update(ProdutoDto request) {
		Produto produto = Produto.findById(request.getCodigo());
        produto.setNome(request.getNome());
        produto.setComprado(request.isComprado());
        return produto;
	}

    public void deletar(Long id){
        Produto.deleteById(id);     
    }
}