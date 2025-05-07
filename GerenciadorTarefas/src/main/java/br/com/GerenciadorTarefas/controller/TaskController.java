package br.com.GerenciadorTarefas.controller;

import br.com.GerenciadorTarefas.dto.AtualizacaoTaskDTO;
import br.com.GerenciadorTarefas.dto.CadastroTaskDTO;
import br.com.GerenciadorTarefas.dto.ListagemTaskDTO;
import br.com.GerenciadorTarefas.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<ListagemTaskDTO> saveTask(@RequestBody @Valid CadastroTaskDTO dto) {
        var task = taskService.saveTask(dto);
        return ResponseEntity.status(201).body(task);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ListagemTaskDTO> getOneTask(@PathVariable long id) {
        try {
            return ResponseEntity.ok(taskService.getOneTask(id));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<ListagemTaskDTO>> getAllTasks() {
        try {
            return ResponseEntity.ok(taskService.getAllTasks());
        } catch (RuntimeException e) {
            return ResponseEntity.noContent().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ListagemTaskDTO> updateTask(@PathVariable long id, @RequestBody @Valid AtualizacaoTaskDTO dto) {
        try {
            return ResponseEntity.ok(taskService.updateTask(id, dto.descricao()));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable long id) {
        try {
            taskService.deleteTask(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
