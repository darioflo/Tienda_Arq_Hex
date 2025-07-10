package mx.com.santander.hexagonalmodularmaven.ventas.model.dto.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class VentaCreateCommand {
    
    private Long idCliente;
    private List<ProductoVentaCommand> productosComprados;
    private int cantidadProductos;
    private int precioTotal;
    private LocalDateTime fechaCompra;



}
