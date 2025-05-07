package br.com.GerenciadorTarefas.controller;

import br.com.GerenciadorTarefas.MockConfig;
import br.com.GerenciadorTarefas.dto.AtualizacaoTaskDTO;
import br.com.GerenciadorTarefas.dto.CadastroTaskDTO;
import br.com.GerenciadorTarefas.dto.ListagemTaskDTO;
import br.com.GerenciadorTarefas.entity.Task;
import br.com.GerenciadorTarefas.service.TaskService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Import(MockConfig.class)
class TaskControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private TaskService taskService;

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
        mockMvc.perform(get("/task/10"))
                .andExpect(status().isNotFound());
    }

    @Test
    void getAllTasks_returnsTaskList() throws Exception {
//        this.cadastroTaskDTO = new CadastroTaskDTO("Pipefy", "em andamento", "aaa");
//        taskService.saveTask(cadastroTaskDTO);

        mockMvc.perform(get("/task"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].titulo").value("Pipefy"));
    }

    @Test
    void update() throws Exception {
        AtualizacaoTaskDTO dto = new AtualizacaoTaskDTO("pii");

        mockMvc.perform(put("/task/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(dto)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.titulo").value("Pipefy"))
                .andExpect(jsonPath("$.descricao").value("pii"));
    }

    @Test
    void deleteTask() throws Exception {
        mockMvc.perform(delete("/task/1"))
                .andExpect(status().isNoContent());
    }

    @Test
    void deleteTaskInexistente() throws Exception {
        var response = mockMvc.perform(delete("/task/100000"))
                .andExpect(status().isNotFound())
                .andReturn()
                .getResponse();

        Assertions.assertEquals(404, response.getStatus());
    }
}