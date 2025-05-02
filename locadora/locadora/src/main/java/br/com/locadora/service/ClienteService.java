package br.com.locadora.service;

import br.com.locadora.dto.CadastroClienteDTO;
import br.com.locadora.dto.CadastroFilmeDTO;
import br.com.locadora.entity.Cliente;
import br.com.locadora.entity.Filme;
import br.com.locadora.entity.Locacao;
import br.com.locadora.repository.ClienteRepository;
import br.com.locadora.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void cadastrarCliente(CadastroClienteDTO clienteDTO) {
        clienteRepository.save(new Cliente(clienteDTO));
    }

    public List<Cliente> listarTodos() {
        var cliente = clienteRepository.findAll();

        if (cliente.isEmpty()) {
            throw new RuntimeException("Lista de cliente se encontra vazia!");
        }
        return cliente;
    }

    public Cliente listarUmCliente(long id) {
        var cliente = clienteRepository.findById(id);

        if (cliente.isEmpty()) {
            throw new RuntimeException("Cliente com ID " +id+ " não encontrado!");
        }

        return cliente.get();
    }

    public void deletarCliente(long id) {
        clienteRepository.deleteById(id);
    }
}