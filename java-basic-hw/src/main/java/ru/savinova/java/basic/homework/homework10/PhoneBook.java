package ru.savinova.java.basic.homework.homework10;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {
    Map<String, String> mapPhoneBook = new HashMap<>();

    public void add(String phone, String name) {
        mapPhoneBook.put(phone, name);
    }

    public void getPhoneBook() {
        for (Map.Entry<String, String> entry : mapPhoneBook.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }

    public void find(String searchName) {
        for (Map.Entry<String, String> entry : mapPhoneBook.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.contains(searchName)) {
                System.out.println(key);
            }
        }
    }

    public boolean containsPhoneNumber(String num) {
        if (mapPhoneBook.containsKey(num)) {
            System.out.println("Телефон " + num + " есть в справочнике");
            return true;
        }
        System.out.println("Телефон " + num + " отсутствует в справочнике");
        return false;
    }
}