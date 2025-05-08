package br.com.GerenciadorTarefas.controller;

import br.com.GerenciadorTarefas.dto.AtualizacaoTarefaDTO;
import br.com.GerenciadorTarefas.dto.CadastroTarefaDTO;
import br.com.GerenciadorTarefas.dto.ListagemTarefaDTO;
import br.com.GerenciadorTarefas.service.TarefaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @PostMapping
    public ResponseEntity<ListagemTarefaDTO> saveTarefa(@RequestBody @Valid CadastroTarefaDTO dto) {
        var task = tarefaService.saveTarefa(dto);
        return ResponseEntity.status(201).body(task);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ListagemTarefaDTO> getOneTarefa(@PathVariable long id) {
        try {
            return ResponseEntity.ok(tarefaService.getOneTarefa(id));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<ListagemTarefaDTO>> getAllTarefas() {
        try {
            return ResponseEntity.ok(tarefaService.getAllTarefa());
        } catch (RuntimeException e) {
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTarefa(@PathVariable long id) {
        try {
            tarefaService.deleteTarefa(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
