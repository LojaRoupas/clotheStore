package com.trier.clothestore.repository;

import com.trier.clothestore.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

    @Repository
    public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {
        Optional<UsuarioModel> findByIdUsuario(Integer idUsuario);
        Optional<UsuarioModel> findAllByIdUsuario(Integer idUsuario);

    }
