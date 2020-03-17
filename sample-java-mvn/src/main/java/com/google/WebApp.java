package com.google;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class WebApp {

    public static void main(String[] args) throws IOException {
        int port = Integer.parseInt(System.getenv().getOrDefault("PORT", "8080"));
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        server.createContext("/", handler -> {
            byte[] response = "hello, world".getBytes();
            handler.sendResponseHeaders(200, response.length);
            try (OutputStream os = handler.getResponseBody()) {
                os.write(response);
            }
        });

        System.out.println("Listening at http://localhost:" + port);

        server.start();
    }
}
