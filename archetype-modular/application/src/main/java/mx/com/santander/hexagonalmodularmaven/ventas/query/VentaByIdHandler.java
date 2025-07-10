package mx.com.santander.hexagonalmodularmaven.ventas.query;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.ventas.mapper.VentaDtoMapper;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.VentaDTO;
import mx.com.santander.hexagonalmodularmaven.ventas.service.VentaByIdService;

@Service
@AllArgsConstructor
public class VentaByIdHandler {
    
    private VentaByIdService ventaByIdService;
    private VentaDtoMapper ventaDtoMapper;

    public VentaDTO handler(Long id){
        
        var venta = ventaByIdService.findVentaId(id);
        return ventaDtoMapper.toDto(venta);
    }
}
