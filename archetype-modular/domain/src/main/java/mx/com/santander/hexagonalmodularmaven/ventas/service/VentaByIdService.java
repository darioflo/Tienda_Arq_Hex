package mx.com.santander.hexagonalmodularmaven.ventas.service;

import mx.com.santander.hexagonalmodularmaven.ventas.model.constant.VentasConstant;
import mx.com.santander.hexagonalmodularmaven.ventas.model.entity.Venta;
import mx.com.santander.hexagonalmodularmaven.ventas.port.dao.VentaDAO;

public class VentaByIdService {
    
    private VentaDAO ventaDAO;

    public Venta findVentaId(Long id){
        
        Venta venta = ventaDAO.getById(id);
        if (venta == null) {
            throw new RuntimeException(String.format(VentasConstant.VENTA_NOT_FOUND, id));
        }
        return venta;
    }
}
