package mx.com.santander.hexagonalmodularmaven.ventas.model.dto.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductoVentaCommand {
    private Long productoId;
    private String nombre;
    private int precio;
    private int cantidad;
    private int stock;
}
