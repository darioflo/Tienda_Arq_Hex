package mx.com.santander.hexagonalmodularmaven.cliente.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.ClienteDTO;
import mx.com.santander.hexagonalmodularmaven.cliente.query.ClientAllHandler;
import mx.com.santander.hexagonalmodularmaven.cliente.query.ClientByIdHandler;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteQueryController {

    private ClientAllHandler clientAllHandler;
    private ClientByIdHandler clientByIdHandler;

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> obtenerPorId(@PathVariable Long id) {
        var cliente = clientByIdHandler.handler(id);
        return ResponseEntity.ok(cliente);
    }
    
    @GetMapping
    public ResponseEntity<List<ClienteDTO>> obtenerTodos() {
        var clientes = clientAllHandler.handler();
        return ResponseEntity.ok(clientes);
    }


}
