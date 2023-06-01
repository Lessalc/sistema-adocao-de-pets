package com.lessalc.adopet.controller;

import com.lessalc.adopet.domain.tutor.DadosCadastroTutores;
import com.lessalc.adopet.domain.tutor.DadosDetalhamentoTutorCadastrado;
import com.lessalc.adopet.domain.tutor.Tutor;
import com.lessalc.adopet.domain.tutor.TutorRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    @Autowired
    private TutorRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroTutores dados,
                                    UriComponentsBuilder uriBuilder){
        var tutor = new Tutor(dados);
        repository.save(tutor);
        var uri = uriBuilder.path("/tutores/{id}").buildAndExpand(tutor.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoTutorCadastrado(tutor));
    }
}
