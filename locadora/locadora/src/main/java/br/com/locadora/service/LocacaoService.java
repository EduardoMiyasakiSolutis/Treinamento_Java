package br.com.locadora.service;


import br.com.locadora.dto.CadastroLocacaoDTO;
import br.com.locadora.dto.LocacaoDAO;
import br.com.locadora.entity.Locacao;
import br.com.locadora.repository.ClienteRepository;
import br.com.locadora.repository.FilmeRepository;
import br.com.locadora.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class LocacaoService {

    @Autowired
    private LocacaoRepository locacaoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    public void cadastrarLocacao(CadastroLocacaoDTO dto) {
        var cliente = clienteRepository.findByNome(dto.nomeCliente());
        var filme = filmeRepository.findByTitulo(dto.nomeFilme());

        var verificarFilme = locacaoRepository.verificarFilmeAlugado(filme.getIdFilme());

        if (verificarFilme.isDevolvido() == false) {
            throw new RuntimeException("Filme já está alugado!");
        }

        var locacao = new Locacao(cliente, filme);
        locacaoRepository.save(locacao);
    }

    public List<Locacao> listarTodos() {
        return locacaoRepository.findAll();
    }

    public LocacaoDAO devolverFilme(long id, LocalDate dataDevolucao) {
        Optional<Locacao> locacao = locacaoRepository.findById(id);

        if (locacao.isEmpty()) {
            throw new RuntimeException("Locação não encontrada!");
        }

        locacaoRepository.devolverFilme(id, dataDevolucao);
        return new LocacaoDAO(locacao.get().getCliente().getNome(), locacao.get().getFilmes().get(0).getTitulo());
    }
}
