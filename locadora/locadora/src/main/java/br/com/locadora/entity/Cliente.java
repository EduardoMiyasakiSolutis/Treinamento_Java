package br.com.locadora.entity;

import br.com.locadora.dto.CadastroClienteDTO;
import br.com.locadora.dto.CadastroFilmeDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCliente;

    private String nome;

    private String email;

    @OneToMany
    List<Filme> listaFilme = new ArrayList<>();

    public Cliente(CadastroClienteDTO clienteDTO) {
        this.nome = clienteDTO.nome();
        this.email = clienteDTO.email();
    }
}
