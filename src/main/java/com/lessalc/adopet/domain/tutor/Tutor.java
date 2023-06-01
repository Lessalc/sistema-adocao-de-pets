package com.lessalc.adopet.domain.tutor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tutores")
@Entity(name = "Tutores")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String senha;
    private String nome;
    private String telefone;
    private String sobre;
    private String cidade;
    private String urlFoto;


    public Tutor(DadosCadastroTutores dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.senha = dados.senha();
    }
}
