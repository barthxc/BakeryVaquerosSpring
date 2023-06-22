package com.bakeryvaqueros.BakeryVaqueros.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bakeryvaqueros.BakeryVaqueros.model.StockProductoRepository;

@Service
public class StockProductoService {
    private final StockProductoRepository stockProductoRepository;

    @Autowired
    public StockProductoService(StockProductoRepository stockProductoRepository) {
        this.stockProductoRepository = stockProductoRepository;
    }

    // Aquí puedes agregar métodos de servicio para manipular los stocks de productos

}
