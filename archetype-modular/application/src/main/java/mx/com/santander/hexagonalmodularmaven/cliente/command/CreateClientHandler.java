package mx.com.santander.hexagonalmodularmaven.cliente.command;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.mapper.ClienteDtoMapper;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.ClienteDTO;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.command.ClienteCreateCommand;
import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;
import mx.com.santander.hexagonalmodularmaven.cliente.service.ClienteCreateService;

@Service
@AllArgsConstructor
public class CreateClientHandler {
    
    private final ClienteCreateService clienteCreateService;
    private final ClienteDtoMapper clienteDtoMapper;

    public ClienteDTO handler(ClienteCreateCommand cliente){
        Cliente clienteCreado = clienteCreateService.createClient(cliente);
        return clienteDtoMapper.toDto(clienteCreado);
    }
}
