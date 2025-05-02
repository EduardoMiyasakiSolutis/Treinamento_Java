package br.com.locadora.repository;

import br.com.locadora.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByNome(String nome);
}
