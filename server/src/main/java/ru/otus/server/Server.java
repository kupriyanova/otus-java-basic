package ru.otus.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Server {
    private int port;
    private List<ClientHandler> clients;

    public Server(int port) {
        this.port = port;
        this.clients = new CopyOnWriteArrayList<>();
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. port: " + port);
            while (true) {
                Socket socket = serverSocket.accept();
                subscribe(new ClientHandler(socket, this));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void subscribe(ClientHandler clientHandler) {
        clients.add(clientHandler);
    }

    public void unsubscribe(ClientHandler clientHandler) {
        System.out.println("Client disconnected, username: " + clientHandler.getUsername());
        clients.remove(clientHandler);
    }

    public void broadcastMessage(String username, String message) {
        String msg = String.format("[%s]: %s", username, message);
        for (ClientHandler c : clients) {
            c.sendMsg(msg);
        }
    }

    public void toUserMessage(String from, String to, String message) {
        String msg = String.format("[%s]: %s", from, message);
        List<ClientHandler> clientHandlerList = clients.stream().filter(c -> c.getUsername().equals(to)).toList();
        for (ClientHandler c : clientHandlerList) {
            c.sendMsg(msg);
        }
    }
}
