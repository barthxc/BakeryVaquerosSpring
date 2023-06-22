package com.bakeryvaqueros.BakeryVaqueros.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bakeryvaqueros.BakeryVaqueros.entities.Pedido;
import com.bakeryvaqueros.BakeryVaqueros.entities.Producto;
import com.bakeryvaqueros.BakeryVaqueros.services.PedidoService;
import com.bakeryvaqueros.BakeryVaqueros.services.ProductoService;


@Controller
public class PedidoController {
    @Autowired
    private  PedidoService pedidoService;
    @Autowired
    private  ProductoService productoService;
    
  


    


    @PostMapping("/guardarMostrar")
    public String guardarMostrar(Pedido pedido, @RequestParam("nombreproducto") String[] nombresProductos, @RequestParam("cantidadproducto") Integer[] cantidadesProductos, Model model) {
        // Guardar el betide primero
        Pedido nuevoPedido = pedidoService.guardarPedido(pedido);

        // Crear una lista de productos
        List<Producto> productos = new ArrayList<>();

        for (int i = 0; i < nombresProductos.length; i++) {
            String nombreProducto = nombresProductos[i];
            Integer cantidadProducto = cantidadesProductos[i];

            // Crear un nuevo producto
            Producto producto = new Producto();
            producto.setNombreProducto(nombreProducto);
            producto.setCantidadProducto(cantidadProducto);
            producto.setPedido(nuevoPedido); // Asignar el pedido correspondiente al producto

            // Agregar el producto a la lista
            productos.add(producto);
        }

        // Guardar todos los productos en la base de datos
        productoService.guardarProductos(productos);

        // Actualizar la lista de productos en el pedido
        nuevoPedido.setProductos(productos);

        // Guardar el pedido actualizado en la base de datos
        pedidoService.guardarPedido(nuevoPedido);

        model.addAttribute("pedido", nuevoPedido);
        System.out.println(nuevoPedido.getNombre()+"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        
        if (nuevoPedido != null && "llevar".equals(nuevoPedido.getOpcionPedido())) {
            return "llevar"; // Nombre del template que deseas retornar
        } else if (nuevoPedido != null && "recoger".equals(nuevoPedido.getOpcionPedido())) {
            return "recoger"; // Nombre del template que deseas retornar
        } else {
            return "error"; // Nombre del template de error
        }

    }
    
    @GetMapping("/llevar")
    public String direccionLlevar() {
        return "llevar";
    }

    @GetMapping("/recoger")
    public String direccionRecoger() {
        return "recoger";
    }

    @GetMapping("/error")
    public String direccionError() {
        return "error";
    }
    
    @PostMapping("/llevar")
    public String mostrarLlevar() {
        return "llevar";
    }

    @PostMapping("/recoger")
    public String mostrarRecoger() {
        return "recoger";
    }

    @PostMapping("/error")
    public String mostrarError() {
        return "error";
    }
   
   
}
