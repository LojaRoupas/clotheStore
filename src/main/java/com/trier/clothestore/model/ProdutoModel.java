package com.trier.clothestore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TBPRODUTO")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduto")
    private Integer idProduto;

    @Column(name = "nomeProduto", length = 50)
    private String nomeProduto;

    @Column(name = "precoProduto")
    private Double precoProduto;


}
