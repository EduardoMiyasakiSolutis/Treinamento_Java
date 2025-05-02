package br.com.locadora.repository;

import br.com.locadora.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

    Filme findByTitulo(String titulo);
}
