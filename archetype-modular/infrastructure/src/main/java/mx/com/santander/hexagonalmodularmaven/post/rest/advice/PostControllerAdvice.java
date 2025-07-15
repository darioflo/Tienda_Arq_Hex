package mx.com.santander.hexagonalmodularmaven.post.rest.advice;

import mx.com.santander.hexagonalmodularmaven.post.model.exception.PostException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PostControllerAdvice {

    @ExceptionHandler(PostException.class)
    public ResponseEntity<String> handlePostException(PostException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.BAD_REQUEST);
    }
}
