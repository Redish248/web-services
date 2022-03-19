package itmo.ws;

import itmo.ws.impl.CatWebServiceImpl;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        System.out.println("Server started");
        String url = "http://0.0.0.0:8080/CatService";
        Endpoint.publish(url, new CatWebServiceImpl());
    }
}
