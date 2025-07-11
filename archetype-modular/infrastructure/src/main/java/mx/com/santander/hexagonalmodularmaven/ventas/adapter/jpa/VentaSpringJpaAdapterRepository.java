package mx.com.santander.hexagonalmodularmaven.ventas.adapter.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.santander.hexagonalmodularmaven.ventas.adapter.entity.VentaEntity;

public interface VentaSpringJpaAdapterRepository extends JpaRepository<VentaEntity, Long> {
     List<VentaEntity> findByIdCliente(Long clienteId); 
}
