package mx.com.santander.hexagonalmodularmaven.cliente.query;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.mapper.ClienteDtoMapper;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.ClienteDTO;
import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;
import mx.com.santander.hexagonalmodularmaven.cliente.service.ClienteFindService;

@Service
@AllArgsConstructor
public class ClientByIdHandler {
    
    private final ClienteFindService clienteFindService;
    private final ClienteDtoMapper clienteDtoMapper;

    public ClienteDTO handler(Long id){
       Cliente cliente = clienteFindService.findClient(id);
       return clienteDtoMapper.toDto(cliente);
    }









    
}
