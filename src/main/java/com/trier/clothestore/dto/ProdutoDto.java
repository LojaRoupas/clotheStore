package com.farmacia.elessandro.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoDto(
        @NotBlank(message = "Nao e possivel salvar um produto sem nome")
        String nmProduto,

        @NotBlank(message = "Nao e possivel salavar um produto sem descricao")
        String dsBula,

        @NotNull(message = "Nao e possivel salvar um produto sem valor")
        @DecimalMin(value = "0.01", message = "Nao e possivel salvar um valor abaixo de 0.01")
        Double vlProduto) {

}
