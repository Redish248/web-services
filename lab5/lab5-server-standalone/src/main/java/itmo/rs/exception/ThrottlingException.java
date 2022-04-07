package itmo.rs.exception;

public class ThrottlingException extends Exception {
    private static final long serialVersionUID = -6647544772732631077L;
    public static ThrottlingException DEFAULT_INSTANCE = new
            ThrottlingException("Too many requests");
    public ThrottlingException(String message) {
        super(message);
    }
}
