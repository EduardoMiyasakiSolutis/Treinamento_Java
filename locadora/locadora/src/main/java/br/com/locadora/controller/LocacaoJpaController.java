package br.com.locadora.controller;

import br.com.locadora.dto.CadastroLocacaoDTO;
import br.com.locadora.dto.LocacaoDAO;
import br.com.locadora.entity.Locacao;
import br.com.locadora.service.FilmeService;
import br.com.locadora.service.LocacaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/locacao")
public class LocacaoJpaController {

    @Autowired
    private LocacaoService locacaoService;

    @PostMapping
    public ResponseEntity cadastrarLocacao(@RequestBody @Valid CadastroLocacaoDTO dto) {
        try {
            locacaoService.cadastrarLocacao(dto);
            return ResponseEntity.status(201).body(dto);
        } catch (RuntimeException e) {
            return ResponseEntity.status(409).body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<List<Locacao>> listarTodos() {
        return ResponseEntity.status(200).body(locacaoService.listarTodos());
    }

    @PatchMapping("/{id}/devolucao")
    public ResponseEntity<LocacaoDAO> devolverFilme(@PathVariable long id) {
        try {
            return ResponseEntity.status(200).body(locacaoService.devolverFilme(id, LocalDate.now()));
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).build();
        }
    }
}
