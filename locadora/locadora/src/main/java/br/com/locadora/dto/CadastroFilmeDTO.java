package br.com.locadora.dto;


import jakarta.validation.constraints.NotBlank;

public record CadastroFilmeDTO(@NotBlank String titulo, @NotBlank String genero, @NotBlank String diretor) {
}
