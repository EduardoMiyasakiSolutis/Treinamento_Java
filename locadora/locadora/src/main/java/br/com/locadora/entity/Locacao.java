package br.com.locadora.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLocacao;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Filme filme;

    private LocalDate dataLocacao;

    private LocalDate dataDevolucao;

    private boolean devolvido = false;

    public Locacao(Cliente cliente, Filme filme) {
        this.cliente = cliente;
        this.filme = filme;
        this.dataLocacao = LocalDate.now();
    }

}
