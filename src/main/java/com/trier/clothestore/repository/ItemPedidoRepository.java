package com.trier.clothestore.repository;

import com.trier.clothestore.model.ItemPedidoModel;
import com.trier.clothestore.model.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedidoModel, Integer> {
    Optional<ItemPedidoModel> findByIdItemPedido(Integer idItemPedido);
    Optional<ItemPedidoModel> findAllByIdItemPedido(Integer idItemPedido);

}
