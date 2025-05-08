package br.com.GerenciadorTarefas.service;

import br.com.GerenciadorTarefas.dto.AtualizacaoTarefaDTO;
import br.com.GerenciadorTarefas.dto.CadastroTarefaDTO;
import br.com.GerenciadorTarefas.dto.ListagemTarefaDTO;
import br.com.GerenciadorTarefas.entity.Tarefa;
import br.com.GerenciadorTarefas.repository.TarefaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class TarefaServiceTest {

    @InjectMocks
    private TarefaService tarefaService;

    @Mock
    private TarefaRepository tarefaRepository;

    @Mock
    private CadastroTarefaDTO cadastroTaskDTO;

    @Mock
    private ListagemTarefaDTO listagemTaskDTO;

    @Mock
    private AtualizacaoTarefaDTO atualizacaoTaskDTO;

    @Mock
    private Optional<Tarefa> tarefaExiste;

    @Mock
    private Tarefa tarefa;

    private Tarefa tarefa1 = new Tarefa();

    @Test
    void getOneTaskFailed() {

        long id = 1l;

        given(tarefaRepository.findById(id))
                .willReturn(Optional.empty());

        Assertions.assertThrows(RuntimeException.class, () -> tarefaService.getOneTarefa(id));
    }


    @Test
    void getAllTasks() {
    }

    @Test
    void deleteTask() {
    }

}