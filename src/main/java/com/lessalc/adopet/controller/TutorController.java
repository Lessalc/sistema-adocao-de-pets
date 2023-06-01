package com.lessalc.adopet.controller;

import com.lessalc.adopet.domain.tutor.DadosCadastroTutores;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroTutores dados, UriComponentsBuilder uri){
        return null;
    }
}
