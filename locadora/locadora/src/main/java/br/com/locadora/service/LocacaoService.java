package br.com.locadora.service;


import br.com.locadora.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class LocacaoService {

    @Autowired
    private LocacaoRepository locacaoRepository;

    @PostMapping
    public
}
