package com.trier.clothestore.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    //BANCO
    @ManyToOne
    @JoinColumn(name = "idPedido")
    @JsonBackReference // Anotacao tirar loop infinito
    private PedidoModel pedido;

    @ManyToOne
    @JoinColumn(name = "idProduto")
    private ProdutoModel produto;

}


