package itmo.ws.exception;

import itmo.ws.impl.CatServiceFault;
import lombok.Getter;

import javax.xml.ws.WebFault;

@WebFault(faultBean = "itmo.ws.impl.CatServiceFault")
public class AuthException extends Exception{
    private static final long serialVersionUID = -6647544772732631077L;
    @Getter
    private final CatServiceFault fault;

    public AuthException(String message, CatServiceFault fault) {
        super(message);
        this.fault = fault;
    }
}
