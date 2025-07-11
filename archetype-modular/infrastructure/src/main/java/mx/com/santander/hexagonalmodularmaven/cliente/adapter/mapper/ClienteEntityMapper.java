package mx.com.santander.hexagonalmodularmaven.cliente.adapter.mapper;

import org.springframework.stereotype.Component;

import mx.com.santander.hexagonalmodularmaven.cliente.adapter.entity.ClienteEntity;
import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;

@Component
public class ClienteEntityMapper {
    
    public Cliente toDomain(ClienteEntity cliente){
        return new Cliente(
            cliente.getId(),
            cliente.getNombre(),
            cliente.getApellido(),
            cliente.getEmail(),
            cliente.getDireccion(),
            cliente.getTelefono()
        );
    }

    public ClienteEntity toEntity(Cliente cliente){
        ClienteEntity entidad = new ClienteEntity();
        entidad.setId(cliente.getId());
        entidad.setNombre(cliente.getNombre());
        entidad.setApellido(cliente.getApellido());
        entidad.setEmail(cliente.getEmail());
        entidad.setDireccion(cliente.getDireccion());
        entidad.setTelefono(cliente.getTelefono());

        return entidad;
    }
}
