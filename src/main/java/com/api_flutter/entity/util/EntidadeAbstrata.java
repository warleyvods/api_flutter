package com.api_flutter.entity.util;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@Component
@MappedSuperclass
public class EntidadeAbstrata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
