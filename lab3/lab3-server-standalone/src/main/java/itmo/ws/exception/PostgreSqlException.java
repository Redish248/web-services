package itmo.ws.exception;

import itmo.ws.impl.CatServiceFault;
import lombok.Getter;

import javax.xml.ws.WebFault;

@WebFault(faultBean = "itmo.ws.impl.CatServiceFault")
public class PostgreSqlException extends Exception {
    private static final long serialVersionUID = -6647544772732631077L;
    @Getter
    private final CatServiceFault fault;

    public PostgreSqlException(String message, CatServiceFault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }
}
