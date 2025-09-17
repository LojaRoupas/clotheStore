package com.trier.clothestore.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsuarioDto(

        @Email @NotBlank(message = "Não é possível salvar um usuário sem o email")
        String emailUsuario,

        @NotBlank(message = "Não é possível salvar um usuário sem o email")
        String senhaUsuario) {

}
