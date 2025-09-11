package com.trier.clothestore.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public record PedidoDto(

        @NotNull(message = "A lista de itens nao pode ser nula")
        @Size(min = 1, message = "O pedido deve conter ao menos um item")
        List<ItemPedidoDto> itens) {
}
