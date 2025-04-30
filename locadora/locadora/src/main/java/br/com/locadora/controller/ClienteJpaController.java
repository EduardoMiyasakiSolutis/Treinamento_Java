package br.com.locadora.controller;

import br.com.locadora.dto.CadastroClienteDTO;
import br.com.locadora.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
