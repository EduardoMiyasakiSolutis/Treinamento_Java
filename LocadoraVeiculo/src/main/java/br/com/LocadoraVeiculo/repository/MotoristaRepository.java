package br.com.LocadoraVeiculo.repository;

import br.com.LocadoraVeiculo.entity.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoristaRepository extends JpaRepository<Motorista, Long> {
}
