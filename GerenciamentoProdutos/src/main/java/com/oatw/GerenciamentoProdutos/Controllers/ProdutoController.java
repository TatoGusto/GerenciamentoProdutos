package com.oatw.GerenciamentoProdutos.Controllers;

import com.oatw.GerenciamentoProdutos.Models.ProdutoModel;
import com.oatw.GerenciamentoProdutos.Services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoModel> createProduto(@RequestBody ProdutoModel produtoModel){
        ProdutoModel request = produtoService.createProduto(produtoModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(produtoModel.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> getAll(){
        List<ProdutoModel> request = produtoService.getAll();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoModel> getById(@PathVariable Long id){
        ProdutoModel request = produtoService.getById(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        produtoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
