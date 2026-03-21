package com.oatw.GerenciamentoProdutos.Models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_produto")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodigoProduto")
    private Long id;
    private String nome;
    @Column(name = "ValorProduto")
    private BigDecimal preco;
    private Integer quantiEstoque;

    public ProdutoModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuantiEstoque() {
        return quantiEstoque;
    }

    public void setQuantiEstoque(Integer quantiEstoque) {
        this.quantiEstoque = quantiEstoque;
    }
}
