package mx.com.santander.hexagonalmodularmaven.producto.model.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class ProductoDTO {
    private Long id;
    private String nombre;
    private double precio;
    private int stock;
}
