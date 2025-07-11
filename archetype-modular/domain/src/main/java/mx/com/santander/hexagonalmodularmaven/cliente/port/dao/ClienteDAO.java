package mx.com.santander.hexagonalmodularmaven.cliente.port.dao;

import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;
import java.util.List;

public interface ClienteDAO {
    
    Cliente findById (Long id);
    List<Cliente> getAll();
    boolean existEmail(String email);
}
