package ru.savinova.java.basic.homework.homework12;

import java.util.Scanner;

public class MainApp extends ActionsWithFile {
    public static void main(String[] args) {
        listOfFiles();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название файла с которым вы хотите работать: ");
        String name = input.nextLine();
        System.out.println("Содержимое файла: ");
        reader(name);
        System.out.println("\nВведите что вы там хотите записать в этот файл:");
        writer(name, input);
    }
}
