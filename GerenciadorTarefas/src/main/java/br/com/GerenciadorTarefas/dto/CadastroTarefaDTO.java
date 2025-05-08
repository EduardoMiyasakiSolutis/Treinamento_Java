package br.com.GerenciadorTarefas.dto;

import jakarta.validation.constraints.NotBlank;

public record CadastroTarefaDTO(
        @NotBlank
        String titulo
) {
}
