package com.api_flutter.entity;

import com.api_flutter.entity.util.EntidadeAbstrata;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Tarefas")
public class Tarefa extends EntidadeAbstrata {

    @Column(nullable = false)
    private String nome;

}
