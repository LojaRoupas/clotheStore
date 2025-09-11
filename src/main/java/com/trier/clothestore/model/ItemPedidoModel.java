package com.trier.clothestore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TBITEMPEDIDO")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ItemPedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idItemPedido")
    private Integer idItemPedido;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "precoUnitario")
    private Double precoUnitario;

// VERIFICAR AQUI EM BAIXO
    @ManyToOne
    @JoinColumn(name = "idPedido")
    private PedidoModel pedido;
//

    }
