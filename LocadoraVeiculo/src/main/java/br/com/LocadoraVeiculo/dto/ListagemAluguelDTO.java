package br.com.LocadoraVeiculo.dto;

import br.com.LocadoraVeiculo.entity.Carro;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ListagemAluguelDTO(LocalDate dataPedido,
                                 LocalDate dataEntrega,
                                 Carro carro,
                                 BigDecimal valorTotal) {
}
