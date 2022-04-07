package itmo.rs;

import com.sun.jersey.api.client.Client;
import itmo.rs.exception.ThrottlingException;
import itmo.rs.model.Cat;
import itmo.rs.request.RequestService;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Client client = Client.create();

        System.out.println("==========GET ALL CATS=============");
        //printCats(RequestService.getAllCats(client));

        Thread[] threads = new Thread[15];
        for(int i = 0; i < 15; i++) {
            threads[i] = new Thread(() -> {
                try {
                    printCats(RequestService.getAllCats(client));
                } catch (ThrottlingException e) {
                    System.out.println("EXCEPTION: " + e.getMessage());
                }
            });
            threads[i].start();
        }

        /*System.out.println("==========GET ALL CATS BY NAME=============");
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

        System.out.println("==========CREATE CAT=============");
        int uid = RequestService.createCat(client, "Kitty", 2, "green", "gray stripped", "none", "Ira");
        System.out.println(uid);
        System.out.println();

        System.out.println("==========UPDATE CAT NAME=============");
        RequestService.updateCatName(client, uid, "Kit");
        System.out.println("Cat with id " + uid + " updated");
        System.out.println();

        System.out.println("==========UPDATE CAT DESCRIPTION=============");
        RequestService.updateCatDescription(client, uid, "yellow", "black and white");
        System.out.println("Cat with id " + uid + " updated");
        System.out.println();

        System.out.println("==========UPDATE CAT BREED=============");
        RequestService.updateCatBreed(client, uid, "Maine coon");
        System.out.println("Cat with id " + uid + " updated");
        System.out.println();

        System.out.println("==========UPDATE CAT OWNER=============");
        RequestService.updateCatOwner(client, uid, "Irina");
        System.out.println("Cat with id " + uid + " updated");
        System.out.println();

        System.out.println("==========UPDATE CAT=============");
        RequestService.updateCat(client, uid, "Kisa", 3, "yellow", "black", "none", "Irina");
        System.out.println("Cat with id " + uid + " updated");
        System.out.println();

        System.out.println("==========DELETE CAT=============");
        RequestService.deleteCat(client, uid);
        System.out.println("Cat with id " + uid + " removed");
        System.out.println();*/
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
