package itmo.ws;

import itmo.ws.impl.AuthException;
import itmo.ws.impl.Cat;
import itmo.ws.impl.CatService;
import itmo.ws.impl.CatWebServiceImpl;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final String WS_URL = "http://localhost:8080/CatService?wsdl";

    public static void main(String[] args) {
        CatService catService = new CatService();
        CatWebServiceImpl serviceWithAuth = catService.getCatWebServiceImplPort();

        Map<String, Object> requestContext = ((BindingProvider)serviceWithAuth).getRequestContext();
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);

        Map<String, List<String>> headers = new HashMap<>();
        headers.put("Username", Collections.singletonList("redish"));
        headers.put("Password", Collections.singletonList("redish"));
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

        System.out.println("==========GET ALL CATS=============");
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
        printCats(cats);

        try {
            System.out.println("==========CREATE CAT=============");
            int uid = serviceWithAuth.createCat("Kitty", 2, "green", "gray stripped", "none", "Ira");
            System.out.println(uid);
            System.out.println();

            System.out.println("==========UPDATE CAT NAME=============");
            serviceWithAuth.updateCatName(uid, "Kit");
            System.out.println("Cat with id " + uid + "updated");
            System.out.println();

            System.out.println("==========UPDATE CAT DESCRIPTION=============");
            serviceWithAuth.updateCatDescription(uid, "yellow", "black and white");
            System.out.println("Cat with id " + uid + "updated");
            System.out.println();

            System.out.println("==========UPDATE CAT BREED=============");
            serviceWithAuth.updateCatBreed(uid, "Maine coon");
            System.out.println("Cat with id " + uid + "updated");
            System.out.println();

            System.out.println("==========UPDATE CAT OWNER=============");
            serviceWithAuth.updateCatOwner(uid, "Irina");
            System.out.println("Cat with id " + uid + "updated");
            System.out.println();

            System.out.println("==========UPDATE CAT=============");
            serviceWithAuth.updateCat(uid, "Kisa", 3, "yellow", "black", "none", "Irina");
            System.out.println("Cat with id " + uid + "updated");
            System.out.println();

            System.out.println("==========DELETE CAT=============");
            serviceWithAuth.deleteCat(uid);
            System.out.println("Cat with id " + uid + " removed");
            System.out.println();
        } catch (AuthException exception) {
            System.out.println("AUTH FAILED");
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
