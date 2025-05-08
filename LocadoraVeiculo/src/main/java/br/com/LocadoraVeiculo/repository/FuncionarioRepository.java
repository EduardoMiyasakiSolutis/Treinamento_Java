package br.com.LocadoraVeiculo.repository;

import br.com.LocadoraVeiculo.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
