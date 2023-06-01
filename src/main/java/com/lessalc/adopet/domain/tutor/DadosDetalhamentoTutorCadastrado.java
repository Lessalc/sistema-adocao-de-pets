package com.lessalc.adopet.domain.tutor;

public record DadosDetalhamentoTutorCadastrado(Long id, String nome, String email) {

    public DadosDetalhamentoTutorCadastrado(Tutor tutor){
        this(tutor.getId(), tutor.getNome(), tutor.getEmail());
    }
}
