package ru.savinova.java.basic.homework.homework13;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try (Socket socket = new Socket("localhost", 8080)) {
                ExampleClient client = new ExampleClient(socket.getInputStream(), socket.getOutputStream());
                System.out.println(client.read());
                System.out.println("Enter two numbers and operand without spaces:");
                String userMessage = scanner.nextLine();
                if (userMessage.equals("exit")) {
                    break;
                }
                client.send(userMessage);
                String answer = client.read();
                if (answer.equals("Invalid operand entered")) {
                    System.out.println("Введен операнд не из списка! Всего доброго.");
                    break;
                }
                System.out.println(answer);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
