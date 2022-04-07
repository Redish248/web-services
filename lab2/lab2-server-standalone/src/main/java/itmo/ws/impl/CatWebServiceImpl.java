package itmo.ws.impl;

import itmo.ws.dao.CatDao;
import itmo.ws.exception.AuthException;
import itmo.ws.model.Cat;
import itmo.ws.service.CatService;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

@WebService(serviceName = "CatService")
public class CatWebServiceImpl implements CatService {

    @Resource
    WebServiceContext webServiceContext;

    private final CatDao catDao = new CatDao();

    @WebMethod(operationName = "getCats")
    @Override
    public List<Cat> getCats() {
        return catDao.getCats();
    }

    @WebMethod(operationName = "getCatsByName")
    @Override
    public List<Cat> getCatsByName(@WebParam(name = "name") @XmlElement(required = true) String name) {
        return catDao.getCatsByName(name);
    }

    @WebMethod(operationName = "getCatByUid")
    @Override
    public Cat getCatByUid(@WebParam(name = "uid") @XmlElement(required = true) int uid) {
        return catDao.getCatByUid(uid);
    }

    @WebMethod(operationName = "getCatsByDescription")
    @Override
    public List<Cat> getCatsByDescription(@WebParam(name = "eyesColor") @XmlElement(required = true) String eyesColor,
                                          @WebParam(name = "furColor") @XmlElement(required = true) String furColor) {
        return catDao.getCatsByDescription(eyesColor, furColor);
    }

    @WebMethod(operationName = "getCatsByBreed")
    @Override
    public List<Cat> getCatsByBreed(@WebParam(name = "breed") @XmlElement(required = true) String breed) {
        return catDao.getCatsByBreed(breed);
    }

    @WebMethod(operationName = "getCatsByOwner")
    @Override
    public List<Cat> getCatsByOwner(@WebParam(name = "owner") @XmlElement(required = true) String owner) {
        return catDao.getCatsByOwner(owner);
    }

    @WebMethod(operationName = "getCatsByOwnerAndName")
    @Override
    public List<Cat> getCatsByOwnerAndName(@WebParam(name = "name") @XmlElement(required = true) String name,
                                           @WebParam(name = "owner") @XmlElement(required = true) String owner) {
        return catDao.getCatsByOwnerAndName(name, owner);
    }

    @WebMethod(operationName = "getCatsByNameAndAge")
    @Override
    public List<Cat> getCatsByNameAndAge(@WebParam(name = "name") @XmlElement(required = true) String name,
                                         @WebParam(name = "age") @XmlElement(required = true) int age) {
        return catDao.getCatsByNameAndAge(name, age);
    }

    @WebMethod(operationName = "getCatsByBreedAndOwner")
    @Override
    public List<Cat> getCatsByBreedAndOwner(@WebParam(name = "breed") @XmlElement(required = true) String breed,
                                            @WebParam(name = "owner") @XmlElement(required = true) String owner) {
        return catDao.getCatsByBreedAndOwner(breed, owner);
    }

    @WebMethod(operationName = "getCatsByFullDescription")
    @Override
    public List<Cat> getCatsByFullDescription(@WebParam(name = "eyesColor") @XmlElement(required = true) String eyesColor,
                                              @WebParam(name = "furColor") @XmlElement(required = true) String furColor,
                                              @WebParam(name = "breed") @XmlElement(required = true) String breed) {
        return catDao.getCatsByFullDescription(eyesColor, furColor, breed);
    }

    @WebMethod(operationName = "createCat")
    @Override
    public int createCat(@WebParam(name = "name") @XmlElement(required = true) String name,
                         @WebParam(name = "age") @XmlElement(required = true) int age,
                         @WebParam(name = "eyesColor") @XmlElement(required = true) String eyesColor,
                         @WebParam(name = "furColor") @XmlElement(required = true) String furColor,
                         @WebParam(name = "breed") @XmlElement(required = true) String breed,
                         @WebParam(name = "ownerName") @XmlElement(required = true) String ownerName) throws AuthException {
        checkUser();
        return catDao.createCat(name, age, eyesColor, furColor, breed, ownerName);
    }

    @WebMethod(operationName = "deleteCat")
    @Override
    public boolean deleteCat(@WebParam(name = "uid") @XmlElement(required = true) int uid) throws AuthException {
        checkUser();
        return catDao.deleteCat(uid);
    }

    @WebMethod(operationName = "updateCatName")
    @Override
    public boolean updateCatName(@WebParam(name = "uid") @XmlElement(required = true) int uid,
                                 @WebParam(name = "name") @XmlElement(required = true) String name) throws AuthException {
        checkUser();
        return catDao.updateCatName(uid, name);
    }

    @WebMethod(operationName = "updateCatDescription")
    @Override
    public boolean updateCatDescription(@WebParam(name = "uid") @XmlElement(required = true) int uid,
                                        @WebParam(name = "eyesColor") @XmlElement(required = true) String eyesColor,
                                        @WebParam(name = "furColor") @XmlElement(required = true) String furColor) throws AuthException {
        checkUser();
        return catDao.updateCatDescription(uid, eyesColor, furColor);
    }

    @WebMethod(operationName = "updateCatBreed")
    @Override
    public boolean updateCatBreed(@WebParam(name = "uid") @XmlElement(required = true) int uid,
                                  @WebParam(name = "breed") @XmlElement(required = true) String breed) throws AuthException {
        checkUser();
        return catDao.updateCatBreed(uid, breed);
    }

    @WebMethod(operationName = "updateCatOwner")
    @Override
    public boolean updateCatOwner(@WebParam(name = "uid") @XmlElement(required = true) int uid,
                                  @WebParam(name = "owner") @XmlElement(required = true) String owner) throws AuthException {
        checkUser();
        return catDao.updateCatOwner(uid, owner);
    }

    @WebMethod(operationName = "updateCat")
    @Override
    public boolean updateCat(@WebParam(name = "uid") @XmlElement(required = true) int uid,
                             @WebParam(name = "name") @XmlElement(required = true) String name,
                             @WebParam(name = "age") @XmlElement(required = true) int age,
                             @WebParam(name = "eyesColor") @XmlElement(required = true) String eyesColor,
                             @WebParam(name = "furColor") @XmlElement(required = true) String furColor,
                             @WebParam(name = "breed") @XmlElement(required = true) String breed,
                             @WebParam(name = "ownerName") @XmlElement(required = true) String ownerName) throws AuthException {
        checkUser();
        return catDao.updateCat(uid, name, age, eyesColor, furColor, breed, ownerName);
    }

    private void checkCredentials(String login, String pass) throws AuthException {
        if (!login.equals("redish") || !pass.equals("redish")) {
            CatServiceFault fault = CatServiceFault.defaultInstance();
            throw new AuthException("Unknown user", fault);
        }
    }

    @SuppressWarnings("rawtypes")
    private void checkUser() throws AuthException {
        MessageContext messageContext = webServiceContext.getMessageContext();
        Map http_headers = (Map) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
        List userList = (List) http_headers.get("Username");
        List passList = (List) http_headers.get("Password");

        String username = "";
        String password = "";

        if (userList != null) {
            username = userList.get(0).toString();
        }
        if (passList != null) {
            password = passList.get(0).toString();
        }

        checkCredentials(username, password);
    }
}
