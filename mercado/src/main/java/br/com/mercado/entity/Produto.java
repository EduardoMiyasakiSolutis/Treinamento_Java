package br.com.mercado.entity;

import br.com.mercado.dto.CadastroProdutoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String categoria;

    private double preco;

    private int quantidade_estoque;

    private String marca;

    @Column(length = 255)
    private String descricao;

    private LocalDate data_validade;

    public Produto(CadastroProdutoDTO produtoDTO) {
        this.nome = produtoDTO.nome();
        this.categoria = produtoDTO.categoria();
        this.preco = produtoDTO.preco();
        this.quantidade_estoque = produtoDTO.qtdEstoque();
        this.marca = produtoDTO.marca();
        this.descricao = produtoDTO.descricao();
        this.data_validade = produtoDTO.data();
    }

}