package com.trier.clothestore.service;

import com.trier.clothestore.dto.PedidoDto;
import com.trier.clothestore.model.ItemPedidoModel;
import com.trier.clothestore.model.PedidoModel;
import com.trier.clothestore.model.ProdutoModel;
import com.trier.clothestore.repository.PedidoRepository;
import com.trier.clothestore.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Transactional
    public PedidoModel salvar(PedidoDto pedidoDto) {
        var pedidoModel = new PedidoModel();

        List<ItemPedidoModel> itensModel = new java.util.ArrayList<>();
        for (var itemDto : pedidoDto.itens()) {
            var itemModel = new ItemPedidoModel();
            itemModel.setQuantidade(itemDto.quantidade());
            itemModel.setPrecoUnitario(itemDto.precoUnitario());
            itemModel.setPedido(pedidoModel); // associa o item ao pedido


            ProdutoModel produto = produtoRepository.findById(itemDto.idProduto())
                    .orElseThrow(() -> new RuntimeException("Produto não encontrado: " + itemDto.idProduto()));
            itemModel.setProduto(produto);

            itensModel.add(itemModel);
        }

        pedidoModel.setItens(itensModel);

        return pedidoRepository.save(pedidoModel);
    }


    public List<PedidoModel> listar() {
        return pedidoRepository.findAll();
    }

    public Optional<PedidoModel> getPedido(Integer idPedido) {
        return pedidoRepository.findById(idPedido);
    }
}