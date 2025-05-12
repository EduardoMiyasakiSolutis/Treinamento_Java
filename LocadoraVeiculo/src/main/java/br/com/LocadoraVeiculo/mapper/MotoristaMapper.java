package br.com.LocadoraVeiculo.mapper;

import br.com.LocadoraVeiculo.dto.CadastroMotoristaDTO;
import br.com.LocadoraVeiculo.dto.ListagemMotoristaDTO;
import br.com.LocadoraVeiculo.entity.Motorista;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MotoristaMapper {
    Motorista toEntity(CadastroMotoristaDTO dto);

    ListagemMotoristaDTO toListagemMotoristaDTO(Motorista entity);

}
