package mx.com.santander.hexagonalmodularmaven.ventas.port.repository;

import mx.com.santander.hexagonalmodularmaven.ventas.model.entity.Venta;

public interface VentaRepository {
    
    Venta createVenta(Venta venta);
    void deleteVenta(Long id);
    Venta updateVenta(Venta venta);
    Venta findVenta(Long id);
    Venta findVentaByIdCliente(Long idCLiente);
}

