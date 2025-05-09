package br.com.LocadoraVeiculo.repository;

import br.com.LocadoraVeiculo.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FuncionarioRepository extends JpaRepository<Funcionario, UUID> {
}
