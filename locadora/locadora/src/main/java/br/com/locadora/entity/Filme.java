package br.com.locadora.entity;

import br.com.locadora.dto.CadastroFilmeDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
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
