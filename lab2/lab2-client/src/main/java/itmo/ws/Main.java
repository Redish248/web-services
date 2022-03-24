package itmo.ws;

import itmo.ws.impl.Cat;
import itmo.ws.impl.CatService;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/CatService?wsdl");
        CatService catService = new CatService(url);

        /*System.out.println("==========GET ALL CATS=============");
        List<Cat> cats = catService.getCatWebServiceImplPort().getCats();
        printCats(cats);

        System.out.println("==========GET ALL CATS BY NAME=============");
        cats = catService.getCatWebServiceImplPort().getCatsByName("Vasya");
        printCats(cats);

        System.out.println("==========GET ALL CATS BY UID=============");
        Cat cat = catService.getCatWebServiceImplPort().getCatByUid(1);
        printOneCat(cat);
        System.out.println();

        System.out.println("==========GET ALL CATS BY DESCRIPTION=============");
        cats = catService.getCatWebServiceImplPort().getCatsByDescription("green", "gray stripped");
        printCats(cats);

        System.out.println("==========GET ALL CATS BY BREED=============");
        cats = catService.getCatWebServiceImplPort().getCatsByBreed("none");
        printCats(cats);

        System.out.println("==========GET ALL CATS BY OWNER=============");
        cats = catService.getCatWebServiceImplPort().getCatsByOwner("Ira");
        printCats(cats);

        System.out.println("==========GET ALL CATS BY OWNER AND NAME=============");
        cats = catService.getCatWebServiceImplPort().getCatsByOwnerAndName("Vasya","Ira");
        printCats(cats);

        System.out.println("==========GET ALL CATS BY NAME AND AGE=============");
        cats = catService.getCatWebServiceImplPort().getCatsByNameAndAge("Vasya",12);
        printCats(cats);

        System.out.println("==========GET ALL CATS BY BREED AND OWNER=============");
        cats = catService.getCatWebServiceImplPort().getCatsByBreedAndOwner("none", "Ira");
        printCats(cats);

        System.out.println("==========GET ALL CATS BY FULL DESCRIPTION=============");
        cats = catService.getCatWebServiceImplPort().getCatsByFullDescription("green", "gray stripped", "none");
        printCats(cats);*/

        System.out.println("==========CREATE CAT=============");
        int uid = catService.getCatWebServiceImplPort().createCat("Kitty", 2, "green", "gray stripped", "none", "Ira");
        System.out.println(uid);
        System.out.println();

        System.out.println("==========UPDATE CAT NAME=============");
        catService.getCatWebServiceImplPort().updateCatName(uid, "Kit");
        System.out.println("Cat with id " + uid + "updated");
        System.out.println();

        System.out.println("==========UPDATE CAT DESCRIPTION=============");
        catService.getCatWebServiceImplPort().updateCatDescription(uid, "yellow", "black and white");
        System.out.println("Cat with id " + uid + "updated");
        System.out.println();

        System.out.println("==========UPDATE CAT BREED=============");
        catService.getCatWebServiceImplPort().updateCatBreed(uid, "Maine coon");
        System.out.println("Cat with id " + uid + "updated");
        System.out.println();

        System.out.println("==========UPDATE CAT OWNER=============");
        catService.getCatWebServiceImplPort().updateCatOwner(uid, "Irina");
        System.out.println("Cat with id " + uid + "updated");
        System.out.println();

        System.out.println("==========UPDATE CAT=============");
        catService.getCatWebServiceImplPort().updateCat(uid, "Kisa", 3, "yellow", "black", "none", "Irina");
        System.out.println("Cat with id " + uid + "updated");
        System.out.println();

        System.out.println("==========DELETE CAT=============");
        catService.getCatWebServiceImplPort().deleteCat(uid);
        System.out.println("Cat with id " + uid + " removed");
        System.out.println();
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
