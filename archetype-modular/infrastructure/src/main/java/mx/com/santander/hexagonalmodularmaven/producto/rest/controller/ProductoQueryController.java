package mx.com.santander.hexagonalmodularmaven.producto.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.ProductoDTO;
import mx.com.santander.hexagonalmodularmaven.producto.query.ProductAllHandler;
import mx.com.santander.hexagonalmodularmaven.producto.query.ProductByIdHandler;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/productos")
@AllArgsConstructor
public class ProductoQueryController {
    
    private ProductByIdHandler productByIdHandler;
    private ProductAllHandler productAllHandler;


    @GetMapping("")
    public ResponseEntity<List<ProductoDTO>> obtenerProductos() {
        var productos = productAllHandler.handler();
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoDTO> obtenerProductoPorId(@PathVariable Long id) {
        var productoEncontrado = productByIdHandler.handler(id);
        return ResponseEntity.ok(productoEncontrado);
    }
    
}
