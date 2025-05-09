package br.com.LocadoraVeiculo.dto;

import br.com.LocadoraVeiculo.entity.Acessorio;

import java.math.BigDecimal;
import java.util.List;

public record ListagemCarrosDTO(
        String placa,
        String chaci,
        String cor,
        BigDecimal valorDiaria,
        List<Acessorio> acessorios
) {
}
