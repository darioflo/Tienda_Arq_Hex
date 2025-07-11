package mx.com.santander.hexagonalmodularmaven.ventas.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.santander.hexagonalmodularmaven.ventas.command.CreateVentaHandler;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.VentaDTO;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.command.VentaCreateCommand;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/ventas")
public class VentasCommandController {
    
        private CreateVentaHandler createVentaHandler;

        @PostMapping("")
        public ResponseEntity<VentaDTO> crearVenta(@RequestBody VentaCreateCommand venta) {
            var ventaNueva = createVentaHandler.handler(venta);
            return ResponseEntity.ok(ventaNueva);
        }
        
}
