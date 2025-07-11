package mx.com.santander.hexagonalmodularmaven.producto.command;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.mapper.ProductoDtoMapper;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.ProductoDTO;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.command.ProductoCreateCommand;
import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;
import mx.com.santander.hexagonalmodularmaven.producto.service.ProductoCreateService;

@Service
@AllArgsConstructor
public class CreateProductHandler {

    private final ProductoCreateService productoCreateService;
    private final ProductoDtoMapper productoDtoMapper;

    public ProductoDTO handler(ProductoCreateCommand productoCreateCommand) {
        Producto productoCreado = productoCreateService.createProduct(productoCreateCommand);
        return productoDtoMapper.toDto(productoCreado);
    }
}
