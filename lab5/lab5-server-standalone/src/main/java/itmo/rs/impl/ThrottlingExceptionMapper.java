package itmo.rs.impl;

import itmo.rs.exception.ThrottlingException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ThrottlingExceptionMapper implements ExceptionMapper<ThrottlingException> {
    @Override
    public Response toResponse(ThrottlingException exception) {
        return Response.status(Response.Status.FORBIDDEN).entity(exception.getMessage()).build();
    }
}
