package mx.com.santander.hexagonalmodularmaven.producto.adapter.jpa;
import org.springframework.stereotype.Repository;
import mx.com.santander.hexagonalmodularmaven.producto.adapter.entity.ProductoEntity;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductoSpringJpaAdapterRepository extends JpaRepository<ProductoEntity,Long> {
    
    ProductoEntity findProductByName(String name);
}
