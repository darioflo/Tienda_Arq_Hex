package mx.com.santander.hexagonalmodularmaven.producto.port.dao;

import java.util.List;

import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;

public interface ProductoDAO {
    
    Producto getProductById(Long id);
    Producto getProductByName(String name);
    List<Producto> getAll();
    
}
