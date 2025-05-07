package br.com.GerenciadorTarefas.service;

import br.com.GerenciadorTarefas.dto.AtualizacaoTaskDTO;
import br.com.GerenciadorTarefas.dto.CadastroTaskDTO;
import br.com.GerenciadorTarefas.dto.ListagemTaskDTO;
import br.com.GerenciadorTarefas.entity.Task;
import br.com.GerenciadorTarefas.repository.TaskRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @InjectMocks
    private TaskService taskService;

    @Mock
    private TaskRepository taskRepository;

    @Mock
    private CadastroTaskDTO cadastroTaskDTO;

    @Mock
    private ListagemTaskDTO listagemTaskDTO;

    @Mock
    private AtualizacaoTaskDTO atualizacaoTaskDTO;

    @Mock
    private Optional<Task> taskExiste;

    @Mock
    private Task task;

    private Task task1 = new Task();

//    @Test
//    @DisplayName("Salvar a task no banco")
//    void saveTask() {
//        when(taskService.toDTO(task)).thenReturn(listagemTaskDTO);
//
//        Assertions.assertDoesNotThrow(() -> taskService.saveTask(cadastroTaskDTO));
//    }

    @Test
    void getOneTaskFailed() {

        long id = 1l;

        given(taskRepository.findById(id))
                .willReturn(Optional.empty());

        Assertions.assertThrows(RuntimeException.class, () -> taskService.getOneTask(id));
    }


    @Test
    void getAllTasks() {
    }

    @Test
    void deveriaAtualizarDados() {
        long id = 1L;
        Task taskExiste = new Task(); // ou use um mock, se preferir
        taskExiste.setDescricao("descrição antiga");

        // ARRANGE
        given(taskRepository.findById(id)).willReturn(Optional.of(taskExiste));

        // ACT
        taskService.updateTask(id, "nova descrição");

        // ASSERT
        BDDMockito.then(taskRepository).should().save(taskExiste);
    }


    @Test
    void deleteTask() {
    }

}