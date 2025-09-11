package com.trier.clothestore.controller;

import com.trier.clothestore.dto.PedidoDto;
import com.trier.clothestore.dto.ProdutoDto;
import com.trier.clothestore.model.PedidoModel;
import com.trier.clothestore.model.ProdutoModel;
import com.trier.clothestore.repository.PedidoRepository;
import com.trier.clothestore.repository.ProdutoRepository;
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
@RequestMapping("/api/v1/pedido")

public class PedidoController {
    @Autowired
    private PedidoRepository pedidoRepository;

    @PostMapping
    public ResponseEntity<PedidoModel> salvar(@RequestBody @Valid PedidoDto pedidoDto) {
        var pedidoModel = new PedidoModel();
        BeanUtils.copyProperties(pedidoDto, pedidoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoRepository.save(pedidoModel));
    }

    @GetMapping()
    public ResponseEntity<List<PedidoModel>> listar() {
        return ResponseEntity.status(HttpStatus.OK).body(pedidoRepository.findAll());
    }

    @GetMapping("/{idPedido}")
    public ResponseEntity<Object> getPedido(@PathVariable("idPedido") Integer idPedido) {
        Optional<PedidoModel> pedido0 = pedidoRepository.findById(idPedido);
        if (pedido0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pedido nâo encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(pedido0.get());
    }
}
