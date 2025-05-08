package br.com.GerenciadorTarefas.repository;

import br.com.GerenciadorTarefas.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
