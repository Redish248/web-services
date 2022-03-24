package itmo.ws.service;

import itmo.ws.model.Cat;

import java.util.List;

public interface CatService {

    List<Cat> getCats();

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

    boolean deleteCat(int uid);

    boolean updateCatName(int uid, String name);

    boolean updateCatDescription(int uid, String eyesColor, String furColor);

    boolean updateCatBreed(int uid, String breed);

    boolean updateCatOwner(int uid, String owner);

    boolean updateCat(int uid, String name, int age, String eyesColor, String furColor, String breed, String ownerName);
}
