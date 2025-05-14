package br.com.LocadoraVeiculo.controller;

import br.com.LocadoraVeiculo.dto.CadastroAluguelDTO;
import br.com.LocadoraVeiculo.dto.ListagemAluguelDTO;
import br.com.LocadoraVeiculo.service.AluguelService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@WebMvcTest(AluguelControllerTest.class)
class AluguelControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private AluguelService aluguelService;

    private CadastroAluguelDTO cadastroAluguelDTO;

    @Mock
    private ListagemAluguelDTO listagemAluguelDTO;

    @Test
    void saveAluguel() throws Exception {
        this.cadastroAluguelDTO = new CadastroAluguelDTO(LocalDate.of(2014, 12, 10),
                LocalDate.of(2017, 9, 21), "ABC1A23", "PIX");

        var response = mockMvc.perform(post("/aluguel")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(cadastroAluguelDTO)))
                .andExpect(status().isCreated())
                .andReturn()
                .getResponse();

        Assertions.assertEquals(201, response.getStatus());
    }

}