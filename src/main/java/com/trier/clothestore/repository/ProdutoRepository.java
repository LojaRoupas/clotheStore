package com.farmacia.elessandro.repository;

import com.farmacia.elessandro.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {
    Optional<ProdutoModel> findByCdProduto(Integer cdProduto);
    Optional<ProdutoModel> findAllByCdProduto(Integer cdProduto);

}
