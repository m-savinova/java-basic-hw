package ru.savinova.java.basic.homework.homework10;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<Name, String> mapPhoneBook = new HashMap<>();

    public void add(String secondName, String name, String middleName, String phone) {
        mapPhoneBook.put(new Name(secondName, name, middleName), phone);
    }

    public void getPhoneBook() {
        for (Map.Entry<Name, String> entry : mapPhoneBook.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
