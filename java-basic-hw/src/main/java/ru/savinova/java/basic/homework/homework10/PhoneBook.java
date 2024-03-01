package ru.savinova.java.basic.homework.homework10;

import java.util.*;

public class PhoneBook {
    Map<String, Set<String>> mapPhoneBook = new HashMap<>();

    public void add(String name, HashSet<String> phone) {
        mapPhoneBook.put(name, phone);
    }

    public void getPhoneBook() {
        for (Map.Entry<String, Set<String>> entry : mapPhoneBook.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void find(String searchName) {
        for (Map.Entry<String, Set<String>> entry : mapPhoneBook.entrySet()) {
            String key = entry.getKey();
            Set<String> value = entry.getValue();
            if (key.contains(searchName)) {
                System.out.println(value);
            }
        }
    }

    public void containsPhoneNumber(String num) {
        for (Set<String> set : mapPhoneBook.values()) {
            if (set.contains(num)) {
                System.out.println("Номер " + num + " присутствует в телефонной книге");
                return;
            }
        }
        System.out.println("Номер " + num + " отсутствует в телефонной книге");
    }
}