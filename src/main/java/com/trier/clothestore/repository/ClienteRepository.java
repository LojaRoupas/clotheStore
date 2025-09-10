package com.farmacia.elessandro.repository;

import com.farmacia.elessandro.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

    @Repository
    public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {
        Optional<ClienteModel> findByCdCliente(Integer cdCliente);
        Optional<ClienteModel> findAllByCdCliente(Integer cdCliente);

    }
