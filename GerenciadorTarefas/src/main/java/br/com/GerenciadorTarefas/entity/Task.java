package br.com.GerenciadorTarefas.entity;

import br.com.GerenciadorTarefas.dto.CadastroTaskDTO;
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
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String descricao;

    public Task(CadastroTaskDTO dto) {
        this.titulo = dto.titulo();
        this.status = Status.fromString(dto.status());
        this.descricao = dto.descricao();
    }
}
