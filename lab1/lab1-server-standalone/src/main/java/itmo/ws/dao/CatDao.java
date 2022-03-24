package itmo.ws.dao;

import itmo.ws.builder.ResultSetToCatBuilder;
import itmo.ws.config.ConnectionUtil;
import itmo.ws.model.Cat;
import itmo.ws.service.CatService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CatDao implements CatService {

    private final ResultSetToCatBuilder catBuilder = new ResultSetToCatBuilder();

    @Override
    public List<Cat> getCats() {
        return executeQuery("select * from cat");
    }

    @Override
    public List<Cat> getCatsByName(String name) {
        return executeQuery("select * from cat where name ='" + name + "'");
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
        return executeQuery("select * from cat where eyes_color ='" + eyesColor + "'" + "and fur_color = '" + furColor + "'");
    }

    @Override
    public List<Cat> getCatsByBreed(String breed) {
        return executeQuery("select * from cat where breed ='" + breed + "'");
    }

    @Override
    public List<Cat> getCatsByOwner(String owner) {
        return executeQuery("select * from cat where owner_name ='" + owner + "'");
    }

    @Override
    public List<Cat> getCatsByOwnerAndName(String name, String owner) {
        return executeQuery("select * from cat where name ='" + name + "'" + "and owner_name = '" + owner + "'");
    }

    @Override
    public List<Cat> getCatsByNameAndAge(String name, int age) {
        return executeQuery("select * from cat where name ='" + name + "'" + "and age = '" + age + "'");
    }

    @Override
    public List<Cat> getCatsByBreedAndOwner(String breed, String owner) {
        return executeQuery("select * from cat where breed ='" + breed + "'" + "and owner_name = '" + owner + "'");
    }

    @Override
    public List<Cat> getCatsByFullDescription(String eyesColor, String furColor, String breed) {
        return executeQuery("select * from cat where eyes_color ='" + eyesColor + "'" + "and fur_color = '" + furColor + "'" + "and breed = '" + breed + "'");
    }

    private List<Cat> executeQuery(String query) {
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
