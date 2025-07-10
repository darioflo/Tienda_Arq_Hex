package mx.com.santander.hexagonalmodularmaven.producto.model.dto.command;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ProductoEditCommand {
      private Long id;
    private String nombre;
    private double precio;
    private int stock;
}
