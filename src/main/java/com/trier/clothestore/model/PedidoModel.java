package com.trier.clothestore.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    //BANCO
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.PERSIST)
    @JsonManagedReference // Anotacao tirar loop infinito
    private List<ItemPedidoModel> itens;

    //getters e setter
    public List<ItemPedidoModel> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedidoModel> itens) {
        this.itens = itens;
    }
}
