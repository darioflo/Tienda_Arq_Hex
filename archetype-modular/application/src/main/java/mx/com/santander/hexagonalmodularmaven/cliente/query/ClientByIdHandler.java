package mx.com.santander.hexagonalmodularmaven.cliente.query;

import mx.com.santander.hexagonalmodularmaven.cliente.mapper.ClienteDtoMapper;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.ClienteDTO;
import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;
import mx.com.santander.hexagonalmodularmaven.cliente.service.ClienteFindService;

public class ClientByIdHandler {
    
    private ClienteFindService clienteFindService;
    private ClienteDtoMapper clienteDtoMapper;

    public ClienteDTO handler(Long id){
       Cliente cliente = clienteFindService.findClient(id);
       return clienteDtoMapper.toDto(cliente);
    }









    
}
