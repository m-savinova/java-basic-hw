package ru.savinova.java.basic.homework.homework10;

public class MainApplication {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("Петров Петр", "1234567890");
        phoneBook.add("81234567890", "Иванов Иван");
        phoneBook.add("81234567890", "Иванов Петр");
        //phoneBook.getPhoneBook();
        phoneBook.find("Иванов");
    }
}
