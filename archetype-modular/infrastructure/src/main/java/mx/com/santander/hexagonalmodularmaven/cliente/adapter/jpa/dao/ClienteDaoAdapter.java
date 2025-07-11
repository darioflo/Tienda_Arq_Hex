package mx.com.santander.hexagonalmodularmaven.cliente.adapter.jpa.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import mx.com.santander.hexagonalmodularmaven.cliente.adapter.jpa.ClienteSpringJpaAdapterRepository;
import mx.com.santander.hexagonalmodularmaven.cliente.adapter.mapper.ClienteEntityMapper;
import mx.com.santander.hexagonalmodularmaven.cliente.model.constant.ClienteConstant;
import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;
import mx.com.santander.hexagonalmodularmaven.cliente.port.dao.ClienteDAO;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class ClienteDaoAdapter implements ClienteDAO {

    private final ClienteSpringJpaAdapterRepository clienteSpringJpa;
    private final ClienteEntityMapper clienteEntityMapper;

    @Override
    public Cliente findById(Long id) {
        var cliente = clienteSpringJpa.findById(id);

        if (cliente.isEmpty()) {
            throw new IllegalArgumentException(ClienteConstant.CLIENT_NOT_FOUND);
        }

        return clienteEntityMapper.toDomain(cliente.get());
    }

    @Override
    public List<Cliente> getAll() {
        return clienteSpringJpa.findAll()
            .stream()
            .map(clienteEntityMapper::toDomain)
            .collect(Collectors.toList());
    }

    @Override
    public boolean existEmail(String email) {
        return clienteSpringJpa.existsByEmail(email);
    }
}
