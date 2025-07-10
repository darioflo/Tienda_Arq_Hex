package mx.com.santander.hexagonalmodularmaven.producto.port.repository;
import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;


public interface ProductoRepository {
    Producto findProductById (Long id);
    
    Producto createProduct(Producto producto);
    
    void deleteProductById(Long id);
    
    Producto updateClient(Producto producto);
}
