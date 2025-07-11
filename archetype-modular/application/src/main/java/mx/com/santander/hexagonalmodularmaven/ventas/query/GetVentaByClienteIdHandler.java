package mx.com.santander.hexagonalmodularmaven.ventas.query;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.ventas.mapper.VentaDtoMapper;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.VentaDTO;
import mx.com.santander.hexagonalmodularmaven.ventas.service.VentaByIdClienteService;

@Service
@RequiredArgsConstructor
public class GetVentaByClienteIdHandler {

    private final VentaByIdClienteService ventaByIdClienteService;
    private final VentaDtoMapper ventaDtoMapper;

    public List<VentaDTO> handler(Long idCliente) {
        var ventas = ventaByIdClienteService.findVentaByClient(idCliente);
        return ventas.stream()
                     .map(ventaDtoMapper::toDto)
                     .collect(Collectors.toList());
    }
}