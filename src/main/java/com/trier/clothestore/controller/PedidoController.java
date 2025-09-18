package com.trier.clothestore.controller;

import com.trier.clothestore.dto.PedidoDto;
import com.trier.clothestore.model.PedidoModel;
import com.trier.clothestore.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<PedidoModel> salvar(@RequestBody @Valid PedidoDto pedidoDto) {
        PedidoModel pedido0 = pedidoService.salvar(pedidoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedido0);
    }

    @GetMapping()
    public ResponseEntity<List<PedidoModel>> listar() {
        return ResponseEntity.status(HttpStatus.OK).body(pedidoService.listar());
    }

    @GetMapping("/{idPedido}")
    public ResponseEntity<Object> getPedido(@PathVariable("idPedido") Integer idPedido) {
        Optional<PedidoModel> pedido0 = pedidoService.getPedido(idPedido);
        if (pedido0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pedido não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(pedido0.get());
    }
}