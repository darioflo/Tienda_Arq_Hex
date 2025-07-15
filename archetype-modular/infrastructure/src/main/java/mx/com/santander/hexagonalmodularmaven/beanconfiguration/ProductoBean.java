package mx.com.santander.hexagonalmodularmaven.beanconfiguration;
import mx.com.santander.hexagonalmodularmaven.producto.port.dao.ProductoDAO;
import mx.com.santander.hexagonalmodularmaven.producto.port.repository.ProductoRepository;
import mx.com.santander.hexagonalmodularmaven.producto.service.ProductoCreateService;
import mx.com.santander.hexagonalmodularmaven.producto.service.ProductoDeleteService;
import mx.com.santander.hexagonalmodularmaven.producto.service.ProductoEditService;
import mx.com.santander.hexagonalmodularmaven.producto.service.ProductoFindAllService;
import mx.com.santander.hexagonalmodularmaven.producto.service.ProductoFindService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ProductoBean {

    @Bean
    public ProductoCreateService productoCreateService(ProductoRepository productoRepository) {
        return new ProductoCreateService(productoRepository);
    }

    @Bean
    public ProductoDeleteService productoDeleteService(ProductoDAO productoDAO,
                                                       ProductoRepository productoRepository) {
        return new ProductoDeleteService(productoDAO, productoRepository);
    }

    @Bean
    public ProductoEditService productoEditService(ProductoRepository productoRepository,ProductoDAO productoDAO) {
        return new ProductoEditService(productoRepository, productoDAO);
    }

    @Bean
    public ProductoFindService productoFindService(ProductoDAO productoDAO) {
        return new ProductoFindService(productoDAO);
    }

    @Bean
    public ProductoFindAllService productoFindAllService(ProductoDAO productoDAO) {
        return new ProductoFindAllService(productoDAO);
    }
}