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
        String[] inputStr = input.split(" ");
        int a = Integer.parseInt(inputStr[0]);
        int b = Integer.parseInt(inputStr[1]);
        String op = inputStr[2];
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
        return String.format("%s%s%s = %s", a, op, b, res);
    }
}
