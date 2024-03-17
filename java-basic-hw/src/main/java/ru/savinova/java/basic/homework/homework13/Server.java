package ru.savinova.java.basic.homework.homework13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static final List<ClientHandler> clientHandlers = new ArrayList<>();
    private static final String operations = "+,-,*,/";

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8080);
        while (true) {
            Socket clientSocket = socket.accept();
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
            ClientHandler clientHandler = new ClientHandler(clientSocket, inputStream, outputStream);
            clientHandlers.add(clientHandler);
            outputStream.writeUTF(operations);
            outputStream.flush();
            String userInput = inputStream.readUTF();
            outputStream.writeUTF(arithmeticOperations(userInput));
            outputStream.flush();
        }
    }

    public static String arithmeticOperations(String input) {
        int a = Character.getNumericValue(input.charAt(0));
        int b = Character.getNumericValue(input.charAt(1));
        String op = String.valueOf(input.charAt(3));
        int res = 0;
        switch (op) {
            case "+" -> res = a + b;
            case "-" -> res = a - b;
            case "*" -> res = a * b;
            case "/" -> res = a / b;
            default -> {
                return "Invalid operand entered";
            }
        }
        return STR."\{a}\{op}\{b} = \{res}";
    }
}
