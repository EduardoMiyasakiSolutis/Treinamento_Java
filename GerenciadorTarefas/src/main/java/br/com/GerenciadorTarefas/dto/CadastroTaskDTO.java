package br.com.GerenciadorTarefas.dto;

import jakarta.validation.constraints.NotBlank;

public record CadastroTaskDTO(
        @NotBlank
        String titulo,

        String status,

        String descricao
) {
}
