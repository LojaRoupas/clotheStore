package com.farmacia.elessandro.dto;

import jakarta.validation.constraints.NotBlank;

public record CargoDto(
        @NotBlank(message = "Nao e possivel salvar um cargo sem nome")
        String nmCargo) {
}
