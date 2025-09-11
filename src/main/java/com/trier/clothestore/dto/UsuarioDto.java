package com.trier.clothestore.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsuarioDto(

        @NotBlank(message = "Nao e possivel salvar um usuario sem cpf")
        String cpfUsuario,

        @Email @NotBlank(message = "Nao e possivel salvar um usuario sem email")
        String emailUsuario,

        @NotBlank(message = "Nao e possivel salvar um usuario sem email")
        String senhalUsuario) {

}
