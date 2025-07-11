package mx.com.santander.hexagonalmodularmaven.cliente.rest.advice;

import mx.com.santander.hexagonalmodularmaven.cliente.model.exception.ClienteException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ClienteControllerAdvice {

    @ExceptionHandler(ClienteException.class)
    public ResponseEntity<String> handleClienteException(ClienteException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.BAD_REQUEST);
    }

}
