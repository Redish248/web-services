package itmo.rs.request;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import itmo.rs.model.Cat;

import javax.ws.rs.core.MediaType;
import java.util.List;

public class RequestService {
    private static final String URL = "http://localhost:8080/rest/cats";

    public static List<Cat> getAllCats(Client client) {
        WebResource webResource = client.resource(URL + "/getCats");
        ClientResponse response = executeRequest(webResource);
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByName(Client client, String name) {
        WebResource webResource = client.resource(URL + "/getCatsByName");
        if (name != null) {
            webResource = webResource.queryParam("name", name);
        }
        ClientResponse response = executeRequest(webResource);
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static Cat getCatByUid(Client client, int uid) {
        WebResource webResource = client.resource(URL + "/getCatByUid");
        webResource = webResource.queryParam("uid", String.valueOf(uid));
        ClientResponse response = executeRequest(webResource);
        GenericType<Cat> type = new GenericType<Cat>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByDescription(Client client, String eyesColor, String furColor) {
        WebResource webResource = client.resource(URL + "/getCatsByDescription");
        if (eyesColor != null && furColor != null) {
            webResource = webResource.queryParam("eyesColor", eyesColor).queryParam("furColor", furColor);
        }
        ClientResponse response = executeRequest(webResource);
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByBreed(Client client, String breed) {
        WebResource webResource = client.resource(URL + "/getCatsByBreed");
        if (breed != null) {
            webResource = webResource.queryParam("breed", breed);
        }
        ClientResponse response = executeRequest(webResource);
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByOwner(Client client, String owner) {
        WebResource webResource = client.resource(URL + "/getCatsByOwner");
        if (owner != null) {
            webResource = webResource.queryParam("owner", owner);
        }
        ClientResponse response = executeRequest(webResource);
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByOwnerAndName(Client client, String name, String owner) {
        WebResource webResource = client.resource(URL + "/getCatsByOwnerAndName");
        if (owner != null) {
            webResource = webResource.queryParam("name", name).queryParam("owner", owner);
        }
        ClientResponse response = executeRequest(webResource);
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByNameAndAge(Client client, String name, int age) {
        WebResource webResource = client.resource(URL + "/getCatsByNameAndAge");
        if (name != null) {
            webResource = webResource.queryParam("name", name).queryParam("age", String.valueOf(age));
        }
        ClientResponse response = executeRequest(webResource);
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByBreedAndOwner(Client client, String breed, String owner) {
        WebResource webResource = client.resource(URL + "/getCatsByBreedAndOwner");
        if (breed != null && owner != null) {
            webResource = webResource.queryParam("breed", breed).queryParam("owner", owner);
        }
        ClientResponse response = executeRequest(webResource);
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    public static List<Cat> getCatsByFullDescription(Client client, String eyesColor, String furColor, String breed) {
        WebResource webResource = client.resource(URL + "/getCatsByFullDescription");
        if (eyesColor != null && furColor != null && breed != null) {
            webResource = webResource.queryParam("eyesColor", eyesColor).queryParam("furColor", furColor).queryParam("breed", breed);
        }
        ClientResponse response = executeRequest(webResource);
        GenericType<List<Cat>> type = new GenericType<List<Cat>>() {
        };
        return response.getEntity(type);
    }

    private static ClientResponse executeRequest(WebResource webResource) {
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
        if (response.getStatus() !=
                ClientResponse.Status.OK.getStatusCode()) {
            throw new IllegalStateException("Request failed");
        }
        return response;
    }
}
