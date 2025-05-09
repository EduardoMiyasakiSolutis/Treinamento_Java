package br.com.LocadoraVeiculo.controller;

import br.com.LocadoraVeiculo.dto.ListagemCarrosDTO;
import br.com.LocadoraVeiculo.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping
    public ResponseEntity<List<Object[]>> listarCarros() {
        try {
            var carros = carroService.listarCarros();
            return ResponseEntity.status(200).body(carros);
        } catch (RuntimeException e) {
            return ResponseEntity.status(204).build();
        }
    }
}
