package mx.com.santander.hexagonalmodularmaven.producto.rest.advice;

import mx.com.santander.hexagonalmodularmaven.producto.model.exception.ProductoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductoControllerAdvice {

    @ExceptionHandler(ProductoException.class)
    public ResponseEntity<String> handleProductoException(ProductoException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.BAD_REQUEST);
    }
}
