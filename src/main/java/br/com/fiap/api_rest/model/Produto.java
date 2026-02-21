package br.com.fiap.api_rest.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Produto {
    private UUID id;
    private String nome;
    private BigDecimal preco;

    public Produto(String nome, BigDecimal preco, LocalDate validade) {
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }

    public Produto() {

    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    private LocalDate validade;
}
