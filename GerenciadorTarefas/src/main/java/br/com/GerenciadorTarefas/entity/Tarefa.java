package br.com.GerenciadorTarefas.entity;

import br.com.GerenciadorTarefas.dto.CadastroTarefaDTO;
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
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;

    public Tarefa(CadastroTarefaDTO dto) {
        this.titulo = dto.titulo();
    }
}
