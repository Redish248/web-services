package itmo.rs.config;

import itmo.rs.dao.CatDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionUtil {
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/web_services";
    private static final String JDBC_USER = "mag_db";
    private static final String JDBC_PASSWORD = "mag_db";
    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";

    static {
        try {
            Class.forName(POSTGRES_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
