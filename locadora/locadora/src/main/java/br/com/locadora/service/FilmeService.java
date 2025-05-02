package br.com.locadora.service;

import br.com.locadora.dto.CadastroFilmeDTO;
import br.com.locadora.entity.Filme;
import br.com.locadora.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public void cadastrarFilme(CadastroFilmeDTO filmeDTO) {
        filmeRepository.save(new Filme(filmeDTO));
    }

    public List<Filme> listarTodos() {
        var filme = filmeRepository.findAll();

        if (filme.isEmpty()) {
            throw new RuntimeException("Lista de Filmes vazia!");
        }
        return filme;
    }


}

