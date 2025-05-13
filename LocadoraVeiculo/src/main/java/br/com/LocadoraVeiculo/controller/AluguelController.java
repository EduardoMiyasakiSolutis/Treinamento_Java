package br.com.LocadoraVeiculo.controller;

import br.com.LocadoraVeiculo.dto.CadastroAluguelDTO;
import br.com.LocadoraVeiculo.dto.CadastroMotoristaDTO;
import br.com.LocadoraVeiculo.dto.ListagemAluguelDTO;
import br.com.LocadoraVeiculo.service.AluguelService;
import br.com.LocadoraVeiculo.validacao.ValidacaoException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/aluguel")
public class AluguelController {

    @Autowired
    private AluguelService aluguelService;

    @PostMapping
    public ResponseEntity<ListagemAluguelDTO> cadastrarAluguel(@RequestBody @Valid CadastroAluguelDTO aluguelDTO) {
        try {
            var listagem = aluguelService.saveAluguel(aluguelDTO);
            return ResponseEntity.status(201).body(listagem);
        } catch (ValidacaoException ex) {
            return ResponseEntity.status(400).build();
        }
    }

    @PatchMapping("/{idAluguel}")
    public ResponseEntity<ListagemAluguelDTO> atualizarCarrinho(@PathVariable UUID idAluguel) {
        try{
            var atualizado = aluguelService.atualizarBooleanCarrinho(idAluguel);
            return ResponseEntity.ok(atualizado);
        }  catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}