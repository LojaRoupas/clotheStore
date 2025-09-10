package com.trier.clothestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

    @Repository
    public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {
        Optional<UsuarioModel> findByCdUsuario(Integer cdUsuario);
        Optional<UsuarioModel> findAllByCdUsuario(Integer cdUsuario);

    }
