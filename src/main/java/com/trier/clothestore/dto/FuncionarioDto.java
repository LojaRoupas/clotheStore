package com.farmacia.elessandro.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FuncionarioDto(
        @NotBlank(message = "Nao e possivel salvar um funcionário sem nome")
        String nmFuncionario,

        @NotBlank(message = "Nao e possivel salvar um funcionário sem cpf")
        String cpfFuncionario,

        @NotBlank(message = "Nao e possivel salvar um funcionário sem telefone")
        String telefoneFuncionario,

        @Email @NotBlank(message = "Nao e possivel salvar um funcionário sem email")
        String emailFuncionario,

        @NotNull(message = "Nao e possivel salvar um salario sem valor")
        @DecimalMin(value = "0.01", message = "Nao e possivel salvar um valor abaixo de 0.01")
        Double salarioFuncionario,

        @NotBlank(message = "Nao e possivel salvar um funcionário sem cargo")
        String cargoFuncionario,

        @NotNull(message = "Nao e possivel salvar um funcionário sem código do cargo")
        Integer cdCargoFuncionario) {
}