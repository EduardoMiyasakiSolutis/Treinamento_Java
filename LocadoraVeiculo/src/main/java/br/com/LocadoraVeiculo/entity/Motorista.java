package br.com.LocadoraVeiculo.entity;

import br.com.LocadoraVeiculo.dto.CadastroMotoristaDTO;
import br.com.LocadoraVeiculo.tipos.Sexo;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Motorista extends Pessoa {

    private String numeroCNH;

    public Motorista(CadastroMotoristaDTO motoristaDTO) {
        super(motoristaDTO.nome(), motoristaDTO.dataNascimento(), motoristaDTO.cpf(), Sexo.fromString(motoristaDTO.sexo()), motoristaDTO.email());
        this.numeroCNH = numeroCNH;
    }
}
