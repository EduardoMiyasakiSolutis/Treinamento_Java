package br.com.GerenciadorTarefas.service;

import br.com.GerenciadorTarefas.dto.CadastroTarefaDTO;
import br.com.GerenciadorTarefas.dto.ListagemTarefaDTO;
import br.com.GerenciadorTarefas.entity.Tarefa;
import br.com.GerenciadorTarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public ListagemTarefaDTO saveTarefa(CadastroTarefaDTO dto) {
        var tarefa = new Tarefa(dto);
        tarefaRepository.save(tarefa);
        return toDTO(tarefa);
    }

    public ListagemTarefaDTO getOneTarefa(long id) {
        var tarefaEncontrada = tarefaRepository.findById(id);

        if (tarefaEncontrada.isEmpty()) {
            throw new RuntimeException("Não há tarefas");
        }
        return toDTO(tarefaEncontrada.get());
    }

    public List<ListagemTarefaDTO> getAllTarefa() {
        var listaTasks = tarefaRepository.findAll();

        if (listaTasks.isEmpty()) {
            throw new RuntimeException("Não há tarefas");
        }
        return listToDTO(listaTasks);
    }

    public ListagemTarefaDTO deleteTarefa(long id) {
        var tarefaEncontrada = tarefaRepository.findById(id);

        if (tarefaEncontrada.isEmpty()) {
            throw new RuntimeException("Não há tarefas");
        }

        tarefaRepository.deleteById(id);
        return toDTO(tarefaEncontrada.get());
    }


    public ListagemTarefaDTO toDTO(Tarefa tarefa) {
        var listagemTarefa = new ListagemTarefaDTO(tarefa.getTitulo());
        return listagemTarefa;
    }

    public List<ListagemTarefaDTO> listToDTO(List<Tarefa> tarefa) {
        List<ListagemTarefaDTO> listaTarefa = new ArrayList<>();
        tarefa.forEach(t -> listaTarefa.add(new ListagemTarefaDTO(t.getTitulo())));

        return listaTarefa;
    }
}
