
package itmo.ws.impl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CatWebServiceImpl", targetNamespace = "http://impl.ws.itmo/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CatWebServiceImpl {


    /**
     * 
     * @return
     *     returns java.util.List<itmo.ws.impl.Cat>
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCats", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCats")
    @ResponseWrapper(localName = "getCatsResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/getCatsRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/getCatsResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCats/Fault/PostgreSqlException")
    })
    public List<Cat> getCats()
        throws PostgreSqlException
    ;

    /**
     * 
     * @param name
     * @return
     *     returns java.util.List<itmo.ws.impl.Cat>
     * @throws IllegalRequestParameterException
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCatsByName", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByName")
    @ResponseWrapper(localName = "getCatsByNameResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByNameResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByNameRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByNameResponse", fault = {
        @FaultAction(className = IllegalRequestParameterException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByName/Fault/IllegalRequestParameterException"),
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByName/Fault/PostgreSqlException")
    })
    public List<Cat> getCatsByName(
        @WebParam(name = "name", targetNamespace = "")
        String name)
        throws IllegalRequestParameterException, PostgreSqlException
    ;

    /**
     * 
     * @param uid
     * @return
     *     returns itmo.ws.impl.Cat
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCatByUid", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatByUid")
    @ResponseWrapper(localName = "getCatByUidResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatByUidResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/getCatByUidRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/getCatByUidResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatByUid/Fault/PostgreSqlException")
    })
    public Cat getCatByUid(
        @WebParam(name = "uid", targetNamespace = "")
        int uid)
        throws PostgreSqlException
    ;

    /**
     * 
     * @param eyesColor
     * @param furColor
     * @return
     *     returns java.util.List<itmo.ws.impl.Cat>
     * @throws IllegalRequestParameterException
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCatsByDescription", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByDescription")
    @ResponseWrapper(localName = "getCatsByDescriptionResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByDescriptionResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByDescriptionRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByDescriptionResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByDescription/Fault/PostgreSqlException"),
        @FaultAction(className = IllegalRequestParameterException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByDescription/Fault/IllegalRequestParameterException")
    })
    public List<Cat> getCatsByDescription(
        @WebParam(name = "eyesColor", targetNamespace = "")
        String eyesColor,
        @WebParam(name = "furColor", targetNamespace = "")
        String furColor)
        throws IllegalRequestParameterException, PostgreSqlException
    ;

    /**
     * 
     * @param breed
     * @return
     *     returns java.util.List<itmo.ws.impl.Cat>
     * @throws IllegalRequestParameterException
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCatsByBreed", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByBreed")
    @ResponseWrapper(localName = "getCatsByBreedResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByBreedResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByBreedRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByBreedResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByBreed/Fault/PostgreSqlException"),
        @FaultAction(className = IllegalRequestParameterException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByBreed/Fault/IllegalRequestParameterException")
    })
    public List<Cat> getCatsByBreed(
        @WebParam(name = "breed", targetNamespace = "")
        String breed)
        throws IllegalRequestParameterException, PostgreSqlException
    ;

    /**
     * 
     * @param owner
     * @return
     *     returns java.util.List<itmo.ws.impl.Cat>
     * @throws IllegalRequestParameterException
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCatsByOwner", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByOwner")
    @ResponseWrapper(localName = "getCatsByOwnerResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByOwnerResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByOwnerRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByOwnerResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByOwner/Fault/PostgreSqlException"),
        @FaultAction(className = IllegalRequestParameterException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByOwner/Fault/IllegalRequestParameterException")
    })
    public List<Cat> getCatsByOwner(
        @WebParam(name = "owner", targetNamespace = "")
        String owner)
        throws IllegalRequestParameterException, PostgreSqlException
    ;

    /**
     * 
     * @param owner
     * @param name
     * @return
     *     returns java.util.List<itmo.ws.impl.Cat>
     * @throws IllegalRequestParameterException
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCatsByOwnerAndName", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByOwnerAndName")
    @ResponseWrapper(localName = "getCatsByOwnerAndNameResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByOwnerAndNameResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByOwnerAndNameRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByOwnerAndNameResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByOwnerAndName/Fault/PostgreSqlException"),
        @FaultAction(className = IllegalRequestParameterException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByOwnerAndName/Fault/IllegalRequestParameterException")
    })
    public List<Cat> getCatsByOwnerAndName(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "owner", targetNamespace = "")
        String owner)
        throws IllegalRequestParameterException, PostgreSqlException
    ;

    /**
     * 
     * @param name
     * @param age
     * @return
     *     returns java.util.List<itmo.ws.impl.Cat>
     * @throws IllegalRequestParameterException
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCatsByNameAndAge", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByNameAndAge")
    @ResponseWrapper(localName = "getCatsByNameAndAgeResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByNameAndAgeResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByNameAndAgeRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByNameAndAgeResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByNameAndAge/Fault/PostgreSqlException"),
        @FaultAction(className = IllegalRequestParameterException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByNameAndAge/Fault/IllegalRequestParameterException")
    })
    public List<Cat> getCatsByNameAndAge(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "age", targetNamespace = "")
        int age)
        throws IllegalRequestParameterException, PostgreSqlException
    ;

    /**
     * 
     * @param owner
     * @param breed
     * @return
     *     returns java.util.List<itmo.ws.impl.Cat>
     * @throws IllegalRequestParameterException
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCatsByBreedAndOwner", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByBreedAndOwner")
    @ResponseWrapper(localName = "getCatsByBreedAndOwnerResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByBreedAndOwnerResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByBreedAndOwnerRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByBreedAndOwnerResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByBreedAndOwner/Fault/PostgreSqlException"),
        @FaultAction(className = IllegalRequestParameterException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByBreedAndOwner/Fault/IllegalRequestParameterException")
    })
    public List<Cat> getCatsByBreedAndOwner(
        @WebParam(name = "breed", targetNamespace = "")
        String breed,
        @WebParam(name = "owner", targetNamespace = "")
        String owner)
        throws IllegalRequestParameterException, PostgreSqlException
    ;

    /**
     * 
     * @param eyesColor
     * @param furColor
     * @param breed
     * @return
     *     returns java.util.List<itmo.ws.impl.Cat>
     * @throws IllegalRequestParameterException
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCatsByFullDescription", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByFullDescription")
    @ResponseWrapper(localName = "getCatsByFullDescriptionResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.GetCatsByFullDescriptionResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByFullDescriptionRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByFullDescriptionResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByFullDescription/Fault/PostgreSqlException"),
        @FaultAction(className = IllegalRequestParameterException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/getCatsByFullDescription/Fault/IllegalRequestParameterException")
    })
    public List<Cat> getCatsByFullDescription(
        @WebParam(name = "eyesColor", targetNamespace = "")
        String eyesColor,
        @WebParam(name = "furColor", targetNamespace = "")
        String furColor,
        @WebParam(name = "breed", targetNamespace = "")
        String breed)
        throws IllegalRequestParameterException, PostgreSqlException
    ;

    /**
     * 
     * @param ownerName
     * @param eyesColor
     * @param name
     * @param furColor
     * @param age
     * @param breed
     * @return
     *     returns int
     * @throws IllegalRequestParameterException
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createCat", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.CreateCat")
    @ResponseWrapper(localName = "createCatResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.CreateCatResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/createCatRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/createCatResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/createCat/Fault/PostgreSqlException"),
        @FaultAction(className = IllegalRequestParameterException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/createCat/Fault/IllegalRequestParameterException")
    })
    public int createCat(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "age", targetNamespace = "")
        int age,
        @WebParam(name = "eyesColor", targetNamespace = "")
        String eyesColor,
        @WebParam(name = "furColor", targetNamespace = "")
        String furColor,
        @WebParam(name = "breed", targetNamespace = "")
        String breed,
        @WebParam(name = "ownerName", targetNamespace = "")
        String ownerName)
        throws IllegalRequestParameterException, PostgreSqlException
    ;

    /**
     * 
     * @param uid
     * @return
     *     returns boolean
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteCat", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.DeleteCat")
    @ResponseWrapper(localName = "deleteCatResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.DeleteCatResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/deleteCatRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/deleteCatResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/deleteCat/Fault/PostgreSqlException")
    })
    public boolean deleteCat(
        @WebParam(name = "uid", targetNamespace = "")
        int uid)
        throws PostgreSqlException
    ;

    /**
     * 
     * @param uid
     * @param name
     * @return
     *     returns boolean
     * @throws IllegalRequestParameterException
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateCatName", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.UpdateCatName")
    @ResponseWrapper(localName = "updateCatNameResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.UpdateCatNameResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/updateCatNameRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/updateCatNameResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/updateCatName/Fault/PostgreSqlException"),
        @FaultAction(className = IllegalRequestParameterException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/updateCatName/Fault/IllegalRequestParameterException")
    })
    public boolean updateCatName(
        @WebParam(name = "uid", targetNamespace = "")
        int uid,
        @WebParam(name = "name", targetNamespace = "")
        String name)
        throws IllegalRequestParameterException, PostgreSqlException
    ;

    /**
     * 
     * @param uid
     * @param eyesColor
     * @param furColor
     * @return
     *     returns boolean
     * @throws IllegalRequestParameterException
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateCatDescription", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.UpdateCatDescription")
    @ResponseWrapper(localName = "updateCatDescriptionResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.UpdateCatDescriptionResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/updateCatDescriptionRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/updateCatDescriptionResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/updateCatDescription/Fault/PostgreSqlException"),
        @FaultAction(className = IllegalRequestParameterException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/updateCatDescription/Fault/IllegalRequestParameterException")
    })
    public boolean updateCatDescription(
        @WebParam(name = "uid", targetNamespace = "")
        int uid,
        @WebParam(name = "eyesColor", targetNamespace = "")
        String eyesColor,
        @WebParam(name = "furColor", targetNamespace = "")
        String furColor)
        throws IllegalRequestParameterException, PostgreSqlException
    ;

    /**
     * 
     * @param uid
     * @param breed
     * @return
     *     returns boolean
     * @throws IllegalRequestParameterException
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateCatBreed", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.UpdateCatBreed")
    @ResponseWrapper(localName = "updateCatBreedResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.UpdateCatBreedResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/updateCatBreedRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/updateCatBreedResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/updateCatBreed/Fault/PostgreSqlException"),
        @FaultAction(className = IllegalRequestParameterException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/updateCatBreed/Fault/IllegalRequestParameterException")
    })
    public boolean updateCatBreed(
        @WebParam(name = "uid", targetNamespace = "")
        int uid,
        @WebParam(name = "breed", targetNamespace = "")
        String breed)
        throws IllegalRequestParameterException, PostgreSqlException
    ;

    /**
     * 
     * @param owner
     * @param uid
     * @return
     *     returns boolean
     * @throws IllegalRequestParameterException
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateCatOwner", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.UpdateCatOwner")
    @ResponseWrapper(localName = "updateCatOwnerResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.UpdateCatOwnerResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/updateCatOwnerRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/updateCatOwnerResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/updateCatOwner/Fault/PostgreSqlException"),
        @FaultAction(className = IllegalRequestParameterException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/updateCatOwner/Fault/IllegalRequestParameterException")
    })
    public boolean updateCatOwner(
        @WebParam(name = "uid", targetNamespace = "")
        int uid,
        @WebParam(name = "owner", targetNamespace = "")
        String owner)
        throws IllegalRequestParameterException, PostgreSqlException
    ;

    /**
     * 
     * @param uid
     * @param ownerName
     * @param eyesColor
     * @param name
     * @param furColor
     * @param age
     * @param breed
     * @return
     *     returns boolean
     * @throws IllegalRequestParameterException
     * @throws PostgreSqlException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateCat", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.UpdateCat")
    @ResponseWrapper(localName = "updateCatResponse", targetNamespace = "http://impl.ws.itmo/", className = "itmo.ws.impl.UpdateCatResponse")
    @Action(input = "http://impl.ws.itmo/CatWebServiceImpl/updateCatRequest", output = "http://impl.ws.itmo/CatWebServiceImpl/updateCatResponse", fault = {
        @FaultAction(className = PostgreSqlException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/updateCat/Fault/PostgreSqlException"),
        @FaultAction(className = IllegalRequestParameterException.class, value = "http://impl.ws.itmo/CatWebServiceImpl/updateCat/Fault/IllegalRequestParameterException")
    })
    public boolean updateCat(
        @WebParam(name = "uid", targetNamespace = "")
        int uid,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "age", targetNamespace = "")
        int age,
        @WebParam(name = "eyesColor", targetNamespace = "")
        String eyesColor,
        @WebParam(name = "furColor", targetNamespace = "")
        String furColor,
        @WebParam(name = "breed", targetNamespace = "")
        String breed,
        @WebParam(name = "ownerName", targetNamespace = "")
        String ownerName)
        throws IllegalRequestParameterException, PostgreSqlException
    ;

}
