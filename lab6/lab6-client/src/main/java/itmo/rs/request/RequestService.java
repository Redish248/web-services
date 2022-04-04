package itmo.rs.request;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import itmo.rs.exception.EmptyInputParamException;
import itmo.rs.model.Cat;

import javax.lang.model.type.PrimitiveType;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.List;

public class RequestService {
    private static final String URL = "http://localhost:8080/rest/cats";

    public static List<Cat> getAllCats(Client client) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/getCats");
        ClientResponse response = executeGet(webResource, "");
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByName(Client client, String name) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/getCatsByName");
       /* if (name != null) {
            webResource = webResource.queryParam("name", name);
        }*/
        ClientResponse response = executeGet(webResource, "Param name is empty");
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static Cat getCatByUid(Client client, int uid) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/getCatByUid");
        webResource = webResource.queryParam("uid", String.valueOf(uid));
        ClientResponse response = executeGet(webResource, "Param uid is empty");
        GenericType<Cat> type = new GenericType<Cat>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByDescription(Client client, String eyesColor, String furColor) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/getCatsByDescription");
        if (eyesColor != null && furColor != null) {
            webResource = webResource.queryParam("eyesColor", eyesColor).queryParam("furColor", furColor);
        }
        ClientResponse response = executeGet(webResource, "Param eyesColor or furColor is empty");
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByBreed(Client client, String breed) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/getCatsByBreed");
        if (breed != null) {
            webResource = webResource.queryParam("breed", breed);
        }
        ClientResponse response = executeGet(webResource, "Param breed is empty");
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByOwner(Client client, String owner) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/getCatsByOwner");
        if (owner != null) {
            webResource = webResource.queryParam("owner", owner);
        }
        ClientResponse response = executeGet(webResource, "Param owner is empty");
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByOwnerAndName(Client client, String name, String owner) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/getCatsByOwnerAndName");
        if (owner != null) {
            webResource = webResource.queryParam("name", name).queryParam("owner", owner);
        }
        ClientResponse response = executeGet(webResource, "Param name or owner is empty");
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByNameAndAge(Client client, String name, int age) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/getCatsByNameAndAge");
        if (name != null) {
            webResource = webResource.queryParam("name", name).queryParam("age", String.valueOf(age));
        }
        ClientResponse response = executeGet(webResource, "Param name or age is empty");
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByBreedAndOwner(Client client, String breed, String owner) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/getCatsByBreedAndOwner");
        if (breed != null && owner != null) {
            webResource = webResource.queryParam("breed", breed).queryParam("owner", owner);
        }
        ClientResponse response = executeGet(webResource, "Param breed or owner is empty");
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByFullDescription(Client client, String eyesColor, String furColor, String breed) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/getCatsByFullDescription");
        if (eyesColor != null && furColor != null && breed != null) {
            webResource = webResource.queryParam("eyesColor", eyesColor).queryParam("furColor", furColor).queryParam("breed", breed);
        }
        ClientResponse response = executeGet(webResource, "Param eyesColor, furColor or breed is empty");
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static int createCat(Client client, String name, int age, String eyesColor, String furColor, String breed, String ownerName) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/createCat");
        if (name != null && eyesColor != null && furColor != null && breed != null && ownerName != null) {
            webResource = webResource.queryParam("name", name)
                    .queryParam("age", String.valueOf(age))
                    .queryParam("eyesColor", eyesColor)
                    .queryParam("furColor", furColor)
                    .queryParam("breed", breed)
                    .queryParam("owner", ownerName);
        }
        ClientResponse response = executePut(webResource, "Param age, eyesColor, furColor, breed, owner is empty");
        GenericType<Integer> type = new GenericType<Integer>() {
        };
        return response.getEntity(type);
    }

    public static Boolean deleteCat(Client client, int uid) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/deleteCat");
        webResource = webResource.queryParam("uid", String.valueOf(uid));
        ClientResponse response = executeDelete(webResource, "Param uid is empty");
        GenericType<Boolean> type = new GenericType<Boolean>() {
        };
        return response.getEntity(type);
    }

    public static Boolean updateCatName(Client client, int uid, String name) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/updateCatName");
        if (name != null) {
            webResource = webResource.queryParam("uid", String.valueOf(uid)).queryParam("name", name);
        }
        ClientResponse response = executePost(webResource, "Param uid or name is empty");
        GenericType<Boolean> type = new GenericType<Boolean>() {
        };
        return response.getEntity(type);
    }

    public static Boolean updateCatDescription(Client client, int uid, String eyesColor, String furColor) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/updateCatDescription");
        if (eyesColor != null && furColor != null) {
            webResource = webResource.queryParam("uid", String.valueOf(uid)).queryParam("eyesColor", eyesColor).queryParam("furColor", furColor);
        }
        ClientResponse response = executePost(webResource, "Param eyesColor or furColor is empty");
        GenericType<Boolean> type = new GenericType<Boolean>() {
        };
        return response.getEntity(type);
    }

    public static Boolean updateCatBreed(Client client, int uid, String breed) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/updateCatBreed");
        if (breed != null) {
            webResource = webResource.queryParam("uid", String.valueOf(uid)).queryParam("breed", breed);
        }
        ClientResponse response = executePost(webResource, "Param uid or breed is empty");
        GenericType<Boolean> type = new GenericType<Boolean>() {
        };
        return response.getEntity(type);
    }

    public static Boolean updateCatOwner(Client client, int uid, String owner) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/updateCatOwner");
        if (owner != null) {
            webResource = webResource.queryParam("uid", String.valueOf(uid)).queryParam("owner", owner);
        }
        ClientResponse response = executePost(webResource, "Param uid or owner is empty");
        GenericType<Boolean> type = new GenericType<Boolean>() {
        };
        return response.getEntity(type);
    }

    public static Boolean updateCat(Client client, int uid, String name, int age, String eyesColor, String furColor, String breed, String ownerName) throws SQLException, EmptyInputParamException {
        WebResource webResource = client.resource(URL + "/updateCat");
        if (eyesColor != null && furColor != null && breed != null && ownerName != null) {
            webResource = webResource.queryParam("uid", String.valueOf(uid))
                    .queryParam("name", name)
                    .queryParam("age", String.valueOf(age))
                    .queryParam("eyesColor", eyesColor)
                    .queryParam("furColor", furColor)
                    .queryParam("breed", breed)
                    .queryParam("owner", ownerName);
        }
        ClientResponse response = executePost(webResource, "Param uid, name, age, eyesColor, furColor, breed or owner is empty");
        GenericType<Boolean> type = new GenericType<Boolean>() {
        };
        return response.getEntity(type);
    }

    private static ClientResponse executeGet(WebResource webResource, String excMsg) throws EmptyInputParamException, SQLException {
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
        checkExceptions(response, excMsg);
        return response;
    }

    private static ClientResponse executePost(WebResource webResource, String excMsg) throws SQLException, EmptyInputParamException {
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).post(ClientResponse.class);
        checkExceptions(response, excMsg);
        return response;
    }

    private static ClientResponse executePut(WebResource webResource, String excMsg) throws SQLException, EmptyInputParamException {
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).put(ClientResponse.class);
        checkExceptions(response, excMsg);
        return response;
    }

    private static ClientResponse executeDelete(WebResource webResource, String excMsg) throws SQLException, EmptyInputParamException {
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).delete(ClientResponse.class);
        checkExceptions(response, excMsg);
        return response;
    }

    private static void checkExceptions (ClientResponse response, String excMsg) throws EmptyInputParamException, SQLException {
        if (response.getStatus() == ClientResponse.Status.NOT_ACCEPTABLE.getStatusCode()) {
            throw new EmptyInputParamException(excMsg);
        }
        if (response.getStatus() == ClientResponse.Status.NOT_MODIFIED.getStatusCode()) {
            throw new SQLException();
        }
        if (response.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
            throw new IllegalStateException("Request failed");
        }
    }

}
