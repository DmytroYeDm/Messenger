package org.example.messenger.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientConnection {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    public ClientConnection() throws IOException {
        try {
            clientSocket = new Socket("localhost", 8080);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            System.err.println("Помилка при створенні з'єднання: " + e.getMessage());;
        }
    }
    public Socket getClientSocket() {
        return clientSocket;
    }

    public synchronized void sendMessage(String message) throws IOException{
        out.println(message);
        if (out.checkError()) {
            throw new IOException("Сервер закрито");
        }
    }

    public String readMessage() throws IOException {
        return in.readLine();
    }
}
