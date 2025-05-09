package br.com.LocadoraVeiculo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluguel")
public class AluguelController {


//    public ResponseEntity<ListagemVeiculoDTO> listarVeiculosDisponiveis() {
//        try {
//            var listagem = aluguelService.listarVeiculosDisponiveis();
//            return ResponseEntity.status(200).body(listagem);
//        } catch (RuntimeException e) {
//            return ResponseEntity.status(204).build();
//        }

//    }
}
