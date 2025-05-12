package br.com.LocadoraVeiculo.dto;

import br.com.LocadoraVeiculo.entity.Carro;

public record ListagemCarroDisponivelDTO(
        Carro carro,
        String descricaoModelo,
        String fabricanteNome
) {
}
