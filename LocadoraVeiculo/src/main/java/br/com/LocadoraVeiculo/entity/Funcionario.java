package br.com.LocadoraVeiculo.entity;

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
@DiscriminatorValue("PESSOA_FUNCIONARIO")
@Entity
public class Funcionario extends Pessoa {

    private String matricula;

}
