package mx.com.santander.hexagonalmodularmaven.ventas.port.dao;

import java.util.List;

import mx.com.santander.hexagonalmodularmaven.ventas.model.entity.Venta;

public interface VentaDAO {
    
    Venta getById(Long id);
    List<Venta> getAll();
    List<Venta> getByClienteId(Long clienteId);
}
