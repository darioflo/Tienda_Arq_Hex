package mx.com.santander.hexagonalmodularmaven.producto.service;

import mx.com.santander.hexagonalmodularmaven.producto.model.constant.ProductoConstant;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.command.ProductoEditCommand;
import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;
import mx.com.santander.hexagonalmodularmaven.producto.port.dao.ProductoDAO;
import mx.com.santander.hexagonalmodularmaven.producto.port.repository.ProductoRepository;

public class ProductoEditService {
    
    private ProductoRepository productoRepository;
    private ProductoDAO productoDAO;

    public Producto editProduct(ProductoEditCommand producto){

        Producto existente = productoDAO.getProductById(producto.getId());

        if (existente == null) {
            throw new IllegalArgumentException(ProductoConstant.PRODUCT_NOT_FOUND);
        }

        Producto editado = new Producto(
            existente.getId(),
            existente.getNombre(),
            existente.getPrecio(),
            existente.getStock()
        );

        productoRepository.updateClient(editado);
        return editado;
    }
}
