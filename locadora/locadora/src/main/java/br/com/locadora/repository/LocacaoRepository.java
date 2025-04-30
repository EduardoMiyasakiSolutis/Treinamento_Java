package br.com.locadora.repository;

import br.com.locadora.entity.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LocacaoRepository extends JpaRepository<Locacao, Long> {

//    @Query("SELECT l from Locacao l INNER JOIN Filme WHERE f.titulo = :titulo")
//    boolean validarFilmeAlugado
}
