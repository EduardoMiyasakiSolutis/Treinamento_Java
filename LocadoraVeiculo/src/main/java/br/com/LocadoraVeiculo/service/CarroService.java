package br.com.LocadoraVeiculo.service;

import br.com.LocadoraVeiculo.dto.ListagemCarroDTO;
import br.com.LocadoraVeiculo.dto.ListagemCarroDisponivelDTO;
import br.com.LocadoraVeiculo.dto.ListagemCarrosDTO;
import br.com.LocadoraVeiculo.entity.Acessorio;
import br.com.LocadoraVeiculo.entity.Carro;
import br.com.LocadoraVeiculo.mapper.CarroMapper;
import br.com.LocadoraVeiculo.repository.AcessorioRepository;
import br.com.LocadoraVeiculo.repository.CarroRepository;
import br.com.LocadoraVeiculo.tipos.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    @Autowired
    private CarroMapper carroMapper;

    @Autowired
    private AcessorioRepository acessorioRepository;

    public List<Object[]> listarCarros() {
        var carros = carroRepository.listarTodosCarros();

        if (carros.isEmpty()) {
            throw new RuntimeException("Lista de carros vazia");
        }
        return carros;
//        return listToDTO(carros);
    }

    public List<ListagemCarroDisponivelDTO> listarCarrosDisponiveis() {
        var carros = carroRepository.listarCarrosDisponiveis();

        if (carros.isEmpty()) {
            throw new RuntimeException("Lista de carros vazia");
        }

        return carros;
    }

    public List<Carro> listarCarrosPorCategoria(String categoria) {
        var carros = carroRepository.listarCarrosPorCategoria(Categoria.fromString(categoria));

        if (carros.isEmpty()) {
            throw new RuntimeException("Lista de carros vazia");
        }

        return carros;
    }

    public List<Carro> listarCarrosPorAcessorios(String acessorio) {
        var acessorio1 = acessorioRepository.findByDescricao(acessorio);

        var carros = carroRepository.listarCarrosPorAcessorios(acessorio1.getIdAcessorio());

        if (carros.isEmpty()) {
            throw new RuntimeException("Lista de carros vazia");
        }
        return carros;
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
