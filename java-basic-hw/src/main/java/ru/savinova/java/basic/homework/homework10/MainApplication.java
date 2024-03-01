package ru.savinova.java.basic.homework.homework10;

import java.util.Set;

public class MainApplication {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов Иван", Set.of("21354687874"));
        phoneBook.add("Иванов Петр", Set.of("78456845232"));
        phoneBook.add("Стряпшин Bob", Set.of("00000000123", "00000000000"));
        phoneBook.getPhoneBook();
        phoneBook.find("Иванов");
        phoneBook.containsPhoneNumber("81235487512");
        phoneBook.containsPhoneNumber("00000000123");
        phoneBook.containsPhoneNumber("00000000000");
    }
}