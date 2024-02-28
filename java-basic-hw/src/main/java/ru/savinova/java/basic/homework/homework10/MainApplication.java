package ru.savinova.java.basic.homework.homework10;

public class MainApplication {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add( "Иванов", "Иван", "Иванович", "81234567890");
        phoneBook.getPhoneBook();
    }
}
