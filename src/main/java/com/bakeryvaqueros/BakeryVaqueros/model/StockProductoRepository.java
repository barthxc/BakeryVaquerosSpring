package com.bakeryvaqueros.BakeryVaqueros.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bakeryvaqueros.BakeryVaqueros.entities.StockProducto;

@Repository
public interface StockProductoRepository extends JpaRepository<StockProducto, Long> {
    // Aquí puedes agregar consultas personalizadas si es necesario
}