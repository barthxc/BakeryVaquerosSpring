package com.bakeryvaqueros.BakeryVaqueros.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bakeryvaqueros.BakeryVaqueros.entities.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}


