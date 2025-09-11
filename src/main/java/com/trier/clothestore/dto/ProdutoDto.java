package com.trier.clothestore.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoDto(
        @NotBlank(message = "Nao e possivel salvar um produto sem nome")
        String nomeProduto,

        @NotNull(message = "Nao e possivel salvar um produto sem valor")
        @DecimalMin(value = "0.01", message = "Nao e possivel salvar um valor abaixo de 0.01")
        Double precoProduto) {

}
