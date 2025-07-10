package mx.com.santander.hexagonalmodularmaven.ventas.model.dto;
import java.time.LocalDateTime;
import java.util.List;
import mx.com.santander.hexagonalmodularmaven.ventas.model.dto.command.ProductoVentaCommand;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class VentaDTO {
    
    private Long idCliente;
    private List<ProductoVentaCommand> productosComprados;
    private int cantidadProductos;
    private int precioTotal;
    private LocalDateTime fechaCompra;
}
