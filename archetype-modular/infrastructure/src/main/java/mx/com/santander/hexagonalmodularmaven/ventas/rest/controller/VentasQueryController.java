package mx.com.santander.hexagonalmodularmaven.ventas.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.VentaDTO;
import mx.com.santander.hexagonalmodularmaven.ventas.query.GetVentaByClienteIdHandler;
import mx.com.santander.hexagonalmodularmaven.ventas.query.VentaByIdHandler;
import mx.com.santander.hexagonalmodularmaven.ventas.query.VentasAllHandler;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/ventas")
public class VentasQueryController {
    
    private GetVentaByClienteIdHandler ventaByCliente;
    private VentaByIdHandler  ventaByIdHandler;
    private VentasAllHandler ventasAllHandler;


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
    
    

}
