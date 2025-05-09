package br.com.LocadoraVeiculo.service;

import br.com.LocadoraVeiculo.dto.ListagemCarroDTO;
import br.com.LocadoraVeiculo.dto.ListagemCarrosDTO;
import br.com.LocadoraVeiculo.entity.Carro;
import br.com.LocadoraVeiculo.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<Object[]> listarCarros() {
        var carros = carroRepository.listarTodosCarros();

        if (carros.isEmpty()) {
            throw new RuntimeException("Lista de carros vazia");
        }
        return carros;
//        return listToDTO(carros);
    }

    public List<ListagemCarrosDTO> listToDTO(List<Carro> carro) {
        var carros = new ArrayList<ListagemCarrosDTO>();

        carro.forEach(c ->
                carros.add(new ListagemCarrosDTO(c.getPlaca(),
                        c.getChassi(),
                        c.getCor(),
                        c.getValorDiaria(),
                        c.getAcessorios())));

        return carros;

    }
}
