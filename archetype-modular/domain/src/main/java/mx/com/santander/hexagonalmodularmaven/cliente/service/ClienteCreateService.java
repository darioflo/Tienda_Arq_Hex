package mx.com.santander.hexagonalmodularmaven.cliente.service;

import mx.com.santander.hexagonalmodularmaven.cliente.model.constant.ClienteConstant;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.command.ClienteCreateCommand;
import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;
import mx.com.santander.hexagonalmodularmaven.cliente.port.dao.ClienteDAO;
import mx.com.santander.hexagonalmodularmaven.cliente.port.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClienteCreateService {

    private final ClienteRepository clienteRepository;
    private final ClienteDAO clienteDao;
    
    public Cliente createClient(ClienteCreateCommand cliente){
        
    if (clienteDao.existEmail(cliente.getEmail())) {
            throw new IllegalArgumentException(ClienteConstant.EMAIL_ALREADY_EXIST);
        }

        Cliente nuevoCliente = new Cliente().requestToCreate(cliente);
        
        Cliente clienteGuardado = clienteRepository.createClient(nuevoCliente);

        return clienteGuardado;

    }
}
