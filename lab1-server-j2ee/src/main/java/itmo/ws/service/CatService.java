package itmo.ws.service;

import itmo.ws.dao.CatDao;
import itmo.ws.model.Cat;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@WebService(serviceName = "CatService")
public class CatService {
    private final CatDao catDao = new CatDao();

    @WebMethod(operationName = "getCats")
    public List<Cat> getCats() {
        return catDao.getCats();
    }

    @WebMethod(operationName = "getCatsByName")
    public List<Cat> getCatsByName(@WebParam(name = "name") @XmlElement(required=true) String name) {
        return catDao.getCatsByName(name);
    }

    @WebMethod(operationName = "getCatByUid")
    public Cat getCatByUid(@WebParam(name = "uid") @XmlElement(required=true) int uid) {
        return catDao.getCatByUid(uid);
    }

    @WebMethod(operationName = "getCatsByDescription")
    public List<Cat> getCatsByDescription(@WebParam(name = "eyesColor") @XmlElement(required=true) String eyesColor,
                                          @WebParam(name = "furColor") @XmlElement(required=true) String furColor) {
        return catDao.getCatsByDescription(eyesColor, furColor);
    }

    @WebMethod(operationName = "getCatsByBreed")
    public List<Cat> getCatsByBreed(@WebParam(name = "breed") @XmlElement(required=true) String breed) {
        return catDao.getCatsByBreed(breed);
    }

    @WebMethod(operationName = "getCatsByOwner")
    public List<Cat> getCatsByOwner(@WebParam(name = "owner") @XmlElement(required=true) String owner) {
        return catDao.getCatsByOwner(owner);
    }

    @WebMethod(operationName = "getCatsByOwnerAndName")
    public List<Cat> getCatsByOwnerAndName(@WebParam(name = "name") @XmlElement(required=true) String name,
                                           @WebParam(name = "owner") @XmlElement(required=true) String owner) {
        return catDao.getCatsByOwnerAndName(name, owner);
    }

    @WebMethod(operationName = "getCatsByNameAndAge")
    public List<Cat> getCatsByNameAndAge(@WebParam(name = "name") @XmlElement(required=true) String name,
                                         @WebParam(name = "age") @XmlElement(required=true) int age) {
        return catDao.getCatsByNameAndAge(name, age);
    }

    @WebMethod(operationName = "getCatsByBreedAndOwner")
    public List<Cat> getCatsByBreedAndOwner(@WebParam(name = "breed") @XmlElement(required=true) String breed,
                                            @WebParam(name = "owner") @XmlElement(required=true) String owner) {
        return catDao.getCatsByBreedAndOwner(breed, owner);
    }

    @WebMethod(operationName = "getCatsByFullDescription")
    public List<Cat> getCatsByFullDescription(@WebParam(name = "eyesColor") @XmlElement(required=true) String eyesColor,
                                              @WebParam(name = "furColor") @XmlElement(required=true) String furColor,
                                              @WebParam(name = "breed") @XmlElement(required=true) String breed) {
        return catDao.getCatsByFullDescription(eyesColor, furColor, breed);
    }
}
