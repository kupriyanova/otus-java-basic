package ru.otus.server;

public class ServerApp {
    public static void main(String[] args) {
        int port = 8189;
        new Server(port).start();
    }
}
