package br.com.GerenciadorTarefas;

import br.com.GerenciadorTarefas.service.TaskService;
import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration
public class MockConfig {

    public TaskService taskService() {
        return Mockito.mock(TaskService.class);
    }
}
