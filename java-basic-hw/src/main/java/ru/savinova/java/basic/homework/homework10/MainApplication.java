package ru.savinova.java.basic.homework.homework10;


import java.util.HashSet;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов Иван", new HashSet<>(List.of("21354687874")));
        phoneBook.add("Иванов Петр", new HashSet<>(List.of("78456845232")));
        phoneBook.add("Стряпшин Bob", new HashSet<>(List.of("00000000123", "00000000000")));
        phoneBook.getPhoneBook();
        phoneBook.find("Иванов");
        phoneBook.containsPhoneNumber("81235487512");
        phoneBook.containsPhoneNumber("00000000123");
        phoneBook.containsPhoneNumber("00000000000");
    }
}
