package itmo.rs.builder;

import java.sql.SQLException;

@FunctionalInterface
public interface FunctionWithException<T, R> {
    R apply(T t) throws SQLException;
}
