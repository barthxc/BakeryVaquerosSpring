package com.bakeryvaqueros.BakeryVaqueros.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bakeryvaqueros.BakeryVaqueros.entities.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {
    // Agrega métodos personalizados si es necesario
}
