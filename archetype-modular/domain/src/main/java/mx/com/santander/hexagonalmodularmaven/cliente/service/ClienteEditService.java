package mx.com.santander.hexagonalmodularmaven.cliente.service;
import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.model.constant.ClienteConstant;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.command.ClienteEditCommand;
import mx.com.santander.hexagonalmodularmaven.cliente.model.entity.Cliente;
import mx.com.santander.hexagonalmodularmaven.cliente.port.dao.ClienteDAO;
import mx.com.santander.hexagonalmodularmaven.cliente.port.repository.ClienteRepository;

@RequiredArgsConstructor
public class ClienteEditService {

    private final ClienteDAO clienteDAO;
    private final ClienteRepository clienteRepository;


    public Cliente editCLient(ClienteEditCommand cliente){

        Cliente existente = clienteDAO.getById(cliente.getId());

        if (existente == null) {
            throw new IllegalArgumentException(ClienteConstant.CLIENT_NOT_FOUND);
        }

        Cliente actualizado = new Cliente(
            existente.getId(),
            existente.getNombre(),
            existente.getApellido(),
            existente.getEmail(),
            existente.getDireccion(),
            existente.getTelefono()
        );

        clienteRepository.updateClient(actualizado);

        return actualizado;
    }
}
