package itmo.rs;

import com.sun.jersey.api.client.Client;
import itmo.rs.exception.EmptyInputParamException;
import itmo.rs.model.Cat;
import itmo.rs.request.RequestService;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Client client = Client.create();

        System.out.println("==========GET ALL CATS=============");
        try {
            printCats(RequestService.getAllCats(client));
        } catch (SQLException | EmptyInputParamException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========GET ALL CATS BY NAME=============");
        try {
            printCats(RequestService.getCatsByName(client, "Vasya"));
        } catch (EmptyInputParamException exception) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL ");
            System.out.println(exception.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========GET ALL CATS BY UID=============");
        try {
            printOneCat(RequestService.getCatByUid(client, 1));
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========GET ALL CATS BY DESCRIPTION=============");
        try {
            printCats(RequestService.getCatsByDescription(client, "green", "gray stripped"));
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========GET ALL CATS BY BREED=============");
        try {
            printCats(RequestService.getCatsByBreed(client, "none"));
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========GET ALL CATS BY OWNER=============");
        try {
            printCats(RequestService.getCatsByOwner(client, "Ira"));
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========GET ALL CATS BY OWNER AND NAME=============");
        try {
            printCats(RequestService.getCatsByOwnerAndName(client, "Vasya", "Ira"));
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========GET ALL CATS BY NAME AND AGE=============");
        try {
            printCats(RequestService.getCatsByNameAndAge(client, "Vasya", 12));
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========GET ALL CATS BY BREED AND OWNER=============");
        try {
            printCats(RequestService.getCatsByBreedAndOwner(client, "none", "Ira"));
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========GET ALL CATS BY FULL DESCRIPTION=============");
        try {
            printCats(RequestService.getCatsByFullDescription(client, "green", "gray stripped", "none"));
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        int uid = -1;
        System.out.println("==========CREATE CAT=============");
        try {
            uid = RequestService.createCat(client, "Kitty", 2, "green", "gray stripped", "none", "Ira");
            System.out.println(uid);
            System.out.println();
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========UPDATE CAT NAME=============");
        try {
            RequestService.updateCatName(client, uid, "Kit");
            System.out.println("Cat with id " + uid + " updated");
            System.out.println();
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========UPDATE CAT DESCRIPTION=============");
        try {
            RequestService.updateCatDescription(client, uid, "yellow", "black and white");
            System.out.println("Cat with id " + uid + " updated");
            System.out.println();
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========UPDATE CAT BREED=============");
        try {
            RequestService.updateCatBreed(client, uid, "Maine coon");
            System.out.println("Cat with id " + uid + " updated");
            System.out.println();
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========UPDATE CAT OWNER=============");
        try {
            RequestService.updateCatOwner(client, uid, "Irina");
            System.out.println("Cat with id " + uid + " updated");
            System.out.println();
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========UPDATE CAT=============");
        try {
            RequestService.updateCat(client, uid, "Kisa", 3, "yellow", "black", "none", "Irina");
            System.out.println("Cat with id " + uid + " updated");
            System.out.println();
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }

        System.out.println("==========DELETE CAT=============");
        try {
            RequestService.deleteCat(client, uid);
            System.out.println("Cat with id " + uid + " removed");
            System.out.println();
        } catch (EmptyInputParamException e) {
            System.out.println("SOME REQUEST PARAM IS EMPTY OR NULL");
            System.out.println(e.getMessage());
            System.out.println();
        } catch (SQLException e) {
            System.out.println("SQL exception appeared " + e.getMessage());
            System.out.println();
        }
    }

    private static void printCats(List<Cat> cats) {
        for (Cat cat : cats) {
            printOneCat(cat);
        }

        System.out.println("Total cats: " + cats.size());
        System.out.println();
    }

    private static void printOneCat(Cat cat) {
        System.out.println(
                "uid: " + cat.getUid()
                        + ", Name: " + cat.getName()
                        + ", Age: " + cat.getAge()
                        + ", Breed: " + cat.getBreed()
                        + ", Owner: " + cat.getOwnerName()
                        + ", Fur color: " + cat.getFurColor()
                        + ", Eyes color: " + cat.getEyesColor()
        );
    }
}
