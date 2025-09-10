package com.farmacia.elessandro.controller;

import org.springframework.http.HttpStatus;
import com.farmacia.elessandro.dto.ProdutoDto;
import com.farmacia.elessandro.model.ProdutoModel;
import com.farmacia.elessandro.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/produto")

public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public ResponseEntity<ProdutoModel> salvar(@RequestBody @Valid ProdutoDto produtoDto) {
        var produtoModel = new ProdutoModel();
        BeanUtils.copyProperties(produtoDto, produtoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produtoModel));
    }

    @GetMapping()
    public ResponseEntity<List<ProdutoModel>> listar() {
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.findAll());
    }

    @GetMapping("/{cdProduto}")
    public ResponseEntity<Object> getProduto(@PathVariable("cdProduto") Integer cdProduto) {
        Optional<ProdutoModel> produto0 = produtoRepository.findById(cdProduto);
        if (produto0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto nâo encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(produto0.get());
    }
}
