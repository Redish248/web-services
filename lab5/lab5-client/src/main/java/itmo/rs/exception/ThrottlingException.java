package itmo.rs.exception;

public class ThrottlingException extends Exception {

    public ThrottlingException(String message) {
        super(message);
    }
}
