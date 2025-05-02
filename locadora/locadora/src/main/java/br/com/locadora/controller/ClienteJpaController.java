package br.com.locadora.controller;

import br.com.locadora.dto.CadastroClienteDTO;
import br.com.locadora.entity.Cliente;
import br.com.locadora.entity.Filme;
import br.com.locadora.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteJpaController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<CadastroClienteDTO> cadastrarCliente(@RequestBody @Valid CadastroClienteDTO clienteDTO) {

        clienteService.cadastrarCliente(clienteDTO);
        return ResponseEntity.status(201).body(clienteDTO);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listarTodos() {
        try {
            return ResponseEntity.ok(clienteService.listarTodos());
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable long id) {

        try {
            var produto = clienteService.listarUmCliente(id);
            clienteService.deletarCliente(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
