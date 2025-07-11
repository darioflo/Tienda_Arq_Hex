package mx.com.santander.hexagonalmodularmaven.producto.query;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.producto.mapper.ProductoDtoMapper;
import mx.com.santander.hexagonalmodularmaven.producto.model.dto.ProductoDTO;
import mx.com.santander.hexagonalmodularmaven.producto.service.ProductoFindAllService;

@Service
@AllArgsConstructor
public class ProductAllHandler {

    private final ProductoFindAllService productoFindAllService;
    private final ProductoDtoMapper productoDtoMapper;

    public List<ProductoDTO> handler() {
        return productoFindAllService.findAllProducts()
                .stream()
                .map(productoDtoMapper::toDto)
                .collect(Collectors.toList());
    }
}
