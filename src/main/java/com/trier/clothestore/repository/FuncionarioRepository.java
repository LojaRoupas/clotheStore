package com.farmacia.elessandro.repository;

import com.farmacia.elessandro.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


    @Repository
    public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Integer> {
        Optional<FuncionarioModel> findByCdFuncionario(Integer cdFuncionario);
        Optional<FuncionarioModel> findAllByCdFuncionario(Integer cdFuncionario);

    }

