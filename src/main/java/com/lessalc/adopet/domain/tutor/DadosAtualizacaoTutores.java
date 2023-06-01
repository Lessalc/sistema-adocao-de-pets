package com.lessalc.adopet.domain.tutor;

import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacaoTutores(
        String url_foto,
        String nome,
        String telefone,
        String cidade,
        String sobre) {
}
