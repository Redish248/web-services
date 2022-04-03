package itmo.rs.dao;

import itmo.rs.builder.ResultSetToCatBuilder;
import itmo.rs.config.ConnectionUtil;
import itmo.rs.model.Cat;
import itmo.rs.service.CatService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CatDao implements CatService {

    private static final String UPDATE_TEMPLATE = "UPDATE cat SET %s where uid = ?";

    private final ResultSetToCatBuilder catBuilder = new ResultSetToCatBuilder();

    @Override
    public List<Cat> getCats() {
        return executeSelectQuery("select * from cat");
    }

    @Override
    public List<Cat> getCatsByName(String name) {
        return executeSelectQuery("select * from cat where name ='" + name + "'");
    }

    @Override
    public Cat getCatByUid(int uid) {
        Cat cat = null;
        try (Connection connection = ConnectionUtil.getConnection()) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from cat where uid ='" + uid + "'");
            rs.next();
            cat = catBuilder.apply(rs);
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cat;
    }

    @Override
    public List<Cat> getCatsByDescription(String eyesColor, String furColor) {
        return executeSelectQuery("select * from cat where eyes_color ='" + eyesColor + "'" + "and fur_color = '" + furColor + "'");
    }

    @Override
    public List<Cat> getCatsByBreed(String breed) {
        return executeSelectQuery("select * from cat where breed ='" + breed + "'");
    }

    @Override
    public List<Cat> getCatsByOwner(String owner) {
        return executeSelectQuery("select * from cat where owner_name ='" + owner + "'");
    }

    @Override
    public List<Cat> getCatsByOwnerAndName(String name, String owner) {
        return executeSelectQuery("select * from cat where name ='" + name + "'" + "and owner_name = '" + owner + "'");
    }

    @Override
    public List<Cat> getCatsByNameAndAge(String name, int age) {
        return executeSelectQuery("select * from cat where name ='" + name + "'" + "and age = '" + age + "'");
    }

    @Override
    public List<Cat> getCatsByBreedAndOwner(String breed, String owner) {
        return executeSelectQuery("select * from cat where breed ='" + breed + "'" + "and owner_name = '" + owner + "'");
    }

    @Override
    public List<Cat> getCatsByFullDescription(String eyesColor, String furColor, String breed) {
        return executeSelectQuery("select * from cat where eyes_color ='" + eyesColor + "'" + "and fur_color = '" + furColor + "'" + "and breed = '" + breed + "'");
    }

    @Override
    public int createCat(String name, int age, String eyesColor, String furColor, String breed, String ownerName) {
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
        }
        return -1;
    }

    @Override
    public Boolean deleteCat(int uid) {
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from cat where uid = ?");
            preparedStatement.setInt(1, uid);
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Boolean updateCatName(int uid, String name) {
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(String.format(UPDATE_TEMPLATE, "name = ?"));
            preparedStatement.setString(1,  name);
            preparedStatement.setInt(2, uid);
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Boolean updateCatDescription(int uid, String eyesColor, String furColor) {
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(String.format(UPDATE_TEMPLATE, "eyes_color = ?, fur_color = ?"));
            preparedStatement.setString(1,  eyesColor);
            preparedStatement.setString(2,  furColor);
            preparedStatement.setInt(3, uid);
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Boolean updateCatBreed(int uid, String breed) {
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(String.format(UPDATE_TEMPLATE, "breed = ?"));
            preparedStatement.setString(1,  breed);
            preparedStatement.setInt(2, uid);
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Boolean updateCatOwner(int uid, String owner) {
        try (Connection connection = ConnectionUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(String.format(UPDATE_TEMPLATE, "owner_name = ?"));
            preparedStatement.setString(1,  owner);
            preparedStatement.setInt(2, uid);
            return preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Boolean updateCat(int uid, String name, int age, String eyesColor, String furColor, String breed, String ownerName) {
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
        }
        return false;
    }

    private List<Cat> executeSelectQuery(String query) {
        List<Cat> cats = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            cats = parseCatFromDatabase(rs);
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
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
