package br.com.LocadoraVeiculo.repository;

import br.com.LocadoraVeiculo.dto.ListagemCarroDisponivelDTO;
import br.com.LocadoraVeiculo.entity.Acessorio;
import br.com.LocadoraVeiculo.entity.Carro;
import br.com.LocadoraVeiculo.tipos.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface
CarroRepository extends JpaRepository<Carro, UUID> {

    @Query("SELECT c, m FROM Carro c INNER JOIN c.modeloCarro m")
    List<Object[]> listarTodosCarros();

    @Query("""
            SELECT new br.com.LocadoraVeiculo.dto.ListagemCarroDisponivelDTO(c, m.descricao, f.nome)
            FROM Carro c
            LEFT JOIN c.modeloCarro m
            LEFT JOIN m.fabricante f
            WHERE NOT EXISTS (
                SELECT a
                FROM Aluguel a
                WHERE a.carro = c
                  AND (a.dataDevolucao IS NULL OR a.dataDevolucao > CURRENT_DATE)
                  AND (a.carrinho = true)
            )
            """)
    List<ListagemCarroDisponivelDTO> listarCarrosDisponiveis();

    @Query("SELECT c FROM Carro c INNER JOIN c.modeloCarro m WHERE m.categoria = :categoria")
    List<Carro> listarCarrosPorCategoria(Categoria categoria);

    @Query("SELECT c FROM Carro c JOIN c.acessorios a WHERE a.idAcessorio = :idAcessorio")
    List<Carro> listarCarrosPorAcessorios(@Param("idAcessorio") UUID idAcessorio);

    Carro findByPlaca(String placa);
}
