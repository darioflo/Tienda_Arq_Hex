package mx.com.santander.hexagonalmodularmaven.cliente.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.command.CreateClientHandler;
import mx.com.santander.hexagonalmodularmaven.cliente.command.DeleteClientHandler;
import mx.com.santander.hexagonalmodularmaven.cliente.command.EditClientHandler;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.ClienteDTO;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.command.ClienteCreateCommand;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.command.ClienteEditCommand;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor

public class ClienteCommandController {
    
    private final CreateClientHandler createClientHandler;
    private final EditClientHandler editClientHandler;
    private final DeleteClientHandler deleteClientHandler;

    @PostMapping
    public ResponseEntity<ClienteDTO> crearCliente(@RequestBody ClienteCreateCommand clienteCommand) {
        var clienteCreado = createClientHandler.handler(clienteCommand);
        return ResponseEntity.ok(clienteCreado);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<ClienteDTO> editarCliente(@PathVariable Long id, @RequestBody ClienteEditCommand clienteCommand) {
        clienteCommand.setId(id);
        var clienteEditado = editClientHandler.handler(clienteCommand);
        return ResponseEntity.ok(clienteEditado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCliente(@PathVariable Long id) {
        deleteClientHandler.handler(id);
        return ResponseEntity.noContent().build();
    }
}
