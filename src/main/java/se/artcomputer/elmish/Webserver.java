package se.artcomputer.elmish;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;

public class Webserver {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        try {
            new Webserver().run();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Server started in %d ms%n", (System.currentTimeMillis() - startTime));
    }

    private void run() throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), 0);
        httpServer.createContext("/hello", helloHandler());
        httpServer.start();
    }

    private HttpHandler helloHandler() {
        return http -> {
            http.getResponseHeaders().add("Content-type", "text/html");
            http.sendResponseHeaders(200, 0);
            OutputStream stream = http.getResponseBody();
            PrintWriter printWriter = new PrintWriter(stream);
            printWriter.write(String.format("<h1>Hello %s</h1>", http.getRemoteAddress().getHostName()));
            printWriter.close();
        };
    }
}
