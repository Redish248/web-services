package itmo.rs.impl;

import itmo.rs.config.ConnectionUtil;
import itmo.rs.dao.CatDao;
import itmo.rs.model.Cat;
import itmo.rs.service.CatService;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.sql.DataSource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RequestScoped
@Path("/cats")
@Produces({MediaType.APPLICATION_JSON})
public class CatResource implements CatService {
    @Resource(lookup = "jdbc/web_services")
    private DataSource dataSource;

    @GET
    @Path("/getCats")
    @Override
    public List<Cat> getCats() {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCats();
    }

    @GET
    @Path("/getCatsByName")
    @Override
    public List<Cat> getCatsByName(@QueryParam("name") String name) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByName(name);
    }

    @GET
    @Path("/getCatByUid")
    @Override
    public Cat getCatByUid(@QueryParam("uid") int uid) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatByUid(uid);
    }

    @GET
    @Path("/getCatsByDescription")
    @Override
    public List<Cat> getCatsByDescription(@QueryParam("eyesColor") String eyesColor,
                                          @QueryParam("furColor") String furColor) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByDescription(eyesColor, furColor);
    }

    @GET
    @Path("/getCatsByBreed")
    @Override
    public List<Cat> getCatsByBreed(@QueryParam("breed") String breed) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByBreed(breed);
    }

    @GET
    @Path("/getCatsByOwner")
    @Override
    public List<Cat> getCatsByOwner(@QueryParam("owner") String owner) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByOwner(owner);
    }

    @GET
    @Path("/getCatsByOwnerAndName")
    @Override
    public List<Cat> getCatsByOwnerAndName(@QueryParam("name") String name,
                                           @QueryParam("owner") String owner) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByOwnerAndName(name, owner);
    }

    @GET
    @Path("/getCatsByNameAndAge")
    @Override
    public List<Cat> getCatsByNameAndAge(@QueryParam("name") String name,
                                         @QueryParam("age") int age) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByNameAndAge(name, age);
    }

    @GET
    @Path("/getCatsByBreedAndOwner")
    @Override
    public List<Cat> getCatsByBreedAndOwner(@QueryParam("breed") String breed,
                                            @QueryParam("owner") String owner) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByBreedAndOwner(breed, owner);
    }

    @GET
    @Path("/getCatsByFullDescription")
    @Override
    public List<Cat> getCatsByFullDescription(@QueryParam("eyesColor") String eyesColor,
                                              @QueryParam("furColor") String furColor,
                                              @QueryParam("breed") String breed) {
        CatDao catDao = new CatDao(ConnectionUtil.getConnection(dataSource));
        return catDao.getCatsByFullDescription(eyesColor, furColor, breed);
    }
}
