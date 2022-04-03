package itmo.rs;

import com.sun.jersey.api.client.Client;
import itmo.rs.model.Cat;
import itmo.rs.request.RequestService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Client client = Client.create();

        System.out.println("==========GET ALL CATS=============");
        printCats(RequestService.getAllCats(client));

        System.out.println("==========GET ALL CATS BY NAME=============");
        printCats(RequestService.getCatsByName(client, "Vasya"));

        System.out.println("==========GET ALL CATS BY UID=============");
        printOneCat(RequestService.getCatByUid(client, 1));

        System.out.println("==========GET ALL CATS BY DESCRIPTION=============");
        printCats(RequestService.getCatsByDescription(client, "green", "gray stripped"));

        System.out.println("==========GET ALL CATS BY BREED=============");
        printCats(RequestService.getCatsByBreed(client, "none"));

        System.out.println("==========GET ALL CATS BY OWNER=============");
        printCats(RequestService.getCatsByOwner(client, "Ira"));

        System.out.println("==========GET ALL CATS BY OWNER AND NAME=============");
        printCats(RequestService.getCatsByOwnerAndName(client, "Vasya", "Ira"));

        System.out.println("==========GET ALL CATS BY NAME AND AGE=============");
        printCats(RequestService.getCatsByNameAndAge(client, "Vasya", 12));

        System.out.println("==========GET ALL CATS BY BREED AND OWNER=============");
        printCats(RequestService.getCatsByBreedAndOwner(client, "none", "Ira"));

        System.out.println("==========GET ALL CATS BY FULL DESCRIPTION=============");
        printCats(RequestService.getCatsByFullDescription(client, "green", "gray stripped", "none"));
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
