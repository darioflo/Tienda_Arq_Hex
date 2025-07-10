package mx.com.santander.hexagonalmodularmaven.cliente.query;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.mapper.ClienteDtoMapper;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.ClienteDTO;
import mx.com.santander.hexagonalmodularmaven.cliente.service.ClienteFindAllService;


@Service
@AllArgsConstructor
public class ClientAllHandler {
    
    private ClienteFindAllService clienteService;
    private ClienteDtoMapper clienteDtoMapper;

    public List<ClienteDTO> handler(){
        return clienteService.findAllClients()
            .stream()
            .map(clienteDtoMapper::toDto) 
            .collect(Collectors.toList()); 
    }
    }
    

