package itmo.rs.exception;

public class IllegalRequestParameterException extends Exception {

    private static final long serialVersionUID = -6647544772732631047L;
    public static IllegalRequestParameterException DEFAULT_INSTANCE = new
            IllegalRequestParameterException("Input param cannot be null or empty");

    public IllegalRequestParameterException(String message) {
        super(message);
    }

}
