package com.api_flutter.service;

import com.api_flutter.entity.Tarefa;
import com.api_flutter.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    TarefaRepository tarefaRepository;

    public Tarefa salvar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> obterTarefas() {
        return tarefaRepository.findAll();
    }

    public void deletarTarefas(Long id){
        tarefaRepository.delete(tarefaRepository.findById(id).get());
    }

    public Optional<Tarefa> obterPorId(Long id) {
        return tarefaRepository.findById(id);
    }

}
