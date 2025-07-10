package mx.com.santander.hexagonalmodularmaven.ventas.command;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.VentaDTO;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.command.VentaCreateCommand;
import mx.com.santander.hexagonalmodularmaven.ventas.service.VentasCreateService;
import mx.com.santander.hexagonalmodularmaven.ventas.mapper.VentaDtoMapper;

@Service
@RequiredArgsConstructor
public class CreateVentaHandler {

    private final VentasCreateService ventasCreateService;
    private final VentaDtoMapper ventaDtoMapper;

    public VentaDTO handler(VentaCreateCommand venta) {
        var ventaCreada = ventasCreateService.createVenta(venta);
        return ventaDtoMapper.toDto(ventaCreada);
    }
}
