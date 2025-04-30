package br.com.locadora.service;

import br.com.locadora.dto.CadastroClienteDTO;
import br.com.locadora.dto.CadastroFilmeDTO;
import br.com.locadora.entity.Cliente;
import br.com.locadora.entity.Filme;
import br.com.locadora.repository.ClienteRepository;
import br.com.locadora.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void cadastrarCliente(CadastroClienteDTO clienteDTO) {
        clienteRepository.save(new Cliente(clienteDTO));
    }
}
