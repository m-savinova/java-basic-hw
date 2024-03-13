package ru.savinova.java.basic.homework.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        File file = new File("java-basic-hw");
        System.out.println(Arrays.toString(file.listFiles()));


        Scanner input = new Scanner(System.in);
        System.out.println("Введите название файла с которым вы хотите работать: ");
        String name = input.nextLine();

        System.out.println("Содержимое файла: ");
        try (InputStreamReader in = new InputStreamReader(new FileInputStream("java-basic-hw/" + name))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n");
        System.out.println("Введите что вы там хотите записать в свой файл:");

        String data = "";
        while (!data.equals("exit")) {
            data = input.nextLine();
            try (FileOutputStream out = new FileOutputStream("java-basic-hw/" + name, true)) {
                byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
                out.write(buffer);
                System.out.println("Всё записано, если хотите закончить работу с файлом введите exit, если нет, " +
                        "то вводите что вы там ещё хотите записать");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
