package ru.otus.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler {
    private Server server;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    private String username;

    public ClientHandler(Socket socket, Server server) throws IOException {
        this.server = server;
        this.socket = socket;
        this.in = new DataInputStream(socket.getInputStream());
        this.out = new DataOutputStream(socket.getOutputStream());

        new Thread(() -> {
            try {
                String userName = in.readUTF();
                System.out.println("Client connected, port: " + socket.getPort() + " and userName: " + userName);
                setUsername(userName);
                sendMsg("Connected with username: " + username);

                while (true) {
                    String message = in.readUTF();
                    if (message.startsWith("/")) {
                        if(message.equalsIgnoreCase("/exit")) {
                            sendMsg("/exitok");
                            break;
                        } else if (message.startsWith("/w")) {
                            String[] s = message.split(" ", 3);
                            String clientName = s[1];
                            String msg = s[2];
                            server.toUserMessage(username, clientName, msg);
                        }
                    } else {
                        server.broadcastMessage(username, message);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                disconnect();
            }
        }).start();
    }

    public void sendMsg(String message) {
        try {
            out.writeUTF(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void disconnect() {
        server.unsubscribe(this);
        try {
            if (in != null) {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (out != null) {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
