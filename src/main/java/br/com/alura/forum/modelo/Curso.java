package br.com.alura.forum.modelo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Curso {

    @EqualsAndHashCode.Include
    private Long id;
    private String nome;
    private String categoria;
}
