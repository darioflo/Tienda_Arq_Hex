package mx.com.santander.hexagonalmodularmaven.ventas.service;

import java.util.List;

import mx.com.santander.hexagonalmodularmaven.ventas.model.entity.Venta;
import mx.com.santander.hexagonalmodularmaven.ventas.port.dao.VentaDAO;

public class VentasAll {
    
    private VentaDAO ventaDAO;

    public List<Venta> findAllVentas(){
        return ventaDAO.getAll();
    }
}
