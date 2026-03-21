package com.oatw.GerenciamentoProdutos.Repositories;

import com.oatw.GerenciamentoProdutos.Models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel,Long> {
}
