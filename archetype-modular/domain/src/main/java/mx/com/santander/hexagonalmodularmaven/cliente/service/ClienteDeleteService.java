package mx.com.santander.hexagonalmodularmaven.cliente.service;
import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.model.constant.ClienteConstant;
import mx.com.santander.hexagonalmodularmaven.cliente.port.dao.ClienteDAO;
import mx.com.santander.hexagonalmodularmaven.cliente.port.repository.ClienteRepository;

@RequiredArgsConstructor
public class ClienteDeleteService {
    
    private final ClienteDAO clienteDAO;
    private final ClienteRepository clienteRepository;


    public void deleteClient(Long id){
        if (clienteDAO.findById(id) == null) {
            throw new IllegalArgumentException(ClienteConstant.CLIENT_NOT_FOUND);
        }

        clienteRepository.deleteClientById(id);
    }
}
