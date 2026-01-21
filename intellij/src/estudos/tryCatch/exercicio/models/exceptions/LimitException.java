package estudos.tryCatch.exercicio.models.exceptions;

public class LimitException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public LimitException(String message) {
        super(message);
    }

}
