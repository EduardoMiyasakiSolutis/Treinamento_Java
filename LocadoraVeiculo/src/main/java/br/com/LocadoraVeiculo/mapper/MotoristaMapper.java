package br.com.LocadoraVeiculo.mapper;

import br.com.LocadoraVeiculo.dto.CadastroMotoristaDTO;
import br.com.LocadoraVeiculo.dto.ListagemMotoristaDTO;
import br.com.LocadoraVeiculo.entity.Motorista;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MotoristaMapper {

    @Mapping(source = "nome", target =  "nome")
    Motorista toEntity(CadastroMotoristaDTO dto);

//   @Mapping(source = "numeroCNH", target =  "numeroCNH")
    ListagemMotoristaDTO toListagemMotoristaDTO(Motorista entity);

}
