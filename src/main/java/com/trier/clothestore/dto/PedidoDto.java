package com.trier.clothestore.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;

public record PedidoDto(

        @NotNull(message = "A lista não pode estar vazia")
        @Size(min = 1, message = "O pedido deve conter ao menos um item")
        List<ItemPedidoDto> itens) {
}
