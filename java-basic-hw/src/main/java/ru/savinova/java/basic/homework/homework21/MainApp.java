package ru.savinova.java.basic.homework.homework21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApp {
    public static void main(String[] args) {
        PrintLetter printLetter = new PrintLetter();

        ExecutorService serv = Executors.newFixedThreadPool(3);

        serv.execute(() -> {
            printLetter.printA();
        });

        serv.execute(() -> {
            printLetter.printB();
        });

        serv.execute(() -> {
            printLetter.printC();
        });
        serv.shutdown();
    }
}
