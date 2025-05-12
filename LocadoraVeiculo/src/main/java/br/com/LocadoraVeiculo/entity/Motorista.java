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

}
