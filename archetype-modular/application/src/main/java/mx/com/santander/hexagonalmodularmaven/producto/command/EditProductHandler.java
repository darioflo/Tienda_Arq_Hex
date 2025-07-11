package mx.com.santander.hexagonalmodularmaven.producto.command;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.mapper.ProductoDtoMapper;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.ProductoDTO;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.command.ProductoEditCommand;
import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;
import mx.com.santander.hexagonalmodularmaven.producto.service.ProductoEditService;

@Service
@AllArgsConstructor
public class EditProductHandler {

    private final ProductoEditService productoEditService;
    private final ProductoDtoMapper productoDtoMapper;

    public ProductoDTO handler(ProductoEditCommand productoEditCommand) {
        Producto productoActualizado = productoEditService.editProduct(productoEditCommand);
        return productoDtoMapper.toDto(productoActualizado);
    }
}
