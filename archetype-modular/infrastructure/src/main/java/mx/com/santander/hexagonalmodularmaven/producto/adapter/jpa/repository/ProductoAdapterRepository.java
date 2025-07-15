package mx.com.santander.hexagonalmodularmaven.producto.adapter.jpa.repository;
import org.springframework.stereotype.Repository;
import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.adapter.entity.ProductoEntity;
import mx.com.santander.hexagonalmodularmaven.producto.adapter.jpa.ProductoSpringJpaAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.producto.adapter.mapper.ProductoEntityMapper;
import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;
import mx.com.santander.hexagonalmodularmaven.producto.port.repository.ProductoRepository;

@Repository
@RequiredArgsConstructor
public class ProductoAdapterRepository implements ProductoRepository {
    
    private final ProductoSpringJpaAdapterRepository productoSpringJpa;
    private final ProductoEntityMapper productoEntityMapper;

    @Override
    public Producto createProduct(Producto producto) {
        ProductoEntity entidad = productoEntityMapper.toEntity(producto);
        ProductoEntity guardado = productoSpringJpa.save(entidad);

        return productoEntityMapper.toDomain(guardado);
    }

    @Override
    public Producto updateProduct(Producto producto) {
        ProductoEntity entidad = productoEntityMapper.toEntity(producto);
        ProductoEntity editado = productoSpringJpa.save(entidad);

        return productoEntityMapper.toDomain(editado);
    }

    @Override
    public void deleteProductById(Long id) {
        productoSpringJpa.deleteById(id);
    }

}
