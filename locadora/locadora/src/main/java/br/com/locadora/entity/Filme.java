package br.com.locadora.entity;

import br.com.locadora.dto.CadastroFilmeDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFilme;

    private String titulo;

    private String genero;

    private String diretor;



    public Filme(CadastroFilmeDTO filmeDTO) {
        this.titulo = filmeDTO.titulo();
        this.genero = filmeDTO.genero();
        this.diretor = filmeDTO.diretor();
    }

}
