package com.trier.clothestore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "TBPEDIDO")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPedido")
    private Integer idPedido;

//verificar aqui
//    @OneToMany(mappedBy = "pedido")
//    private List<ItemPedidoModel> itens;

    }
