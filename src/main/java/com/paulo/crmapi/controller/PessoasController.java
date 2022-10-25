package com.paulo.crmapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.paulo.crmapi.model.Pessoas;
import com.paulo.crmapi.repository.PessoasRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoasController {

    @Autowired
    private PessoasRepository pessoasRepository;

    @GetMapping
    public Iterable<Pessoas> listar(){
        return pessoasRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoas adicionar (@RequestBody Pessoas pessoa){
        return pessoasRepository.save(pessoa);
    }
    
}
