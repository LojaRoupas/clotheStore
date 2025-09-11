package com.trier.clothestore.controller;

import com.trier.clothestore.dto.UsuarioDto;
import com.trier.clothestore.model.UsuarioModel;
import com.trier.clothestore.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/usuario")

public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<UsuarioModel> salvar(@RequestBody @Valid UsuarioDto usuarioDto) {
        var usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioDto, usuarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuarioModel));
    }

    @GetMapping()
    public ResponseEntity<List<UsuarioModel>> listar() {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.findAll());
    }


    @GetMapping("/{idUsuario}")
    public ResponseEntity<Object> getUsuario(@PathVariable("idUsuario") Integer idUsuario) {
        Optional<UsuarioModel> usuario0 = usuarioRepository.findById(idUsuario);
        if (usuario0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario nao encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(usuario0.get());
    }
}
