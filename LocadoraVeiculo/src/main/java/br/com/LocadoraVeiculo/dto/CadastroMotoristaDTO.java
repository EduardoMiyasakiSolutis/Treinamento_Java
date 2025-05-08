package br.com.LocadoraVeiculo.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record CadastroMotoristaDTO(
        @NotBlank
        String nome,
        LocalDate dataNascimento,
        String cpf,
        String sexo,
        String email,
        String numeroCNH
) {
}
