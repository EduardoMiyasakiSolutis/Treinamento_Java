package br.com.locadora.dto;

import jakarta.validation.constraints.NotBlank;

public record CadastroClienteDTO(@NotBlank String nome, @NotBlank String email) {
}
