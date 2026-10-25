package ru.otus.client;

import java.io.IOException;


public class ClientApp {
    public static void main(String[] args) {
        try {
            new Client("localhost", 8189);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
