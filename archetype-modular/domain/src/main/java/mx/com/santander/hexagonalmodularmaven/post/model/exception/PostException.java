package mx.com.santander.hexagonalmodularmaven.post.model.exception;

public class PostException extends RuntimeException {

    private final String errorMessage;

    public PostException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
