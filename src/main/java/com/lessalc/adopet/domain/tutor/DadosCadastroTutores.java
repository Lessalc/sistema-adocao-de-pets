package com.lessalc.adopet.tutor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DadosCadastroTutores(
        @NotBlank(message = "Nome é obrigatório") String nome,
        @NotBlank @Email String email,
        @Size(min=6) String senha
) {
}
