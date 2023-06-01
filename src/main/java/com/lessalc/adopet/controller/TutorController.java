package com.lessalc.adopet.controller;

import com.lessalc.adopet.domain.tutor.*;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    @Autowired
    private TutorRepository repository;

    @Autowired
    private AtualizaTutorService service;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroTutores dados,
                                    UriComponentsBuilder uriBuilder){
        var tutor = new Tutor(dados);
        repository.save(tutor);
        var uri = uriBuilder.path("/tutores/{id}").buildAndExpand(tutor.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoTutorCadastrado(tutor));
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity atualizaPerfilTutor(@PathVariable Long id,
                                              @RequestBody DadosAtualizacaoTutores dto){

        Tutor tutor = service.atualizaTodosDados(id, dto);

        //tutor.atualizaDados(dto);
        return ResponseEntity.ok(new DadosAtualizadosTutores(tutor));
    }
}
