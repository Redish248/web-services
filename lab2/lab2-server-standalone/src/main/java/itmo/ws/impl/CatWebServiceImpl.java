package itmo.ws.impl;

import itmo.ws.dao.CatDao;
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
    public List<Cat> getCats() {
        return catDao.getCats();
    }

    @WebMethod(operationName = "getCatsByName")
    @Override
    public List<Cat> getCatsByName(@WebParam(name = "name") @XmlElement(required=true) String name) {
        return catDao.getCatsByName(name);
    }

    @WebMethod(operationName = "getCatByUid")
    @Override
    public Cat getCatByUid(@WebParam(name = "uid") @XmlElement(required=true) int uid) {
        return catDao.getCatByUid(uid);
    }

    @WebMethod(operationName = "getCatsByDescription")
    @Override
    public List<Cat> getCatsByDescription(@WebParam(name = "eyesColor") @XmlElement(required=true) String eyesColor,
                                          @WebParam(name = "furColor") @XmlElement(required=true) String furColor) {
        return catDao.getCatsByDescription(eyesColor, furColor);
    }

    @WebMethod(operationName = "getCatsByBreed")
    @Override
    public List<Cat> getCatsByBreed(@WebParam(name = "breed") @XmlElement(required=true) String breed) {
        return catDao.getCatsByBreed(breed);
    }

    @WebMethod(operationName = "getCatsByOwner")
    @Override
    public List<Cat> getCatsByOwner(@WebParam(name = "owner") @XmlElement(required=true) String owner) {
        return catDao.getCatsByOwner(owner);
    }

    @WebMethod(operationName = "getCatsByOwnerAndName")
    @Override
    public List<Cat> getCatsByOwnerAndName(@WebParam(name = "name") @XmlElement(required=true) String name,
                                           @WebParam(name = "owner") @XmlElement(required=true) String owner) {
        return catDao.getCatsByOwnerAndName(name, owner);
    }

    @WebMethod(operationName = "getCatsByNameAndAge")
    @Override
    public List<Cat> getCatsByNameAndAge(@WebParam(name = "name") @XmlElement(required=true) String name,
                                           @WebParam(name = "age") @XmlElement(required=true) int age) {
        return catDao.getCatsByNameAndAge(name, age);
    }

    @WebMethod(operationName = "getCatsByBreedAndOwner")
    @Override
    public List<Cat> getCatsByBreedAndOwner(@WebParam(name = "breed") @XmlElement(required=true) String breed,
                                            @WebParam(name = "owner") @XmlElement(required=true) String owner) {
        return catDao.getCatsByBreedAndOwner(breed, owner);
    }

    @WebMethod(operationName = "getCatsByFullDescription")
    @Override
    public List<Cat> getCatsByFullDescription(@WebParam(name = "eyesColor") @XmlElement(required=true) String eyesColor,
                                              @WebParam(name = "furColor") @XmlElement(required=true) String furColor,
                                              @WebParam(name = "breed") @XmlElement(required=true) String breed) {
        return catDao.getCatsByFullDescription(eyesColor, furColor, breed);
    }

    @WebMethod(operationName = "createCat")
    @Override
    public int createCat(@WebParam(name = "name") @XmlElement(required=true) String name,
                         @WebParam(name = "age") @XmlElement(required=true) int age,
                         @WebParam(name = "eyesColor") @XmlElement(required=true) String eyesColor,
                         @WebParam(name = "furColor") @XmlElement(required=true) String furColor,
                         @WebParam(name = "breed") @XmlElement(required=true) String breed,
                         @WebParam(name = "ownerName") @XmlElement(required=true) String ownerName) {
        return catDao.createCat(name, age, eyesColor, furColor, breed, ownerName);
    }

    @WebMethod(operationName = "deleteCat")
    @Override
    public boolean deleteCat(@WebParam(name = "uid") @XmlElement(required=true) int uid) {
        return catDao.deleteCat(uid);
    }

    @WebMethod(operationName = "updateCatName")
    @Override
    public boolean updateCatName(@WebParam(name = "uid") @XmlElement(required=true) int uid,
                             @WebParam(name = "name") @XmlElement(required=true) String name) {
        return catDao.updateCatName(uid, name);
    }

    @WebMethod(operationName = "updateCatDescription")
    @Override
    public boolean updateCatDescription(@WebParam(name = "uid") @XmlElement(required=true) int uid,
                                    @WebParam(name = "eyesColor") @XmlElement(required=true) String eyesColor,
                                    @WebParam(name = "furColor") @XmlElement(required=true) String furColor) {
        return catDao.updateCatDescription(uid, eyesColor, furColor);
    }

    @WebMethod(operationName = "updateCatBreed")
    @Override
    public boolean updateCatBreed(@WebParam(name = "uid") @XmlElement(required=true) int uid,
                              @WebParam(name = "breed") @XmlElement(required=true) String breed) {
        return catDao.updateCatBreed(uid, breed);
    }

    @WebMethod(operationName = "updateCatOwner")
    @Override
    public boolean updateCatOwner(@WebParam(name = "uid") @XmlElement(required=true) int uid,
                              @WebParam(name = "owner") @XmlElement(required=true) String owner) {
        return catDao.updateCatOwner(uid, owner);
    }

    @WebMethod(operationName = "updateCat")
    @Override
    public boolean updateCat(@WebParam(name = "uid") @XmlElement(required=true) int uid,
                         @WebParam(name = "name") @XmlElement(required=true) String name,
                         @WebParam(name = "age") @XmlElement(required=true) int age,
                         @WebParam(name = "eyesColor") @XmlElement(required=true) String eyesColor,
                         @WebParam(name = "furColor") @XmlElement(required=true) String furColor,
                         @WebParam(name = "breed") @XmlElement(required=true) String breed,
                         @WebParam(name = "ownerName") @XmlElement(required=true) String ownerName) {
        return catDao.updateCat(uid, name, age, eyesColor, furColor, breed, ownerName);
    }
}
