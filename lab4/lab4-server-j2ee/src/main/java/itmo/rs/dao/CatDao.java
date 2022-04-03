package itmo.rs.dao;

import itmo.rs.builder.ResultSetToCatBuilder;
import itmo.rs.config.ConnectionUtil;
import itmo.rs.model.Cat;
import itmo.rs.service.CatService;
import lombok.RequiredArgsConstructor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RequiredArgsConstructor
public class CatDao implements CatService {

    private final Connection connection;

    private final ResultSetToCatBuilder catBuilder = new ResultSetToCatBuilder();

    public List<Cat> getCats() {
        return executeQuery("select * from cat");
    }

    public List<Cat> getCatsByName(String name) {
        return executeQuery("select * from cat where name ='" + name + "'");
    }

    public Cat getCatByUid(int uid) {
        Cat cat = null;
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from cat where uid ='" + uid + "'");
            rs.next();
            cat = catBuilder.apply(rs);
        } catch (SQLException ex) {
            Logger.getLogger(CatDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cat;
    }

    public List<Cat> getCatsByDescription(String eyesColor, String furColor) {
        return executeQuery("select * from cat where eyes_color ='" + eyesColor + "'" + "and fur_color = '" + furColor + "'");
    }

    public List<Cat> getCatsByBreed(String breed) {
        return executeQuery("select * from cat where breed ='" + breed + "'");
    }

    public List<Cat> getCatsByOwner(String owner) {
        return executeQuery("select * from cat where owner_name ='" + owner + "'");
    }

    public List<Cat> getCatsByOwnerAndName(String name, String owner) {
        return executeQuery("select * from cat where name ='" + name + "'" + "and owner_name = '" + owner + "'");
    }

    public List<Cat> getCatsByNameAndAge(String name, int age) {
        return executeQuery("select * from cat where name ='" + name + "'" + "and age = '" + age + "'");
    }

    public List<Cat> getCatsByBreedAndOwner(String breed, String owner) {
        return executeQuery("select * from cat where breed ='" + breed + "'" + "and owner_name = '" + owner + "'");
    }

    public List<Cat> getCatsByFullDescription(String eyesColor, String furColor, String breed) {
        return executeQuery("select * from cat where eyes_color ='" + eyesColor + "'" + "and fur_color = '" + furColor + "'" + "and breed = '" + breed + "'");
    }

    private List<Cat> executeQuery(String query) {
        List<Cat> cats = new ArrayList<>();
        try {
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
