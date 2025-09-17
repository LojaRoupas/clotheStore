package com.trier.clothestore.service;

import com.trier.clothestore.dto.ProdutoDto;
import com.trier.clothestore.model.ProdutoModel;
import com.trier.clothestore.repository.ProdutoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    public ProdutoModel salvar(ProdutoDto produtoDto) {
        var produtoModel = new ProdutoModel();
        BeanUtils.copyProperties(produtoDto, produtoModel);
        return produtoRepository.save(produtoModel);
    }


    public List<ProdutoModel> listar() {
        return produtoRepository.findAll();
    }


    public Optional<ProdutoModel> getProduto(Integer idProduto) {
        return produtoRepository.findById(idProduto);
    }
}