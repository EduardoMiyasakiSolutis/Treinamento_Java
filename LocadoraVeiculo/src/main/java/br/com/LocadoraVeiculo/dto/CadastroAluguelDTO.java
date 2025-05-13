package br.com.LocadoraVeiculo.dto;

import java.time.LocalDate;

public record CadastroAluguelDTO(
         LocalDate dataEntrega,
         LocalDate dataDevolucao,
         String placa,
         String metodoPagamento
         ) {
}
