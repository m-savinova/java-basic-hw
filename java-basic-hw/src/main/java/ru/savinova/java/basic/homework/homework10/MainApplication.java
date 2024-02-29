package ru.savinova.java.basic.homework.homework10;

public class MainApplication {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("81234567890", "Иванов Иван");
        phoneBook.add("78456845232", "Иванов Петр");
        phoneBook.add("00000000123", "Стряпшин Bob");
        phoneBook.getPhoneBook();
        phoneBook.find("Иванов");
        phoneBook.containsPhoneNumber("00000000123");
    }
}
