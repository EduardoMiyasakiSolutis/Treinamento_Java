package br.com.locadora.repository;

import br.com.locadora.entity.Filme;
import br.com.locadora.entity.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

public interface LocacaoRepository extends JpaRepository<Locacao, Long> {

    @Query("SELECT l FROM Locacao l JOIN l.filme f WHERE f.idFilme = :filmeId AND l.devolvido = false")
    Optional<Locacao> verificarFilmeAlugado(@Param("filmeId") long id);

    @Transactional
    @Modifying
    @Query("UPDATE Locacao l SET l.devolvido = true, l.dataDevolucao = :dataDevolucao WHERE l.idLocacao = :id")
    int devolverFilme(long id, LocalDate dataDevolucao);
}
