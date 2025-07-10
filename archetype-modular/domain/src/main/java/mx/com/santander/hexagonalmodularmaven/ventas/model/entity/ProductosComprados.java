package mx.com.santander.hexagonalmodularmaven.ventas.model.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.command.ProductoVentaCommand;

@AllArgsConstructor
@Getter

public class ProductosComprados {
    private List<ProductoVentaCommand> productosComprados;
}
