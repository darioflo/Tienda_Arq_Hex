package mx.com.santander.hexagonalmodularmaven.ventas.adapter.jpa.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.ventas.adapter.jpa.VentaSpringJpaAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.ventas.adapter.mapper.VentaEntityMapper;
import mx.com.santander.hexagonalmodularmaven.ventas.model.constant.VentasConstant;
import mx.com.santander.hexagonalmodularmaven.ventas.model.entity.Venta;
import mx.com.santander.hexagonalmodularmaven.ventas.port.dao.VentaDAO;

@Service
@AllArgsConstructor
public class VentaDaoAdapter implements VentaDAO{
    
    private VentaSpringJpaAdapterRepository ventaSpringJpa;
    private VentaEntityMapper ventaEntityMapper;
    
        @Override
        public List<Venta> getAll() {
            return ventaSpringJpa.findAll().stream()
                .map(ventaEntityMapper::toModel)
                .collect(Collectors.toList());
        }

        @Override
        public Venta getById(Long id) {            
            var venta = ventaSpringJpa.findById(id);
            if (venta.isEmpty()) {
            throw new IllegalArgumentException(VentasConstant.VENTA_NOT_FOUND);
        }
         return ventaEntityMapper.toModel(venta.get());
        }

        @Override
        public List<Venta> getByClienteId(Long clienteId) {
            return ventaSpringJpa.findByIdCliente(clienteId).stream()
            .map(ventaEntityMapper::toModel)
            .collect(Collectors.toList());
        }
}
