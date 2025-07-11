package mx.com.santander.hexagonalmodularmaven.ventas.adapter.jpa.repository;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.ventas.adapter.entity.VentaEntity;
import mx.com.santander.hexagonalmodularmaven.ventas.adapter.jpa.VentaSpringJpaAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.ventas.adapter.mapper.VentaEntityMapper;
import mx.com.santander.hexagonalmodularmaven.ventas.model.entity.Venta;
import mx.com.santander.hexagonalmodularmaven.ventas.port.repository.VentaRepository;

@Service
@AllArgsConstructor
public class VentaAdapterRepository implements VentaRepository{
    
    private VentaSpringJpaAdapterRepository ventaSpringJpa;
    private VentaEntityMapper ventaEntityMapper;

    @Override
    public Venta createVenta(Venta venta) {
        VentaEntity ventaCreada = ventaEntityMapper.toEntity(venta);
        VentaEntity ventaGuardada = ventaSpringJpa.save(ventaCreada);
        
        return ventaEntityMapper.toModel(ventaGuardada);
    }

}
