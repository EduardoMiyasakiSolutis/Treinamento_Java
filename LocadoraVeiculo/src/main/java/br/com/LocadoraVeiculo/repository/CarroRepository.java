package br.com.LocadoraVeiculo.repository;

import br.com.LocadoraVeiculo.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface CarroRepository extends JpaRepository<Carro, UUID> {

    @Query("SELECT c, m FROM Carro c INNER JOIN c.modeloCarro m")
    List<Object[]> listarTodosCarros();
}
