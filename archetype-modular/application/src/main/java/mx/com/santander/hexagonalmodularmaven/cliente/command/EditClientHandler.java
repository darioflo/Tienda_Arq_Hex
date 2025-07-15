package mx.com.santander.hexagonalmodularmaven.cliente.command;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.mapper.ClienteDtoMapper;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.ClienteDTO;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.command.ClienteEditCommand;
import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;
import mx.com.santander.hexagonalmodularmaven.cliente.service.ClienteEditService;

@Service
@AllArgsConstructor
public class EditClientHandler {
    
    private final ClienteEditService clienteEditService;
    private final ClienteDtoMapper clienteDtoMapper;


    public ClienteDTO handler(ClienteEditCommand cliente){

        Cliente clienteActualizado = clienteEditService.editCLient(cliente);
        return clienteDtoMapper.toDto(clienteActualizado);
    }
}
