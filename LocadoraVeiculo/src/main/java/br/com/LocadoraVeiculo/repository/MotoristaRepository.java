package br.com.LocadoraVeiculo.repository;

import br.com.LocadoraVeiculo.entity.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MotoristaRepository extends JpaRepository<Motorista, UUID> {

    boolean existsByEmail(String email);
}
