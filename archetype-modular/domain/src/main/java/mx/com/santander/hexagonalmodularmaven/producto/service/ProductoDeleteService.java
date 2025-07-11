package mx.com.santander.hexagonalmodularmaven.producto.service;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.model.constant.ClienteConstant;
import mx.com.santander.hexagonalmodularmaven.producto.port.dao.ProductoDAO;
import mx.com.santander.hexagonalmodularmaven.producto.port.repository.ProductoRepository;

@RequiredArgsConstructor
public class ProductoDeleteService {
    
    private final ProductoDAO productoDAO;
    private final ProductoRepository productoRepository;


    public void deleteProduct(Long id){
        if (productoDAO.getProductById(id) == null) {
            throw new IllegalArgumentException(ClienteConstant.CLIENT_NOT_FOUND);
        }

        productoRepository.deleteProductById(id);
    }
}
