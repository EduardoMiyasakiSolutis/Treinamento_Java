package br.com.LocadoraVeiculo.mapper;

import br.com.LocadoraVeiculo.dto.CadastroAluguelDTO;
import br.com.LocadoraVeiculo.dto.ListagemAluguelDTO;
import br.com.LocadoraVeiculo.entity.Aluguel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AluguelMapper {

    @Mapping(source = "metodoPagamento", target = "pagamento")
//    @Mapping(target = "", source = "placa", ignore = true)
    Aluguel toEntity(CadastroAluguelDTO dto);

    ListagemAluguelDTO toListagemAluguelDTO(Aluguel entity);

}
