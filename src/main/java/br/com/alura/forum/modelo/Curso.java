package br.com.alura.forum.modelo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Curso {

    public Curso(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    @EqualsAndHashCode.Include
    private Long id;
    private String nome;
    private String categoria;
}
