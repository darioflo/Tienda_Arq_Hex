package mx.com.santander.hexagonalmodularmaven.producto.adapter.mapper;
import mx.com.santander.hexagonalmodularmaven.producto.adapter.entity.ProductoEntity;
import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoEntityMapper {
    public Producto toDomain(ProductoEntity entity) {
        return new Producto(
                entity.getId(),
                entity.getNombre(),
                entity.getPrecio(),
                entity.getStock()
        );
    }

    public ProductoEntity toEntity(Producto producto) {
        
        ProductoEntity nuevoProducto = new ProductoEntity();
        nuevoProducto.setNombre(producto.getNombre());
        nuevoProducto.setPrecio(producto.getPrecio());
        nuevoProducto.setStock(producto.getStock());
        return nuevoProducto;
    }
}
