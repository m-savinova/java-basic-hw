package ru.savinova.java.basic.homework.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class actionsWithFile {
    public static void listOfFiles () {
        File file = new File(".");
        System.out.println(Arrays.toString(file.list()));
    }

    public static void reader(String name) {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(name))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writer(String name, Scanner input) {
        String data = "";
        while (!data.equals("\n" + "exit")) {
            data = "\n" + input.nextLine();
            try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(name, true))) {
                if (!data.equals("\n" + "exit")) {
                    byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
                    for (byte b : buffer) {
                        out.write(b);
                    }
                System.out.println("Всё записано, если хотите закончить работу с файлом введите exit, если нет, " +
                        "то вводите что вы там ещё хотите записать");
                } else {
                    System.out.println("Всего доброго.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
