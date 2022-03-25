package itmo.ws.service;

import itmo.ws.exception.IllegalRequestParameterException;
import itmo.ws.exception.PostgreSqlException;
import itmo.ws.model.Cat;

import java.util.List;

public interface CatService {

    List<Cat> getCats() throws PostgreSqlException;

    List<Cat> getCatsByName(String name) throws IllegalRequestParameterException, PostgreSqlException;

    Cat getCatByUid(int uid) throws PostgreSqlException;

    List<Cat> getCatsByDescription(String eyesColor, String furColor) throws PostgreSqlException, IllegalRequestParameterException;

    List<Cat> getCatsByBreed(String breed) throws PostgreSqlException, IllegalRequestParameterException;

    List<Cat> getCatsByOwner(String owner) throws PostgreSqlException, IllegalRequestParameterException;

    List<Cat> getCatsByOwnerAndName(String name, String owner) throws PostgreSqlException, IllegalRequestParameterException;

    List<Cat> getCatsByNameAndAge(String name, int age) throws PostgreSqlException, IllegalRequestParameterException;

    List<Cat> getCatsByBreedAndOwner(String breed, String owner) throws PostgreSqlException, IllegalRequestParameterException;

    List<Cat> getCatsByFullDescription(String eyesColor, String furColor, String breed) throws PostgreSqlException, IllegalRequestParameterException;

    int createCat(String name, int age, String eyesColor, String furColor, String breed, String ownerName) throws PostgreSqlException, IllegalRequestParameterException;

    boolean deleteCat(int uid) throws PostgreSqlException;

    boolean updateCatName(int uid, String name) throws PostgreSqlException, IllegalRequestParameterException;

    boolean updateCatDescription(int uid, String eyesColor, String furColor) throws PostgreSqlException, IllegalRequestParameterException;

    boolean updateCatBreed(int uid, String breed) throws PostgreSqlException, IllegalRequestParameterException;

    boolean updateCatOwner(int uid, String owner) throws PostgreSqlException, IllegalRequestParameterException;

    boolean updateCat(int uid, String name, int age, String eyesColor, String furColor, String breed, String ownerName) throws PostgreSqlException, IllegalRequestParameterException;
}
