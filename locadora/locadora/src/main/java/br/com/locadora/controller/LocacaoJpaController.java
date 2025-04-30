package br.com.locadora.controller;

import br.com.locadora.service.FilmeService;
import br.com.locadora.service.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locacao")
public class LocacaoJpaController {

    @Autowired
    private LocacaoService locacaoService;
}
