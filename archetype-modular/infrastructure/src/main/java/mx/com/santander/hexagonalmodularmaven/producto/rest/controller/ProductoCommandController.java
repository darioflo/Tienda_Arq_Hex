package mx.com.santander.hexagonalmodularmaven.producto.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.command.CreateProductHandler;
import mx.com.santander.hexagonalmodularmaven.producto.command.DeleteProductHandler;
import mx.com.santander.hexagonalmodularmaven.producto.command.EditProductHandler;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.ProductoDTO;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.command.ProductoCreateCommand;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.command.ProductoEditCommand;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/productos")
@AllArgsConstructor
public class ProductoCommandController {
    
    private final CreateProductHandler createProductHandler;
    private final EditProductHandler editProductHandler;
    private final DeleteProductHandler deleteProductHandler;

    @PostMapping("")
    public ResponseEntity<ProductoDTO> crearProducto(@RequestBody ProductoCreateCommand producto) {
        var productoCreado = createProductHandler.handler(producto);
        return ResponseEntity.ok(productoCreado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductoDTO> editarProducto(@PathVariable String id, @RequestBody ProductoEditCommand producto) {
        var productoEditado = editProductHandler.handler(producto);
        return ResponseEntity.ok(productoEditado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id){
        deleteProductHandler.handler(id);
        return ResponseEntity.noContent().build();
    }
    

    
    
}
