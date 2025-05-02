package br.com.locadora.repository;

import br.com.locadora.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

    Filme findByTitulo(String titulo);
}
