package mx.com.santander.hexagonalmodularmaven.producto.adapter.jpa.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.adapter.jpa.ProductoSpringJpaAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.producto.adapter.mapper.ProductoEntityMapper;
import mx.com.santander.hexagonalmodularmaven.producto.model.constant.ProductoConstant;
import mx.com.santander.hexagonalmodularmaven.producto.model.entity.Producto;
import mx.com.santander.hexagonalmodularmaven.producto.port.dao.ProductoDAO;

@Repository
@AllArgsConstructor
public class ProductoDaoAdapter implements ProductoDAO{
    
    private ProductoSpringJpaAdapterRepository productoSpringJpa;
    private ProductoEntityMapper productoEntityMapper;

    @Override
    public Producto getProductById(Long id) {
        var producto = productoSpringJpa.findById(id);
            if (producto.isEmpty()) {
            throw new IllegalArgumentException(ProductoConstant.PRODUCT_NOT_FOUND);
        }
         return productoEntityMapper.toDomain(producto.get());
    }

    @Override
    public Producto getProductByName(String name) {
        var producto = productoSpringJpa.findProductByName(name);
        if (producto == null) {
            throw new IllegalArgumentException(ProductoConstant.PRODUCT_NOT_FOUND);
        }

        return productoEntityMapper.toDomain(producto);
    }

    @Override
    public List<Producto> getAll() {
        productoSpringJpa.findAll()
            .stream()
            .map(productoEntityMapper::toDomain)
            .collect(Collectors.toList());
        return null;
    }

}
