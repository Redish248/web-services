package itmo.ws.dao;

import itmo.ws.builder.ResultSetToCatBuilder;
import itmo.ws.config.ConnectionUtil;
import itmo.ws.exception.PostgreSqlException;
import itmo.ws.impl.CatServiceFault;
import itmo.ws.model.Cat;
import itmo.ws.service.CatService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CatDao {

    private static final String UPDATE_TEMPLATE = "UPDATE cat SET %s where uid = ?";

    private final ResultSetToCatBuilder catBuilder = new ResultSetToCatBuilder();

    public List<Cat> getCats() throws PostgreSqlException {
        return executeSelectQuery("select * from cat");
    }

    public List<Cat> getCatsByName(String name) throws PostgreSqlException {
        return executeSelectQuery("select * from cat where name ='" + name + "'");
    }

    public Cat getCatByUid(int uid) throws PostgreSqlException {
        Cat cat;
        try (Connection connection = ConnectionUtil.getConnection()) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from cat where uid ='" + uid + "'");
            rs.next();
            cat = catBuilder.apply(rs);
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
            CatServiceFault fault = CatServiceFault.defaultInstance();
            fault.setMessage("SQL exception");
            throw new PostgreSqlException("Error during fetching cat by uid", fault, ex.getCause());
        }
        return cat;
    }

    public List<Cat> getCatsByDescription(String eyesColor, String furColor) throws PostgreSqlException {
        return executeSelectQuery("select * from cat where eyes_color ='" + eyesColor + "'" + "and fur_color = '" + furColor + "'");
    }

    public List<Cat> getCatsByBreed(String breed) throws PostgreSqlException {
        return executeSelectQuery("select * from cat where breed ='" + breed + "'");
    }

    public List<Cat> getCatsByOwner(String owner) throws PostgreSqlException {
        return executeSelectQuery("select * from cat where owner_name ='" + owner + "'");
    }

    public List<Cat> getCatsByOwnerAndName(String name, String owner) throws PostgreSqlException {
        return executeSelectQuery("select * from cat where name ='" + name + "'" + "and owner_name = '" + owner + "'");
    }

    public List<Cat> getCatsByNameAndAge(String name, int age) throws PostgreSqlException {
        return executeSelectQuery("select * from cat where name ='" + name + "'" + "and age = '" + age + "'");
    }

    public List<Cat> getCatsByBreedAndOwner(String breed, String owner) throws PostgreSqlException {
        return executeSelectQuery("select * from cat where breed ='" + breed + "'" + "and owner_name = '" + owner + "'");
    }

    public List<Cat> getCatsByFullDescription(String eyesColor, String furColor, String breed) throws PostgreSqlException {
        return executeSelectQuery("select * from cat where eyes_color ='" + eyesColor + "'" + "and fur_color = '" + furColor + "'" + "and breed = '" + breed + "'");
    }

    public int createCat(String name, int age, String eyesColor, String furColor, String breed, String ownerName) throws PostgreSqlException {
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into cat (name, age, eyes_color, fur_color, breed, owner_name) values (?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, eyesColor);
            preparedStatement.setString(4, furColor);
            preparedStatement.setString(5, breed);
            preparedStatement.setString(6, ownerName);
            preparedStatement.executeUpdate();

            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
            CatServiceFault fault = CatServiceFault.defaultInstance();
            fault.setMessage("SQL exception");
            throw new PostgreSqlException("Error during creating cat", fault, ex.getCause());
        }
        return -1;
    }

    public boolean deleteCat(int uid) throws PostgreSqlException {
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from cat where uid = ?");
            preparedStatement.setInt(1, uid);
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
            CatServiceFault fault = CatServiceFault.defaultInstance();
            fault.setMessage("SQL exception");
            throw new PostgreSqlException("Error during deleting cat", fault, ex.getCause());
        }
    }

    public boolean updateCatName(int uid, String name) throws PostgreSqlException {
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(String.format(UPDATE_TEMPLATE, "name = ?"));
            preparedStatement.setString(1,  name);
            preparedStatement.setInt(2, uid);
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
            CatServiceFault fault = CatServiceFault.defaultInstance();
            fault.setMessage("SQL exception");
            throw new PostgreSqlException("Error during updating cat name", fault, ex.getCause());
        }
    }

    public boolean updateCatDescription(int uid, String eyesColor, String furColor) throws PostgreSqlException {
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(String.format(UPDATE_TEMPLATE, "eyes_color = ?, fur_color = ?"));
            preparedStatement.setString(1,  eyesColor);
            preparedStatement.setString(2,  furColor);
            preparedStatement.setInt(3, uid);
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
            CatServiceFault fault = CatServiceFault.defaultInstance();
            fault.setMessage("SQL exception");
            throw new PostgreSqlException("Error during updating cat eyes and fur color", fault, ex.getCause());
        }
    }

    public boolean updateCatBreed(int uid, String breed) throws PostgreSqlException {
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(String.format(UPDATE_TEMPLATE, "breed = ?"));
            preparedStatement.setString(1,  breed);
            preparedStatement.setInt(2, uid);
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
            CatServiceFault fault = CatServiceFault.defaultInstance();
            fault.setMessage("SQL exception");
            throw new PostgreSqlException("Error during updating cat breed", fault, ex.getCause());
        }
    }

    public boolean updateCatOwner(int uid, String owner) throws PostgreSqlException {
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(String.format(UPDATE_TEMPLATE, "owner_name = ?"));
            preparedStatement.setString(1,  owner);
            preparedStatement.setInt(2, uid);
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
            CatServiceFault fault = CatServiceFault.defaultInstance();
            fault.setMessage("SQL exception");
            throw new PostgreSqlException("Error during updating cat owner", fault, ex.getCause());
        }
    }

    public boolean updateCat(int uid, String name, int age, String eyesColor, String furColor, String breed, String ownerName) throws PostgreSqlException {
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(String.format(UPDATE_TEMPLATE, "name = ?, age = ?, eyes_color = ?, fur_color = ?, breed = ?, owner_name = ?"));
            preparedStatement.setString(1,  name);
            preparedStatement.setInt(2,  age);
            preparedStatement.setString(3,  eyesColor);
            preparedStatement.setString(4,  furColor);
            preparedStatement.setString(5,  breed);
            preparedStatement.setString(6,  ownerName);
            preparedStatement.setInt(7, uid);
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
            CatServiceFault fault = CatServiceFault.defaultInstance();
            fault.setMessage("SQL exception");
            throw new PostgreSqlException("Error during updating cat", fault, ex.getCause());
        }
    }

    private List<Cat> executeSelectQuery(String query) throws PostgreSqlException {
        List<Cat> cats;
        try (Connection connection = ConnectionUtil.getConnection()) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            cats = parseCatFromDatabase(rs);
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
            CatServiceFault fault = CatServiceFault.defaultInstance();
            fault.setMessage("SQL exception");
            throw new PostgreSqlException("Error during selecting cat info", fault, ex.getCause());
        }
        return cats;
    }

    private List<Cat> parseCatFromDatabase(ResultSet rs) throws SQLException {
        List<Cat> cats = new ArrayList<>();
        while (rs.next()) {
            Cat cat = catBuilder.apply(rs);
            cats.add(cat);
        }
        return cats;
    }
}
