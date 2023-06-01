package com.lessalc.adopet.domain.tutor;

public record DadosAtualizadosTutores(
        Long id,
        String nome,
        String email,
        String url_foto,
        String telefone,
        String cidade,
        String sobre
) {
    public DadosAtualizadosTutores(Tutor tutor){
        this(tutor.getId(), tutor.getNome(), tutor.getEmail(), tutor.getUrlFoto(),
               tutor.getTelefone(), tutor.getCidade(), tutor.getSobre());
    }
}
