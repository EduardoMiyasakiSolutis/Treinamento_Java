package br.com.GerenciadorTarefas;

import br.com.GerenciadorTarefas.service.TarefaService;
import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration
public class MockConfig {

    public TarefaService taskService() {
        return Mockito.mock(TarefaService.class);
    }
}
