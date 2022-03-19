package itmo.ws.config;

import itmo.ws.service.CatService;

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
            Logger.getLogger(CatService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
