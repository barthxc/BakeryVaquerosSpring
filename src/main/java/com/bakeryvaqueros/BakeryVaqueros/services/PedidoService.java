package com.bakeryvaqueros.BakeryVaqueros.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bakeryvaqueros.BakeryVaqueros.entities.Pedido;
import com.bakeryvaqueros.BakeryVaqueros.model.PedidoRepository;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido guardarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido buscarPedidoPorId(Long idPedido) {
        Optional<Pedido> pedidoOptional = pedidoRepository.findById(idPedido);
        return pedidoOptional.orElse(null);
    }
}
