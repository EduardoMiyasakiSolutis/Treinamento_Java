package br.com.LocadoraVeiculo.entity;

import br.com.LocadoraVeiculo.tipos.Sexo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "pessoaType")
@MappedSuperclass
//@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idPessoa;

    private String nome;

    private LocalDate dataNascimento;

    @Column(unique = true)
    private String cpf;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column(unique = true)
    private String email;

    public Pessoa(String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
        this.email = email;
    }
}
