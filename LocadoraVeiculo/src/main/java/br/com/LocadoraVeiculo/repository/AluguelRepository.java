package br.com.LocadoraVeiculo.repository;

import br.com.LocadoraVeiculo.entity.Aluguel;
import br.com.LocadoraVeiculo.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface AluguelRepository extends JpaRepository<Aluguel, UUID> {

}
