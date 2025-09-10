package com.farmacia.elessandro.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ClienteDto(
        @NotBlank(message = "Nao e possivel salvar um cliente sem nome")
        String nmCliente,

        @NotBlank(message = "Nao e possivel salvar um cliente sem cpf")
        String cpfCliente,

        @NotBlank(message = "Nao e possivel salvar um cliente sem telefone")
        String telefoneCliente,

        @Email @NotBlank(message = "Nao e possivel salvar um cliente sem email")
        String emailCliente) {
}
