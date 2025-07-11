package mx.com.santander.hexagonalmodularmaven.beanconfiguration;

import mx.com.santander.hexagonalmodularmaven.cliente.port.dao.ClienteDAO;
import mx.com.santander.hexagonalmodularmaven.cliente.port.repository.ClienteRepository;
import mx.com.santander.hexagonalmodularmaven.cliente.service.ClienteCreateService;
import mx.com.santander.hexagonalmodularmaven.cliente.service.ClienteDeleteService;
import mx.com.santander.hexagonalmodularmaven.cliente.service.ClienteEditService;
import mx.com.santander.hexagonalmodularmaven.cliente.service.ClienteFindService;
import mx.com.santander.hexagonalmodularmaven.cliente.service.ClienteFindAllService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClienteBean {

    @Bean
    public ClienteCreateService clienteCreateService(ClienteRepository clienteRepository,
                                                      ClienteDAO clienteDAO) {
        return new ClienteCreateService(clienteRepository, clienteDAO);
    }

    @Bean
    public ClienteDeleteService clienteDeleteService(ClienteDAO clienteDAO,
                                                     ClienteRepository clienteRepository) {
        return new ClienteDeleteService(clienteDAO, clienteRepository);
    }

    @Bean
    public ClienteEditService clienteEditService(ClienteDAO clienteDAO,
                                                 ClienteRepository clienteRepository) {
        return new ClienteEditService(clienteDAO, clienteRepository);
    }

    @Bean
    public ClienteFindService clienteFindService(ClienteDAO clienteDAO) {
        return new ClienteFindService(clienteDAO);
    }

    @Bean
    public ClienteFindAllService clienteFindAllService(ClienteDAO clienteDAO) {
        return new ClienteFindAllService(clienteDAO);
    }

}
