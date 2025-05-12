package br.com.LocadoraVeiculo.mapper;

import br.com.LocadoraVeiculo.dto.ListagemCarroDTO;
import br.com.LocadoraVeiculo.dto.ListagemCarrosDTO;
import br.com.LocadoraVeiculo.entity.Carro;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarroMapper {
    List<ListagemCarrosDTO> toListagemCarrosDTO(List<Carro> carros);

//    List<ListagemCarroDTO> toListagemCarroDTO(List<Carro> carros);
}
