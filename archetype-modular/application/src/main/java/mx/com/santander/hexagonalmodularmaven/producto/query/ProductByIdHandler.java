package mx.com.santander.hexagonalmodularmaven.producto.query;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.mapper.ProductoDtoMapper;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.ProductoDTO;
import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;
import mx.com.santander.hexagonalmodularmaven.producto.service.ProductoFindService;

@Component
@RequiredArgsConstructor
public class ProductByIdHandler {
    
    private final ProductoFindService productoFindService;
    private final ProductoDtoMapper productoDtoMapper;

    public ProductoDTO handler(Long id) {
        Producto producto = productoFindService.findProducto(id);
        return productoDtoMapper.toDto(producto);
    }
}
