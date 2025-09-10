package com.farmacia.elessandro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

    @Repository
    public interface UsuarioRepository extends JpaRepository<com.farmacia.elessandro.model.UsuarioModel, Integer> {
        Optional<com.farmacia.elessandro.model.UsuarioModel> findByCdCliente(Integer cdCliente);
        Optional<com.farmacia.elessandro.model.UsuarioModel> findAllByCdCliente(Integer cdCliente);

    }
