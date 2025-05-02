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

    @OneToMany
    private List<Filme> filmes = new ArrayList<Filme>();

    private LocalDate dataLocacao;

    private LocalDate dataDevolucao;

    private boolean devolvido = false;


    public Locacao(Cliente cliente, Filme filme) {
        this.cliente = cliente;
        this.filmes.add(filme);
        this.dataDevolucao = LocalDate.now();
    }

}
