package mx.com.santander.hexagonalmodularmaven.ventas.service;

import java.util.List;

import mx.com.santander.hexagonalmodularmaven.ventas.model.entity.Venta;
import mx.com.santander.hexagonalmodularmaven.ventas.port.dao.VentaDAO;

public class VentaByIdClienteService {
    
    private VentaDAO ventaDAO;

    public List<Venta> findVentaByClient(Long id){
        return ventaDAO.getByClienteId(id);
        
    }
}
