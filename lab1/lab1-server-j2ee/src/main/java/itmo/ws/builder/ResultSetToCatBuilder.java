package itmo.ws.builder;

import itmo.ws.model.Cat;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetToCatBuilder implements FunctionWithException<ResultSet, Cat> {
    @Override
    public Cat apply(ResultSet rs) throws SQLException {
        int uid = rs.getInt("uid");
        String name = rs.getString("name");
        int age = rs.getInt("age");
        String eyes_color = rs.getString("eyes_color");
        String fur_color = rs.getString("fur_color");
        String breed = rs.getString("breed");
        String owner_name = rs.getString("owner_name");
        return new Cat(uid, name, age, eyes_color, fur_color, breed, owner_name);
    }
}
