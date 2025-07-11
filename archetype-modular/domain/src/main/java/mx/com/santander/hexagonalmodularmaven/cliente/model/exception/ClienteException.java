package mx.com.santander.hexagonalmodularmaven.cliente.model.exception;


public class ClienteException extends RuntimeException {

    private final String errorMessage;

    public ClienteException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
