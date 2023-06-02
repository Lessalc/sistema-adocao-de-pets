package com.lessalc.adopet.domain.tutor;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtualizaTutorService {

    @Autowired
    private TutorRepository repository;

    public Tutor atualizaTodosDados(Long id, DadosAtualizacaoTutores dto){
        var tutor = repository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        verificaMudancaEAtualiza(dto, tutor);
        return tutor;
    }

    private void verificaMudancaEAtualiza(DadosAtualizacaoTutores dto, Tutor tutor){
        if(dto.url_foto() != null)
            tutor.setUrlFoto(dto.url_foto());
        if(dto.nome() != null && !dto.nome().equals(""))
            tutor.setNome(dto.nome());
        if(dto.telefone() != null)
            tutor.setTelefone(dto.telefone());
        if(dto.cidade() != null)
            tutor.setCidade(dto.cidade());
        if(dto.sobre() != null)
            tutor.setSobre(dto.sobre());
    }
}
