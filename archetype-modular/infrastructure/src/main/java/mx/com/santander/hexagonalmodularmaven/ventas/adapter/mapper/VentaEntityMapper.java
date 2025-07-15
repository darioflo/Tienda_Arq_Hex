package mx.com.santander.hexagonalmodularmaven.ventas.adapter.mapper;

import mx.com.santander.hexagonalmodularmaven.ventas.adapter.entity.ProductoCompradoEntity;
import mx.com.santander.hexagonalmodularmaven.ventas.adapter.entity.VentaEntity;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.command.ProductoVentaCommand;
import mx.com.santander.hexagonalmodularmaven.ventas.model.entity.ProductosComprados;
import mx.com.santander.hexagonalmodularmaven.ventas.model.entity.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class VentaEntityMapper {

    @Autowired
    private ProductoCompradoEntityMapper productoCompradoEntityMapper;

    public VentaEntity toEntity(Venta venta) {
        VentaEntity entity = new VentaEntity();
        entity.setIdCliente(venta.getIdCliente());
        entity.setCantidadProductos(venta.getCantidadProductos());
        entity.setPrecioTotal(venta.getPrecioTotal());
        entity.setFechaCompra(venta.getFechaCompra());

        if (venta.getProductosComprados() != null) {
            List<ProductoCompradoEntity> productos = venta.getProductosComprados().stream()
                .map(p -> productoCompradoEntityMapper.toEntity(p, entity))
                .collect(Collectors.toList());
            entity.setProductosComprados(productos);
        }

        return entity;
    }

    public Venta toModel(VentaEntity entity) {
        Venta venta = new Venta(
            entity.getIdCliente(),
            entity.getCantidadProductos(),
            null,
            entity.getPrecioTotal(),
            entity.getFechaCompra()
        );

        if (entity.getProductosComprados() != null) {
            List<ProductoVentaCommand> productos = entity.getProductosComprados().stream()
                .map(productoCompradoEntityMapper::toModel)
                .collect(Collectors.toList());
            venta = new Venta(
                entity.getIdCliente(),
                entity.getCantidadProductos(),
                new ProductosComprados(productos),
                entity.getPrecioTotal(),
                entity.getFechaCompra()
            );
        }

        return venta;
    }
}
