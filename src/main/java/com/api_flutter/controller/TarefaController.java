package com.api_flutter.controller;

import com.api_flutter.entity.Tarefa;
import com.api_flutter.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    TarefaService tarefaService;

    @PostMapping("/salvar")
    public Tarefa salvar(@RequestBody Tarefa tarefa) {
        return tarefaService.salvar(tarefa);
    }

    @DeleteMapping("/remover/{id}")
    public void deletarTarefa(@PathVariable Long id) {
        tarefaService.deletarTarefas(id);
    }

    @GetMapping("/obterPorId/{id}")
    public Optional<Tarefa> obterPorId(@PathVariable Long id) {
        return tarefaService.obterPorId(id);
    }

    @GetMapping("/obterLista")
    public List<Tarefa> obterLista() {
        return tarefaService.obterTarefas();
    }

}
