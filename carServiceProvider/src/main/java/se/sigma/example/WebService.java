package se.sigma.example;

import javax.xml.ws.Endpoint;

public class WebService {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8090/car", new Car());
    }
}
