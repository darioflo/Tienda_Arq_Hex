package mx.com.santander.hexagonalmodularmaven.producto.mapper;

import mx.com.santander.hexagonalmodularmaven.producto.model.dto.ProductoDTO;
import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductoDtoMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "precio", target = "precio")
    @Mapping(source = "stock", target = "stock")
    ProductoDTO toDto(Producto producto);
}
