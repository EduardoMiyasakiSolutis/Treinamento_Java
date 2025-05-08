package br.com.GerenciadorTarefas.controller;

import br.com.GerenciadorTarefas.MockConfig;
import br.com.GerenciadorTarefas.dto.CadastroTarefaDTO;
import br.com.GerenciadorTarefas.dto.ListagemTarefaDTO;
import br.com.GerenciadorTarefas.entity.Tarefa;
import br.com.GerenciadorTarefas.service.TarefaService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;


import java.util.ArrayList;
import java.util.Collections;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@WebMvcTest(TarefaController.class)
@Import(MockConfig.class)
class TarefaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private TarefaService tarefaService;


    private WebMvcTest webMvcTest;
    private CadastroTarefaDTO cadastroTarefaDTO;

    @MockitoBean
    private ListagemTarefaDTO listagemTarefaDTO;

    @Test
    void saveTask() throws Exception {
        this.cadastroTarefaDTO = new CadastroTarefaDTO("CRUD de usuário do japones");

        var response = mockMvc.perform(post("/tarefas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(cadastroTarefaDTO)))
                .andExpect(status().isCreated())
                .andReturn()
                .getResponse();

        Assertions.assertEquals(201, response.getStatus());
    }

    @Test
    void get_one_failed() throws Exception {
        mockMvc.perform(get("/tarefas/1000"))
                .andExpect(status().isNotFound());
    }

    @Test
    void getAllTasks_returnsTaskList() throws Exception {
        var lista = new ArrayList<ListagemTarefaDTO>();
        var listagem = new ListagemTarefaDTO("CRUD de usuário do japones");
        lista.add(listagem);
//        tarefaService.saveTarefa(cadastroTarefaDTO);

        Mockito.when(tarefaService.getAllTarefa()).thenReturn(Collections.singletonList(listagem));

        mockMvc.perform(get("/tarefas"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].titulo").value("CRUD de usuário do japones"));

//        System.out.println(response.getContentAsString());
//        Assertions.assertEquals(200, response.getStatus());
    }

    @Test
    void deleteTask() throws Exception {
        mockMvc.perform(delete("/tarefas/1"))
                .andExpect(status().isNoContent());
    }

    @Test
    void deleteTaskInexistente() throws Exception {
        var response = mockMvc.perform(delete("/tarefas/100000"))
                .andExpect(status().isNotFound())
                .andReturn()
                .getResponse();

        Assertions.assertEquals(404, response.getStatus());
    }
}