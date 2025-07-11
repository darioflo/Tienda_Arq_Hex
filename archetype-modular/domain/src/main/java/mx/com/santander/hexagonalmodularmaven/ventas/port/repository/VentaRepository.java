package mx.com.santander.hexagonalmodularmaven.ventas.port.repository;

import mx.com.santander.hexagonalmodularmaven.ventas.model.entity.Venta;

public interface VentaRepository {
    
    Venta createVenta(Venta venta);
}

