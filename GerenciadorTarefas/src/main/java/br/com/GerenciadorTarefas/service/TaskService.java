package br.com.GerenciadorTarefas.service;

import br.com.GerenciadorTarefas.dto.CadastroTaskDTO;
import br.com.GerenciadorTarefas.dto.ListagemTaskDTO;
import br.com.GerenciadorTarefas.entity.Task;
import br.com.GerenciadorTarefas.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public ListagemTaskDTO saveTask(CadastroTaskDTO dto) {
        var task = new Task(dto);
        taskRepository.save(task);
        return toDTO(task);
    }

    public ListagemTaskDTO getOneTask(long id) {
        var taskEncontrada = taskRepository.findById(id);

        if (taskEncontrada.isEmpty()) {
            throw new RuntimeException("Não há tarefas");
        }
        return toDTO(taskEncontrada.get());
    }

    public List<ListagemTaskDTO> getAllTasks() {
        var listaTasks = taskRepository.findAll();

        if (listaTasks.isEmpty()) {
            throw new RuntimeException("Não há tarefas");
        }
        return listToDTO(listaTasks);
    }

    public ListagemTaskDTO updateTask(long id, String descricao) {

        var taskEncontrada = taskRepository.findById(id);

        if (taskEncontrada.isEmpty()) {
            throw new RuntimeException("Tarefa não encontrada");
        }

        var task = taskEncontrada.get();
        task.setDescricao(descricao);
        taskRepository.save(task);
        return toDTO(task);
    }

    public ListagemTaskDTO deleteTask(long id) {
        var taskEncontrada = taskRepository.findById(id);

        if (taskEncontrada.isEmpty()) {
            throw new RuntimeException("Não há tarefas");
        }

        taskRepository.deleteById(id);
        return toDTO(taskEncontrada.get());
    }


    public ListagemTaskDTO toDTO(Task task) {
        var listagemTask = new ListagemTaskDTO(task.getTitulo(), task.getDescricao());
        return listagemTask;
    }

    public List<ListagemTaskDTO> listToDTO(List<Task> task) {
        List<ListagemTaskDTO> listaTask = new ArrayList<>();
        task.forEach(t -> listaTask.add(new ListagemTaskDTO(t.getTitulo(), t.getDescricao())));

        return listaTask;
    }
}
