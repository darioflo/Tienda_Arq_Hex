package mx.com.santander.hexagonalmodularmaven.producto.command;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.service.ProductoDeleteService;

@Service
@AllArgsConstructor
public class DeleteProductHandler {
    
    private final ProductoDeleteService productoDeleteService;

    public void handler(Long id) {
        productoDeleteService.deleteProduct(id);
    }
}
