package mx.com.santander.hexagonalmodularmaven.producto.service;
import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.model.constant.ProductoConstant;
import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;
import mx.com.santander.hexagonalmodularmaven.producto.port.dao.ProductoDAO;

@RequiredArgsConstructor
public class ProductoFindService {
    
    private final ProductoDAO productoDAO;

    public Producto findProducto(Long id){
        
        Producto producto = productoDAO.getProductById(id);

           if (producto == null) {
            throw new IllegalArgumentException(ProductoConstant.PRODUCT_NOT_FOUND);
        }

        return producto;
    }
}
