package br.com.LocadoraVeiculo.service;

import br.com.LocadoraVeiculo.repository.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AluguelService {

    @Autowired
    private AluguelRepository aluguelRepository;

}
