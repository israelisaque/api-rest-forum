package br.com.alura.forum.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TokenDTO {

    private String token;
    private String tipo;
}
