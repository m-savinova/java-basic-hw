package ru.savinova.java.basic.homework.homework20;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainApp {
    private static String text;
    private static String[] tokens;

    public static void main(String[] args) {
        request();
        reader("java-basic-hw/" + tokens[0]);
        System.out.println(count(tokens[1]));
    }

    public static void request() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Введите имя файла и последовательность символов: ");
            String inputStr = input.nextLine();
            tokens = inputStr.split(" ", 2);
            if (tokens.length < 2) {
                System.out.println("Неверный формат ввода. Попробуйте ещё раз.");
                continue;
            }
            break;
        }
    }

    public static void reader(String fileName) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                text = new String(buffer, 0, len, StandardCharsets.UTF_8);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int count(String str) {
        return ((text + "\0").split(str).length - 1);
    }
}
