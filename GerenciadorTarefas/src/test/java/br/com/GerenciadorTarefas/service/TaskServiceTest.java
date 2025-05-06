package br.com.GerenciadorTarefas.service;

import br.com.GerenciadorTarefas.dto.CadastroTaskDTO;
import br.com.GerenciadorTarefas.dto.ListagemTaskDTO;
import br.com.GerenciadorTarefas.entity.Task;
import br.com.GerenciadorTarefas.repository.TaskRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
    private Task task;

    @BeforeEach
    void setUp() {
        cadastroTaskDTO = new CadastroTaskDTO("Pipefy", "em andamento", "aaa");
        task = new Task(cadastroTaskDTO);
        listagemTaskDTO = new ListagemTaskDTO(task.getTitulo(), task.getDescricao());
    }

    @Test
    @DisplayName("Salvar a task no banco")
    void saveTask() {

        this.cadastroTaskDTO = new CadastroTaskDTO("Titulo", "em andamento", "titulo legal");
//        when(taskService.toDTO(task)).thenReturn(listagemTaskDTO);

        Assertions.assertDoesNotThrow(() -> taskService.saveTask(cadastroTaskDTO));
    }

    @Test
    void getOneTask() {

    }

    @Test
    void getAllTasks() {
    }

    @Test
    void updateTask() {
    }

    @Test
    void deleteTask() {
    }

    @Test
    void toDTO() {
    }

    @Test
    void listToDTO() {
    }
}