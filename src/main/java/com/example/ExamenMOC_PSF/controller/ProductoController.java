package com.example.ExamenMOC_PSF.controller;

import com.example.ExamenMOC_PSF.entity.Producto;
import com.example.ExamenMOC_PSF.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping(value = "/productos")
    public Producto addProducto(@RequestBody Producto producto) {
        return this.productoService.addProducto(producto);
    }

    @DeleteMapping(value = "/producto/{productoId}")
    public void deleteProducto(@PathVariable Long productoId) {
        this.productoService.eliminarProductoById(productoId);
    }

    @PutMapping(value = "/producto/{productoId}")
    public Producto modificarProducto(@PathVariable Long productoId, @RequestBody Producto producto) {
        return this.productoService.modificarProducto(productoId, producto);
    }

    @GetMapping(value = "/productos")
    public List<Producto> getProductos(@RequestParam(defaultValue = "0.0") Float precio,
                                     @RequestParam(defaultValue = "") String categoria) {
        List<Producto> productos = null;
        if ((precio != 0.0 && !categoria.isEmpty()) || (precio == 0.0 && categoria.isEmpty())){
            productos = this.productoService.findAllProductos();
        } else if (precio != 0.0){
            productos = this.productoService.findByPrecio(precio);
        } else{
            productos = this.productoService.findByCategoria(categoria);
        }

        return productos;
    }

    @GetMapping(value = "/producto/{productoId}")
    public Optional<Producto> getProducto(@PathVariable Long productoId) {
        return this.productoService.findProducto(productoId);
    }

}