package br.com.GerenciadorTarefas.controller;

import br.com.GerenciadorTarefas.dto.CadastroTaskDTO;
import br.com.GerenciadorTarefas.dto.ListagemTaskDTO;
import br.com.GerenciadorTarefas.entity.Task;
import br.com.GerenciadorTarefas.service.TaskService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TaskControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private TaskService taskService;

    @Mock
    private Task task;

    private CadastroTaskDTO cadastroTaskDTO;

    private ListagemTaskDTO listagemTaskDTO;

    @Test
    void saveTask() throws Exception {
        this.cadastroTaskDTO = new CadastroTaskDTO("Pipefy", "em andamento", "aaa");

        mockMvc.perform(post("/task")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(cadastroTaskDTO)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.titulo").value("Pipefy"))
                .andExpect(jsonPath("$.descricao").value("aaa"));
    }

    @Test
    void get_one_failed() throws Exception {
        mockMvc.perform(get("/task/1"))
                .andExpect(status().isBadRequest());
    }

    @Test
    void getAllTasks_returnsTaskList() throws Exception {
        this.cadastroTaskDTO = new CadastroTaskDTO("Pipefy", "em andamento", "aaa");
        taskService.saveTask(cadastroTaskDTO);

        mockMvc.perform(get("/task"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].titulo").value("Funil de vendas"));
    }

    @Test
    void update() throws Exception {
        this.
    }

}