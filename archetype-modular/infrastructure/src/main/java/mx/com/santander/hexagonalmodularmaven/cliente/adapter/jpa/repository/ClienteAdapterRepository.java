package mx.com.santander.hexagonalmodularmaven.cliente.adapter.jpa.repository;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.adapter.entity.ClienteEntity;
import mx.com.santander.hexagonalmodularmaven.cliente.adapter.jpa.ClienteSpringJpaAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.cliente.adapter.mapper.ClienteEntityMapper;
import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;
import mx.com.santander.hexagonalmodularmaven.cliente.port.repository.ClienteRepository;

@Repository
@RequiredArgsConstructor
public class ClienteAdapterRepository implements ClienteRepository{
    
    private ClienteEntityMapper clienteEntityMapper;
    private ClienteSpringJpaAdapterRepository clienteSpringJpa;

    @Override
    public Cliente createClient(Cliente cliente){
        ClienteEntity entidad = clienteEntityMapper.toEntity(cliente);
        ClienteEntity guardado = clienteSpringJpa.save(entidad);
        return clienteEntityMapper.toDomain(guardado);
    }

    @Override
    public void deleteClientById(Long id) {
        clienteSpringJpa.deleteById(id);
    }

    @Override
    public Cliente updateClient(Cliente cliente) {
         ClienteEntity entidad = clienteEntityMapper.toEntity(cliente);
        ClienteEntity editado = clienteSpringJpa.save(entidad);
        return clienteEntityMapper.toDomain(editado);
        
    }
    
}
