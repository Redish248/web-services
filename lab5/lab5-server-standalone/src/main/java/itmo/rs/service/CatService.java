package itmo.rs.service;

import itmo.rs.exception.AuthException;
import itmo.rs.model.Cat;

import java.io.UnsupportedEncodingException;
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

    int createCat(String name, int age, String eyesColor, String furColor, String breed, String ownerName, String authString) throws UnsupportedEncodingException, AuthException;

    Boolean deleteCat(int uid, String authString) throws UnsupportedEncodingException, AuthException;

    Boolean updateCatName(int uid, String name, String authString) throws UnsupportedEncodingException, AuthException;

    Boolean updateCatDescription(int uid, String eyesColor, String furColor, String authString) throws UnsupportedEncodingException, AuthException;

    Boolean updateCatBreed(int uid, String breed, String authString) throws UnsupportedEncodingException, AuthException;

    Boolean updateCatOwner(int uid, String owner, String authString) throws UnsupportedEncodingException, AuthException;

    Boolean updateCat(int uid, String name, int age, String eyesColor, String furColor, String breed, String ownerName, String authString) throws UnsupportedEncodingException, AuthException;
}
