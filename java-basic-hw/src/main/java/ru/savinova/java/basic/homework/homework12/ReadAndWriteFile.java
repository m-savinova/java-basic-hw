package ru.savinova.java.basic.homework.homework12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReadAndWriteFile {
    public static void reader(String name) {
        try (InputStreamReader in = new InputStreamReader(new FileInputStream("java-basic-hw/" + name))) {
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
        while (!data.equals("exit" + "\n")) {
            data = "\n" + input.nextLine() + "\n";
            try (FileOutputStream out = new FileOutputStream("java-basic-hw/" + name, true)) {
                if (!data.equals("exit" + "\n")) {
                    byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
                    out.write(buffer);
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
