package mx.com.santander.hexagonalmodularmaven.beanconfiguration;
import mx.com.santander.hexagonalmodularmaven.cliente.port.dao.ClienteDAO;
import mx.com.santander.hexagonalmodularmaven.producto.port.dao.ProductoDAO;
import mx.com.santander.hexagonalmodularmaven.ventas.port.dao.VentaDAO;
import mx.com.santander.hexagonalmodularmaven.ventas.port.repository.VentaRepository;
import mx.com.santander.hexagonalmodularmaven.ventas.service.VentasCreateService;
import mx.com.santander.hexagonalmodularmaven.ventas.service.VentaByIdClienteService;
import mx.com.santander.hexagonalmodularmaven.ventas.service.VentaByIdService;
import mx.com.santander.hexagonalmodularmaven.ventas.service.VentasAll;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VentasBean {

    @Bean
    public VentasCreateService ventasCreateService(ClienteDAO clienteDAO,
                                                   ProductoDAO productoDAO,
                                                   VentaRepository ventaRepository) {
        return new VentasCreateService(clienteDAO, productoDAO, ventaRepository);
    }

    @Bean
    public VentaByIdClienteService ventaByIdClienteService(VentaDAO ventaDAO) {
        return new VentaByIdClienteService(ventaDAO);
    }

    @Bean
    public VentaByIdService ventaByIdService(VentaDAO ventaDAO) {
        return new VentaByIdService(ventaDAO);
    }

    @Bean
    public VentasAll ventasAll(VentaDAO ventaDAO) {
        return new VentasAll(ventaDAO);
    }
}