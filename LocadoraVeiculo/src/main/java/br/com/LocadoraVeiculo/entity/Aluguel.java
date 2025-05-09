package br.com.LocadoraVeiculo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAluguel;

    private Calendar dataPedido;

    private LocalDate dataEntrega;

    private LocalDate dataDevolucao;

    private BigDecimal valorTotal;

    @ManyToOne
    private Motorista motorista;

    @OneToOne
    private ApoliceSeguro apoliceSeguro;

    @ManyToOne
    private Carro carro;
}
