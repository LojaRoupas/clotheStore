package com.trier.clothestore.repository;

import com.trier.clothestore.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {

}
