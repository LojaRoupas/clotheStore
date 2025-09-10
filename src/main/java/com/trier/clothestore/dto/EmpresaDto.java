package com.farmacia.elessandro.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EmpresaDto(
        @NotBlank(message = "Nao e possivel salvar uma empresa sem nome")
        String nmEmpresa,

        @NotBlank(message = "Nao e possivel salvar uma empresa sem cnpj")
        String cnpjEmpresa,

        @NotBlank(message = "Nao e possivel salvar uma empresa sem telefone")
        String telefoneEmpresa,

        @NotBlank(message = "Nao e possivel salvar uma empresa sem endereco")
        String enderecoEmpresa,

        @Email @NotBlank(message = "Nao e possivel salvar uma empresa sem email")
        String emailEmpresa) {
}