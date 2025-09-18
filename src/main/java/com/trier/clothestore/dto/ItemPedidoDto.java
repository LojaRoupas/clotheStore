
package com.trier.clothestore.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ItemPedidoDto(

        @NotNull(message = "Informe o id do produto")
        Integer idProduto,

        @NotNull(message = "Não é possível salvar um produto sem quantidade")
        Integer quantidade,

        @NotNull(message = "Não é possível salvar um produto sem valor")
        @DecimalMin(value = "0.01", message = "Não é possivel salvar um valor abaixo de 0.01")
        Double precoUnitario)

{
}
