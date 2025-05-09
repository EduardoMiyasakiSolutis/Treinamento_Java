package br.com.LocadoraVeiculo.dto;

import br.com.LocadoraVeiculo.entity.Acessorio;
import br.com.LocadoraVeiculo.entity.ModeloCarro;

import java.math.BigDecimal;
import java.util.List;

public interface ListagemCarroDTO {

    String getPlaca();
    String getChaci();
    String getCor();
    BigDecimal getValorDiaria();
    List<Acessorio> getAcessorios();
    ModeloCarro getModeloCarro();
}
