package itmo.rs.exception;

public class PostgreSqlException extends Exception {
    private static final long serialVersionUID = -6647544772732631077L;
    public static PostgreSqlException DEFAULT_INSTANCE = new
            PostgreSqlException("SQL Exception appeared");
    public PostgreSqlException(String message) {
        super(message);
    }
}
