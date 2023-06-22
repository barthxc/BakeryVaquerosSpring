package com.bakeryvaqueros.BakeryVaqueros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bakeryvaqueros.BakeryVaqueros.entities.Producto;
import com.bakeryvaqueros.BakeryVaqueros.model.ProductoRepository;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> guardarProductos(List<Producto> productos) {
        return productoRepository.saveAll(productos);
    }
}
