package br.com.LocadoraVeiculo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAcessorio;

    private String descricao;

    @ManyToMany(mappedBy = "acessorios")
    private List<Carro> carros;
}
