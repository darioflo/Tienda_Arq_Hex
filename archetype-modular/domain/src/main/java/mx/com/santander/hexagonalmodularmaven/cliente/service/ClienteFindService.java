package mx.com.santander.hexagonalmodularmaven.cliente.service;
import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.model.constant.ClienteConstant;
import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;
import mx.com.santander.hexagonalmodularmaven.cliente.port.dao.ClienteDAO;

@RequiredArgsConstructor
public class ClienteFindService {
    
    private final ClienteDAO clienteDao;

    public Cliente findClient(Long id){

        Cliente cliente = clienteDao.findById(id);

        if (cliente == null) {
            throw new IllegalArgumentException(ClienteConstant.CLIENT_NOT_FOUND);
        }

        return cliente;
    }
}
