package ru.savinova.java.basic.homework.homework10;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {
    private String name;
    private String phone;
    Map<String, String> mapPhoneBook = new HashMap<>();

    public PhoneBook(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(name, phoneBook.name) && Objects.equals(phone, phoneBook.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }

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
            if (entry.getValue().equals(searchName)) {
                System.out.println(entry.getKey());
            }
        }
    }
}