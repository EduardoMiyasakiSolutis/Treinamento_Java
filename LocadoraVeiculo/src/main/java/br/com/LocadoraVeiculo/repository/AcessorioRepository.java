package br.com.LocadoraVeiculo.repository;

import br.com.LocadoraVeiculo.entity.Acessorio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AcessorioRepository extends JpaRepository<Acessorio, UUID> {

    Acessorio findByDescricao(String descricao);
}
