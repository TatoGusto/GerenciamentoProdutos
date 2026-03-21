package com.oatw.GerenciamentoProdutos.Services;

import com.oatw.GerenciamentoProdutos.Models.ProdutoModel;
import com.oatw.GerenciamentoProdutos.Repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public ProdutoModel createProduto(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> getAll(){
        return produtoRepository.findAll();
    }

    public ProdutoModel getById(Long id){
        return produtoRepository.getById(id);
    }

    public void deleteById(Long id){
        produtoRepository.deleteById(id);
    }

}
