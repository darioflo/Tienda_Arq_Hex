package mx.com.santander.hexagonalmodularmaven.ventas.model.exception;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class VentaException {
    
    private String errorMessage;

}
