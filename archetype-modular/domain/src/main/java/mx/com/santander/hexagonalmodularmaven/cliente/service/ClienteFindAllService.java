package mx.com.santander.hexagonalmodularmaven.cliente.service;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;
import mx.com.santander.hexagonalmodularmaven.cliente.port.dao.ClienteDAO;

import java.util.List;

@RequiredArgsConstructor
public class ClienteFindAllService {

    private final ClienteDAO clienteDao;

    public List<Cliente> findAllClients() {
        return clienteDao.getAll();
    }
}