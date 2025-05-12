package br.com.LocadoraVeiculo.controller;

import br.com.LocadoraVeiculo.dto.ListagemCarroDisponivelDTO;
import br.com.LocadoraVeiculo.entity.Carro;
import br.com.LocadoraVeiculo.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/disponiveis")
    public ResponseEntity<List<ListagemCarroDisponivelDTO>> listarCarrosDisponiveis() {
        try {
            var carros = carroService.listarCarrosDisponiveis();
            return ResponseEntity.status(200).body(carros);
        } catch (RuntimeException e) {
            return ResponseEntity.status(204).build();
        }
    }

    @GetMapping("/categoria")
    public ResponseEntity<List<Carro>> listarCarrosPorCategoria(@RequestParam String categoria) {
        try {
            var carros = carroService.listarCarrosPorCategoria(categoria);
            return ResponseEntity.status(200).body(carros);
        } catch (RuntimeException e) {
            return ResponseEntity.status(204).build();
        }
    }

    @GetMapping("/acessorio")
    public ResponseEntity<List<Carro>> listarCarrosPorAcessorios(@RequestParam String acessorio) {
        try {
            var carros = carroService.listarCarrosPorAcessorios(acessorio);
            return ResponseEntity.status(200).body(carros);
        } catch (RuntimeException e) {
            return ResponseEntity.status(204).build();
        }
    }

}
