package com.bakeryvaqueros.BakeryVaqueros.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StockProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;
    private String nombreStock;

    // Getters y setters

    public Long getIdStock() {
        return idStock;
    }

    public void setIdStock(Long idStock) {
        this.idStock = idStock;
    }

    public String getNombreStock() {
        return nombreStock;
    }

    public void setNombreStock(String nombreStock) {
        this.nombreStock = nombreStock;
    }
}
