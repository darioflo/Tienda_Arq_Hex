package mx.com.santander.hexagonalmodularmaven.ventas.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.VentaDTO;
import mx.com.santander.hexagonalmodularmaven.ventas.model.entity.Venta;

@Mapper(componentModel = "spring")
public interface VentaDtoMapper {
    @Mapping(source = "idCliente", target = "idCliente")
    @Mapping(source = "productosComprados", target = "productosComprados")
    @Mapping(source = "cantidadProductos", target = "cantidadProductos")
    @Mapping(source = "precioTotal", target = "precioTotal")
    @Mapping(source = "fechaCompra", target = "fechaCompra")
    VentaDTO toDto(Venta venta);
}
