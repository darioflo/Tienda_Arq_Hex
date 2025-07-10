package mx.com.santander.hexagonalmodularmaven.producto.model.exception;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ProductoException {
    private String errorMessage;
}
