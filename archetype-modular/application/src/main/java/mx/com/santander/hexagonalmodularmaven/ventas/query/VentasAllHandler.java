package mx.com.santander.hexagonalmodularmaven.ventas.query;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.ventas.mapper.VentaDtoMapper;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.VentaDTO;
import mx.com.santander.hexagonalmodularmaven.ventas.service.VentasAll;

@Service
@AllArgsConstructor
public class VentasAllHandler {

    private VentasAll ventasAll;
    private VentaDtoMapper ventaDtoMapper;

    public List<VentaDTO> handler(){
        var ventas = ventasAll.findAllVentas();
        
        return ventas.stream().map(ventaDtoMapper::toDto).collect(Collectors.toList());
    }
}
