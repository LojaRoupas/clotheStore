package com.trier.clothestore.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsuarioDto(
        @NotBlank(message = "Nao e possivel salvar um cliente sem nome")
        String nmUsuario,

        @NotBlank(message = "Nao e possivel salvar um cliente sem cpf")
        String cpfUsuario,

        @NotBlank(message = "Nao e possivel salvar um cliente sem telefone")
        String telefoneUsuario,

        @Email @NotBlank(message = "Nao e possivel salvar um cliente sem email")
        String emailUsuario) {
}
