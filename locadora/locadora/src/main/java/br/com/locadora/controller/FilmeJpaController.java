package br.com.locadora.controller;

import br.com.locadora.dto.CadastroFilmeDTO;
import br.com.locadora.entity.Filme;
import br.com.locadora.service.FilmeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeJpaController {

    @Autowired
    private FilmeService filmeService;

    @PostMapping
    public ResponseEntity<CadastroFilmeDTO> cadastrarFilme(@Valid @RequestBody CadastroFilmeDTO filmedto) {

        filmeService.cadastrarFilme(filmedto);
        return ResponseEntity.status(201).body(filmedto);
    }

    @GetMapping
    public ResponseEntity<List<Filme>> listarTodos() {
        try {
            return ResponseEntity.ok(filmeService.listarTodos());
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
