package itmo.rs.impl.mapper;

import itmo.rs.exception.PostgreSqlException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class PostgreSqlExceptionMapper implements ExceptionMapper<PostgreSqlException> {
    @Override
    public Response toResponse(PostgreSqlException exception) {
        return Response.status(Response.Status.NOT_MODIFIED).entity(exception.getMessage()).build();
    }
}
