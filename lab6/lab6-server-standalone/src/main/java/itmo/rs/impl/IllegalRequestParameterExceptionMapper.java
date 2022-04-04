package itmo.rs.impl;

import itmo.rs.exception.IllegalRequestParameterException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class IllegalRequestParameterExceptionMapper implements ExceptionMapper<IllegalRequestParameterException> {
    @Override
    public Response toResponse(IllegalRequestParameterException exception) {
        return Response.status(Response.Status.NOT_ACCEPTABLE).entity(exception.getMessage()).build();
    }
}
