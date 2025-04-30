package br.com.mercado.dto;

import jakarta.validation.constraints.Positive;


public record AtualizarEstoqueDTO(@Positive int qtdEstoque) {
}
