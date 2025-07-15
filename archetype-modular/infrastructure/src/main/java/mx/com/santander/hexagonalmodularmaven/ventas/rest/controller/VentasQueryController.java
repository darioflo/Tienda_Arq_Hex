package mx.com.santander.hexagonalmodularmaven.ventas.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.VentaDTO;
import mx.com.santander.hexagonalmodularmaven.ventas.query.GetVentaByClienteIdHandler;
import mx.com.santander.hexagonalmodularmaven.ventas.query.VentaByIdHandler;
import mx.com.santander.hexagonalmodularmaven.ventas.query.VentasAllHandler;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/ventas")
@AllArgsConstructor
public class VentasQueryController {
    
    private final GetVentaByClienteIdHandler ventaByCliente;
    private final VentaByIdHandler  ventaByIdHandler;
    private final VentasAllHandler ventasAllHandler;
    


    @GetMapping("/cliente/{id}")
    public ResponseEntity<List<VentaDTO>> ventasDeCliente(Long id) {
        var ventasCliente = ventaByCliente.handler(id);
        return ResponseEntity.ok(ventasCliente);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VentaDTO> ventasPorId (Long id) {
         var ventasId = ventaByIdHandler.handler(id);
         return ResponseEntity.ok(ventasId);
    }
    
    @GetMapping()
    public ResponseEntity<List<VentaDTO>> obtenerVentas() {
        var ventas = ventasAllHandler.handler();
        return ResponseEntity.ok(ventas);
    }
    

}
