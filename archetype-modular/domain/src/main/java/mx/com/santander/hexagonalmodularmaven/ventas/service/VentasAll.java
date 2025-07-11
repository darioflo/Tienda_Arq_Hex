package mx.com.santander.hexagonalmodularmaven.ventas.service;

import java.util.List;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.ventas.model.entity.Venta;
import mx.com.santander.hexagonalmodularmaven.ventas.port.dao.VentaDAO;
@AllArgsConstructor
public class VentasAll {
    
    private final VentaDAO ventaDAO;

    public List<Venta> findAllVentas(){
        return ventaDAO.getAll();
    }
}
