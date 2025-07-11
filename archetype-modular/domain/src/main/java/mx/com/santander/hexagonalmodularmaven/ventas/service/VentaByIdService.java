package mx.com.santander.hexagonalmodularmaven.ventas.service;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.ventas.model.constant.VentasConstant;
import mx.com.santander.hexagonalmodularmaven.ventas.model.entity.Venta;
import mx.com.santander.hexagonalmodularmaven.ventas.port.dao.VentaDAO;
@AllArgsConstructor
public class VentaByIdService {
    
    private final VentaDAO ventaDAO;

    public Venta findVentaId(Long id){
        
        Venta venta = ventaDAO.getById(id);
        if (venta == null) {
            throw new RuntimeException(String.format(VentasConstant.VENTA_NOT_FOUND, id));
        }
        return venta;
    }
}
