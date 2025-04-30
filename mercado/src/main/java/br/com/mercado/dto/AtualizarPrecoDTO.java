package br.com.mercado.dto;

import jakarta.validation.constraints.NotNull;


public record AtualizarPrecoDTO(@NotNull double preco) {
}
