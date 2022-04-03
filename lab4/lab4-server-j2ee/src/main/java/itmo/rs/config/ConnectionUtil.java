package itmo.rs.config;

import itmo.rs.impl.CatResource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionUtil {
    public static Connection getConnection(DataSource dataSource) {
        Connection result = null;
        try {
            result = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(CatResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
