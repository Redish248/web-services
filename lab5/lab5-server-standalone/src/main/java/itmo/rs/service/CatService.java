package itmo.rs.service;

import itmo.rs.exception.ThrottlingException;
import itmo.rs.model.Cat;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface CatService {

    List<Cat> getCats() throws ThrottlingException, ExecutionException, InterruptedException;

    List<Cat> getCatsByName(String name);

    Cat getCatByUid(int uid);

    List<Cat> getCatsByDescription(String eyesColor, String furColor);

    List<Cat> getCatsByBreed(String breed);

    List<Cat> getCatsByOwner(String owner);

    List<Cat> getCatsByOwnerAndName(String name, String owner);

    List<Cat> getCatsByNameAndAge(String name, int age);

    List<Cat> getCatsByBreedAndOwner(String breed, String owner);

    List<Cat> getCatsByFullDescription(String eyesColor, String furColor, String breed);

    int createCat(String name, int age, String eyesColor, String furColor, String breed, String ownerName);

    Boolean deleteCat(int uid);

    Boolean updateCatName(int uid, String name);

    Boolean updateCatDescription(int uid, String eyesColor, String furColor);

    Boolean updateCatBreed(int uid, String breed);

    Boolean updateCatOwner(int uid, String owner);

    Boolean updateCat(int uid, String name, int age, String eyesColor, String furColor, String breed, String ownerName);
}
