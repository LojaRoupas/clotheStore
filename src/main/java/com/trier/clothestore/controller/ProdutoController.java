package com.trier.clothestore.controller;

import com.trier.clothestore.dto.ProdutoDto;
import com.trier.clothestore.model.ProdutoModel;
import com.trier.clothestore.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoModel> salvar(@RequestBody @Valid ProdutoDto produtoDto) {
        ProdutoModel produto0 = produtoService.salvar(produtoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto0);
    }

    @GetMapping()
    public ResponseEntity<List<ProdutoModel>> listar() {
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.listar());
    }

    @GetMapping("/{idProduto}")
    public ResponseEntity<Object> getProduto(@PathVariable("idProduto") Integer idProduto) {
        Optional<ProdutoModel> produto0 = produtoService.getProduto(idProduto);
        if (produto0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(produto0.get());
    }
}