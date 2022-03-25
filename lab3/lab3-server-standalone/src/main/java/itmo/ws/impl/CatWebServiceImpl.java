package itmo.ws.impl;

import itmo.ws.dao.CatDao;
import itmo.ws.exception.IllegalRequestParameterException;
import itmo.ws.exception.PostgreSqlException;
import itmo.ws.model.Cat;
import itmo.ws.service.CatService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@WebService(serviceName = "CatService")
public class CatWebServiceImpl implements CatService {

    private final CatDao catDao = new CatDao();

    @WebMethod(operationName = "getCats")
    @Override
    public List<Cat> getCats() throws PostgreSqlException {
        return catDao.getCats();
    }

    @WebMethod(operationName = "getCatsByName")
    @Override
    public List<Cat> getCatsByName(@WebParam(name = "name") String name)
            throws IllegalRequestParameterException, PostgreSqlException {
        validateInputParam(name, "name");
        return catDao.getCatsByName(name);
    }

    @WebMethod(operationName = "getCatByUid")
    @Override
    public Cat getCatByUid(@WebParam(name = "uid") @XmlElement(required=true) int uid)
            throws PostgreSqlException {
        return catDao.getCatByUid(uid);
    }

    @WebMethod(operationName = "getCatsByDescription")
    @Override
    public List<Cat> getCatsByDescription(@WebParam(name = "eyesColor") String eyesColor,
                                          @WebParam(name = "furColor") String furColor)
            throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(eyesColor, "eyesColor");
        validateInputParam(furColor, "furColor");
        return catDao.getCatsByDescription(eyesColor, furColor);
    }

    @WebMethod(operationName = "getCatsByBreed")
    @Override
    public List<Cat> getCatsByBreed(@WebParam(name = "breed") String breed)
            throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(breed, "breed");
        return catDao.getCatsByBreed(breed);
    }

    @WebMethod(operationName = "getCatsByOwner")
    @Override
    public List<Cat> getCatsByOwner(@WebParam(name = "owner") String owner)
            throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(owner, "owner");
        return catDao.getCatsByOwner(owner);
    }

    @WebMethod(operationName = "getCatsByOwnerAndName")
    @Override
    public List<Cat> getCatsByOwnerAndName(@WebParam(name = "name") String name,
                                           @WebParam(name = "owner") String owner)
            throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(name, "name");
        validateInputParam(owner, "owner");
        return catDao.getCatsByOwnerAndName(name, owner);
    }

    @WebMethod(operationName = "getCatsByNameAndAge")
    @Override
    public List<Cat> getCatsByNameAndAge(@WebParam(name = "name") String name,
                                         @WebParam(name = "age") int age)
            throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(name, "name");
        return catDao.getCatsByNameAndAge(name, age);
    }

    @WebMethod(operationName = "getCatsByBreedAndOwner")
    @Override
    public List<Cat> getCatsByBreedAndOwner(@WebParam(name = "breed") String breed,
                                            @WebParam(name = "owner") String owner)
            throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(breed, "breed");
        validateInputParam(owner, "owner");
        return catDao.getCatsByBreedAndOwner(breed, owner);
    }

    @WebMethod(operationName = "getCatsByFullDescription")
    @Override
    public List<Cat> getCatsByFullDescription(@WebParam(name = "eyesColor") String eyesColor,
                                              @WebParam(name = "furColor") String furColor,
                                              @WebParam(name = "breed") String breed)
            throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(eyesColor, "eyesColor");
        validateInputParam(furColor, "furColor");
        validateInputParam(breed, "breed");
        return catDao.getCatsByFullDescription(eyesColor, furColor, breed);
    }

    @WebMethod(operationName = "createCat")
    @Override
    public int createCat(@WebParam(name = "name") String name,
                         @WebParam(name = "age") @XmlElement(required=true) int age,
                         @WebParam(name = "eyesColor") String eyesColor,
                         @WebParam(name = "furColor") String furColor,
                         @WebParam(name = "breed") String breed,
                         @WebParam(name = "ownerName") String ownerName)
            throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(name, "name");
        validateInputParam(eyesColor, "eyesColor");
        validateInputParam(furColor, "furColor");
        validateInputParam(breed, "breed");
        validateInputParam(ownerName, "ownerName");
        return catDao.createCat(name, age, eyesColor, furColor, breed, ownerName);
    }

    @WebMethod(operationName = "deleteCat")
    @Override
    public boolean deleteCat(@WebParam(name = "uid") @XmlElement(required=true) int uid)
            throws PostgreSqlException {
        return catDao.deleteCat(uid);
    }

    @WebMethod(operationName = "updateCatName")
    @Override
    public boolean updateCatName(@WebParam(name = "uid") @XmlElement(required=true) int uid,
                             @WebParam(name = "name") String name)
            throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(name, "name");
        return catDao.updateCatName(uid, name);
    }

    @WebMethod(operationName = "updateCatDescription")
    @Override
    public boolean updateCatDescription(@WebParam(name = "uid") @XmlElement(required=true) int uid,
                                    @WebParam(name = "eyesColor") String eyesColor,
                                    @WebParam(name = "furColor") String furColor)
            throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(eyesColor, "eyesColor");
        validateInputParam(furColor, "furColor");
        return catDao.updateCatDescription(uid, eyesColor, furColor);
    }

    @WebMethod(operationName = "updateCatBreed")
    @Override
    public boolean updateCatBreed(@WebParam(name = "uid") @XmlElement(required=true) int uid,
                              @WebParam(name = "breed") String breed)
            throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(breed, "breed");
        return catDao.updateCatBreed(uid, breed);
    }

    @WebMethod(operationName = "updateCatOwner")
    @Override
    public boolean updateCatOwner(@WebParam(name = "uid") @XmlElement(required=true) int uid,
                              @WebParam(name = "owner") String owner)
            throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(owner, "owner");
        return catDao.updateCatOwner(uid, owner);
    }

    @WebMethod(operationName = "updateCat")
    @Override
    public boolean updateCat(@WebParam(name = "uid") @XmlElement(required=true) int uid,
                         @WebParam(name = "name") String name,
                         @WebParam(name = "age") @XmlElement(required=true) int age,
                         @WebParam(name = "eyesColor") String eyesColor,
                         @WebParam(name = "furColor") String furColor,
                         @WebParam(name = "breed") String breed,
                         @WebParam(name = "ownerName") String ownerName)
            throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(name, "name");
        validateInputParam(eyesColor, "eyesColor");
        validateInputParam(furColor, "furColor");
        validateInputParam(breed, "breed");
        validateInputParam(ownerName, "ownerName");
        return catDao.updateCat(uid, name, age, eyesColor, furColor, breed, ownerName);
    }

    private void validateInputParam(String value, String name) throws IllegalRequestParameterException {
        if (value == null || value.trim().isEmpty()) {
            CatServiceFault fault = CatServiceFault.defaultInstance();
            throw new IllegalRequestParameterException("Cat." + name + " is not present", fault);
        }
    }
}
