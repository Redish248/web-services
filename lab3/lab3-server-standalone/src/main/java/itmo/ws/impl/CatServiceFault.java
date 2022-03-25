package itmo.ws.impl;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CatServiceFault {
    protected String message;

    public static CatServiceFault defaultInstance() {
        CatServiceFault fault = new CatServiceFault();
        fault.message = "Argument cannot be null or empty";
        return fault;
    }
}
