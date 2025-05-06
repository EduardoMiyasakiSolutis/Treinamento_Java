package br.com.GerenciadorTarefas.repository;

import br.com.GerenciadorTarefas.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
