package mx.com.santander.hexagonalmodularmaven.ventas.adapter.mapper;

import mx.com.santander.hexagonalmodularmaven.ventas.adapter.entity.ProductoCompradoEntity;
import mx.com.santander.hexagonalmodularmaven.ventas.adapter.entity.VentaEntity;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.command.ProductoVentaCommand;
import org.springframework.stereotype.Component;

@Component
public class ProductoCompradoEntityMapper {

    public ProductoCompradoEntity toEntity(ProductoVentaCommand producto, VentaEntity ventaEntity) {
        ProductoCompradoEntity entity = new ProductoCompradoEntity();
        entity.setProductoId(producto.getProductoId());
        entity.setNombre(producto.getNombre());
        entity.setCantidad(producto.getCantidad());
        entity.setPrecio(producto.getPrecio());
        entity.setStock(producto.getStock());
        entity.setVenta(ventaEntity);
        return entity;
    }

    public ProductoVentaCommand toModel(ProductoCompradoEntity entity) {
        return new ProductoVentaCommand(
            entity.getProductoId(),
            entity.getNombre(),
            entity.getPrecio(),
            entity.getCantidad(),
            entity.getStock()
        );
    }
}
