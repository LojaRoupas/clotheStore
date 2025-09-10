package com.trier.clothestore.controller;

import com.farmacia.elessandro.dto.ClienteDto;
import com.farmacia.elessandro.repository.ClienteRepository;
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
@RequestMapping("/api/v1/cliente")

public class UsuarioController {
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public ResponseEntity<com.farmacia.elessandro.model.UsuarioModel> salvar(@RequestBody @Valid ClienteDto clienteDto) {
        var clienteModel = new com.farmacia.elessandro.model.UsuarioModel();
        BeanUtils.copyProperties(clienteDto, clienteModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(clienteModel));
    }

    @GetMapping()
    public ResponseEntity<List<com.farmacia.elessandro.model.UsuarioModel>> listar() {
        return ResponseEntity.status(HttpStatus.OK).body(clienteRepository.findAll());
    }


    @GetMapping("/{cdCliente}")
    public ResponseEntity<Object> getCliente(@PathVariable("cdCliente") Integer cdCliente) {
        Optional<com.farmacia.elessandro.model.UsuarioModel> cliente0 = clienteRepository.findById(cdCliente);
        if (cliente0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente nao encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(cliente0.get());
    }
}
