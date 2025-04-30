package br.com.mercado.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;


public record CadastroProdutoDTO(@NotBlank String nome,
                                 @NotBlank String categoria,
                                 @Positive double preco,
                                 @Positive  int qtdEstoque,
                                 @NotBlank String marca,
                                 String descricao,
                                 LocalDate data){}