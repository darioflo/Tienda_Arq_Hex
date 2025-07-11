package mx.com.santander.hexagonalmodularmaven.producto.service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;
import mx.com.santander.hexagonalmodularmaven.producto.port.dao.ProductoDAO;

@RequiredArgsConstructor
public class ProductoFindAllService {

    private final ProductoDAO productoDAO;

    public List<Producto> findAllProducts() {
        return productoDAO.getAll();
    }
}
