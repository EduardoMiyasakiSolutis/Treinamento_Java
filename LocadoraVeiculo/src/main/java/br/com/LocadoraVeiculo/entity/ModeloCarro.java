package br.com.LocadoraVeiculo.entity;

import br.com.LocadoraVeiculo.tipos.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ModeloCarro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idModelo;

    private String descricao;

    @ManyToOne
    private Fabricante fabricante;

    private Categoria categoria;
}
