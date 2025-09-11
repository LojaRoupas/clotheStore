package com.trier.clothestore.repository;

import com.trier.clothestore.model.PedidoModel;
import com.trier.clothestore.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoModel, Integer> {
    Optional<PedidoModel> findByIdPedido(Integer idPedido);
    Optional<PedidoModel> findAllByIdPedido(Integer idPedido);

}
