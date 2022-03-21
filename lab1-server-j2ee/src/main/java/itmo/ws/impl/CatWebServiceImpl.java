package itmo.ws.impl;

import itmo.ws.config.ConnectionUtil;
import itmo.ws.dao.CatDao;
import itmo.ws.model.Cat;
import itmo.ws.service.CatService;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.sql.DataSource;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@WebService(serviceName = "CatService")
public class CatWebServiceImpl implements CatService {
    @Resource(lookup = "jdbc/web_services")
    private DataSource dataSource;

    @WebMethod(operationName = "getCats")
    public List<Cat> getCats() {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCats();
    }

    @WebMethod(operationName = "getCatsByName")
    public List<Cat> getCatsByName(@WebParam(name = "name") @XmlElement(required=true) String name) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByName(name);
    }

    @WebMethod(operationName = "getCatByUid")
    public Cat getCatByUid(@WebParam(name = "uid") @XmlElement(required=true) int uid) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatByUid(uid);
    }

    @WebMethod(operationName = "getCatsByDescription")
    public List<Cat> getCatsByDescription(@WebParam(name = "eyesColor") @XmlElement(required=true) String eyesColor,
                                          @WebParam(name = "furColor") @XmlElement(required=true) String furColor) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByDescription(eyesColor, furColor);
    }

    @WebMethod(operationName = "getCatsByBreed")
    public List<Cat> getCatsByBreed(@WebParam(name = "breed") @XmlElement(required=true) String breed) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByBreed(breed);
    }

    @WebMethod(operationName = "getCatsByOwner")
    public List<Cat> getCatsByOwner(@WebParam(name = "owner") @XmlElement(required=true) String owner) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByOwner(owner);
    }

    @WebMethod(operationName = "getCatsByOwnerAndName")
    public List<Cat> getCatsByOwnerAndName(@WebParam(name = "name") @XmlElement(required=true) String name,
                                           @WebParam(name = "owner") @XmlElement(required=true) String owner) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByOwnerAndName(name, owner);
    }

    @WebMethod(operationName = "getCatsByNameAndAge")
    public List<Cat> getCatsByNameAndAge(@WebParam(name = "name") @XmlElement(required=true) String name,
                                         @WebParam(name = "age") @XmlElement(required=true) int age) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByNameAndAge(name, age);
    }

    @WebMethod(operationName = "getCatsByBreedAndOwner")
    public List<Cat> getCatsByBreedAndOwner(@WebParam(name = "breed") @XmlElement(required=true) String breed,
                                            @WebParam(name = "owner") @XmlElement(required=true) String owner) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByBreedAndOwner(breed, owner);
    }

    @WebMethod(operationName = "getCatsByFullDescription")
    public List<Cat> getCatsByFullDescription(@WebParam(name = "eyesColor") @XmlElement(required=true) String eyesColor,
                                              @WebParam(name = "furColor") @XmlElement(required=true) String furColor,
                                              @WebParam(name = "breed") @XmlElement(required=true) String breed) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByFullDescription(eyesColor, furColor, breed);
    }
}
