package mx.com.santander.hexagonalmodularmaven.cliente.port.repository;
import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;


public interface ClienteRepository {
    
    Cliente findClientById (Long id);
    Cliente createClient(Cliente cliente);
    void deleteClientById(Long id);
    Cliente updateClient(Cliente cliente);

}
