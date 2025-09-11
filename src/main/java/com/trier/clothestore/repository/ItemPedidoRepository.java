package com.trier.clothestore.repository;

import com.trier.clothestore.model.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemPedidoRepository extends JpaRepository<PedidoModel, Integer> {
    Optional<PedidoModel> findByIdItemPedido(Integer idItemPedido);
    Optional<PedidoModel> findAllByIdItemPedido(Integer idItemPedido);

}
