package br.com.LocadoraVeiculo.entity;

import br.com.LocadoraVeiculo.dto.CadastroMotoristaDTO;
import br.com.LocadoraVeiculo.tipos.Sexo;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@DiscriminatorValue("PESSOA_MOTORISTA")
@Entity
public class Motorista extends Pessoa {

    private String numeroCNH;

    public Motorista(CadastroMotoristaDTO motoristaDTO) {
        super(motoristaDTO.nome(), motoristaDTO.dataNascimento(), motoristaDTO.cpf(), Sexo.fromString(motoristaDTO.sexo()), motoristaDTO.email());
        this.numeroCNH = motoristaDTO.numeroCNH();
    }
}
