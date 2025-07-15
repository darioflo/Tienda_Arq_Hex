package mx.com.santander.hexagonalmodularmaven.producto.model.dto.command;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductoCreateCommand {
    private String nombre;
    private Double precio;
    private Integer stock;
}
