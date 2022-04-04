package itmo.rs.impl;

import itmo.rs.dao.CatDao;
import itmo.rs.exception.IllegalRequestParameterException;
import itmo.rs.exception.PostgreSqlException;
import itmo.rs.model.Cat;
import itmo.rs.service.CatService;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/cats")
@Produces({MediaType.APPLICATION_JSON})
public class CatResource implements CatService {
    private final CatDao catDao = new CatDao();

    @GET
    @Path("/getCats")
    @Override
    public List<Cat> getCats() throws PostgreSqlException {
        return catDao.getCats();
    }

    @GET
    @Path("/getCatsByName")
    @Override
    public List<Cat> getCatsByName(@QueryParam("name") String name) throws PostgreSqlException, IllegalRequestParameterException {
        if (name == null || name.trim().isEmpty()) {
            throw IllegalRequestParameterException.DEFAULT_INSTANCE;
        }
        return catDao.getCatsByName(name);
    }

    @GET
    @Path("/getCatByUid")
    @Override
    public Cat getCatByUid(@QueryParam("uid") int uid) throws PostgreSqlException {
        return catDao.getCatByUid(uid);
    }

    @GET
    @Path("/getCatsByDescription")
    @Override
    public List<Cat> getCatsByDescription(@QueryParam("eyesColor") String eyesColor,
                                          @QueryParam("furColor") String furColor) throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(eyesColor, "eyesColor");
        validateInputParam(furColor, "furColor");
        return catDao.getCatsByDescription(eyesColor, furColor);
    }

    @GET
    @Path("/getCatsByBreed")
    @Override
    public List<Cat> getCatsByBreed(@QueryParam("breed") String breed) throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(breed, "breed");
        return catDao.getCatsByBreed(breed);
    }

    @GET
    @Path("/getCatsByOwner")
    @Override
    public List<Cat> getCatsByOwner(@QueryParam("owner") String owner) throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(owner, "owner");
        return catDao.getCatsByOwner(owner);
    }

    @GET
    @Path("/getCatsByOwnerAndName")
    @Override
    public List<Cat> getCatsByOwnerAndName(@QueryParam("name") String name,
                                           @QueryParam("owner") String owner) throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(name, "name");
        validateInputParam(owner, "owner");
        return catDao.getCatsByOwnerAndName(name, owner);
    }

    @GET
    @Path("/getCatsByNameAndAge")
    @Override
    public List<Cat> getCatsByNameAndAge(@QueryParam("name") String name,
                                         @QueryParam("age") int age) throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(name, "name");
        return catDao.getCatsByNameAndAge(name, age);
    }

    @GET
    @Path("/getCatsByBreedAndOwner")
    @Override
    public List<Cat> getCatsByBreedAndOwner(@QueryParam("breed") String breed,
                                            @QueryParam("owner") String owner) throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(breed, "breed");
        validateInputParam(owner, "owner");
        return catDao.getCatsByBreedAndOwner(breed, owner);
    }

    @GET
    @Path("/getCatsByFullDescription")
    @Override
    public List<Cat> getCatsByFullDescription(@QueryParam("eyesColor") String eyesColor,
                                              @QueryParam("furColor") String furColor,
                                              @QueryParam("breed") String breed) throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(eyesColor, "eyesColor");
        validateInputParam(furColor, "furColor");
        validateInputParam(breed, "breed");
        return catDao.getCatsByFullDescription(eyesColor, furColor, breed);
    }

    @PUT
    @Path("/createCat")
    @Override
    public int createCat(@QueryParam("name") String name,
                         @QueryParam("age") int age,
                         @QueryParam("eyesColor") String eyesColor,
                         @QueryParam("furColor") String furColor,
                         @QueryParam("breed") String breed,
                         @QueryParam("owner") String ownerName) throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(name, "name");
        validateInputParam(eyesColor, "eyesColor");
        validateInputParam(furColor, "furColor");
        validateInputParam(breed, "breed");
        validateInputParam(ownerName, "ownerName");
        return catDao.createCat(name, age, eyesColor, furColor, breed, ownerName);
    }

    @DELETE
    @Path("/deleteCat")
    @Override
    public boolean deleteCat(@QueryParam("uid") int uid) throws PostgreSqlException {
        return catDao.deleteCat(uid);
    }

    @POST
    @Path("/updateCatName")
    @Override
    public boolean updateCatName(@QueryParam("uid") int uid,
                                 @QueryParam("name") String name) throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(name, "name");
        return catDao.updateCatName(uid, name);
    }

    @POST
    @Path("/updateCatDescription")
    @Override
    public boolean updateCatDescription(@QueryParam("uid") int uid,
                                        @QueryParam("eyesColor") String eyesColor,
                                        @QueryParam("furColor") String furColor) throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(eyesColor, "eyesColor");
        validateInputParam(furColor, "furColor");
        return catDao.updateCatDescription(uid, eyesColor, furColor);
    }

    @POST
    @Path("/updateCatBreed")
    @Override
    public boolean updateCatBreed(@QueryParam("uid") int uid,
                                  @QueryParam("breed") String breed) throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(breed, "breed");
        return catDao.updateCatBreed(uid, breed);
    }

    @POST
    @Path("/updateCatOwner")
    @Override
    public boolean updateCatOwner(@QueryParam("uid") int uid,
                                  @QueryParam("owner") String owner) throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(owner, "owner");
        return catDao.updateCatOwner(uid, owner);
    }

    @POST
    @Path("/updateCat")
    @Override
    public boolean updateCat(@QueryParam("uid") int uid,
                             @QueryParam("name") String name,
                             @QueryParam("age") int age,
                             @QueryParam("eyesColor") String eyesColor,
                             @QueryParam("furColor") String furColor,
                             @QueryParam("breed") String breed,
                             @QueryParam("owner") String ownerName) throws PostgreSqlException, IllegalRequestParameterException {
        validateInputParam(name, "name");
        validateInputParam(eyesColor, "eyesColor");
        validateInputParam(furColor, "furColor");
        validateInputParam(breed, "breed");
        validateInputParam(ownerName, "ownerName");
        return catDao.updateCat(uid, name, age, eyesColor, furColor, breed, ownerName);
    }

    private void validateInputParam(String value, String name) throws IllegalRequestParameterException {
        if (value == null || value.trim().isEmpty()) {
            throw IllegalRequestParameterException.DEFAULT_INSTANCE;
        }
    }
}
