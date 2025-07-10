package mx.com.santander.hexagonalmodularmaven.cliente.command;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.cliente.service.ClienteDeleteService;

@Service
@AllArgsConstructor

public class DeleteClientHandler {
    
    private ClienteDeleteService clienteDeleteService;

    public void handler(Long id){
        clienteDeleteService.deleteClient(id);
    }
}
