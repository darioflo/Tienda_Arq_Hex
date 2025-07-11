package mx.com.santander.hexagonalmodularmaven.producto.model.exception;

import lombok.Getter;

@Getter
public class ProductoException extends RuntimeException {
    private final String errorMessage;

    public ProductoException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
}
