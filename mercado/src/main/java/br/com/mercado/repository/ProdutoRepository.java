package br.com.mercado.repository;

import br.com.mercado.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Produto p set p.preco = :preco WHERE p.id = :id")
    int atualizarPreco(long id , double preco);

    @Modifying
    @Transactional
    @Query("UPDATE Produto p set p.quantidade_estoque = :qtdEstoque WHERE p.id = :id")
    int atualizarEstoque(long id , int qtdEstoque);
}
