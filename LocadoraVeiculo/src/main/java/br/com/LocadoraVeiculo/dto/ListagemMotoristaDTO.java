package br.com.LocadoraVeiculo.dto;

import br.com.LocadoraVeiculo.entity.ModeloCarro;

public record ListagemMotoristaDTO(
        String nome,
        String email,
        String numeroCNH
) {
}
