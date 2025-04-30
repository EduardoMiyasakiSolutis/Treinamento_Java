package br.com.locadora.service;


import br.com.locadora.dto.CadastroLocacaoDTO;
import br.com.locadora.entity.Cliente;
import br.com.locadora.entity.Filme;
import br.com.locadora.entity.Locacao;
import br.com.locadora.repository.ClienteRepository;
import br.com.locadora.repository.FilmeRepository;
import br.com.locadora.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Service
public class LocacaoService {

    @Autowired
    private LocacaoRepository locacaoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    @PostMapping
    public void cadastrarLocacao(CadastroLocacaoDTO locacaoDTO) {
        Cliente cliente = clienteRepository.findByNome(locacaoDTO.nomeCliente());
        Filme filme = filmeRepository.findByTitulo(locacaoDTO.nomeFilme());
        Locacao locacao = new Locacao(cliente, filme);
        locacaoRepository.save(locacao);
    }


}
