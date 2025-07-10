package mx.com.santander.hexagonalmodularmaven.producto.model.dto.command;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ProductoCreateCommand {
    private String nombre;
    private double precio;
    private int stock;
}
