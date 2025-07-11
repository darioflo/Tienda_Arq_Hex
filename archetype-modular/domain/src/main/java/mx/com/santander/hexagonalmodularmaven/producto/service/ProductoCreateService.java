package mx.com.santander.hexagonalmodularmaven.producto.service;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.model.constant.ProductoConstant;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.command.ProductoCreateCommand;
import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;
import mx.com.santander.hexagonalmodularmaven.producto.port.dao.ProductoDAO;
import mx.com.santander.hexagonalmodularmaven.producto.port.repository.ProductoRepository;

@RequiredArgsConstructor
public class ProductoCreateService {
    private final ProductoRepository productoRepository;
    private final ProductoDAO productoDAO;

    public Producto createProduct(ProductoCreateCommand producto) {
        if (productoDAO.getProductByName(producto.getNombre()) != null) {
            throw new IllegalArgumentException(ProductoConstant.PRODUCT_NAME_ALREADY_EXISTS);
        }

        Producto nuevo = new Producto().createProducto(producto);
        Producto guardado = productoRepository.createProduct(nuevo);

        return guardado;
    }
}
