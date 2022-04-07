package itmo.ws.service;

import itmo.ws.exception.AuthException;
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

    int createCat(String name, int age, String eyesColor, String furColor, String breed, String ownerName) throws AuthException;

    boolean deleteCat(int uid) throws AuthException;

    boolean updateCatName(int uid, String name) throws AuthException;

    boolean updateCatDescription(int uid, String eyesColor, String furColor) throws AuthException;

    boolean updateCatBreed(int uid, String breed) throws AuthException;

    boolean updateCatOwner(int uid, String owner) throws AuthException;

    boolean updateCat(int uid, String name, int age, String eyesColor, String furColor, String breed, String ownerName) throws AuthException;
}
