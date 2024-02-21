package ru.savinova.java.basic.homework.homework9.employee;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        FilterListUser filterListUser = new FilterListUser();
        List<User> users = new ArrayList<User>();
        users.add(new User("Dasha", 20));
        users.add(new User("Glasha", 30));
        users.add(new User("Bob", 40));
        System.out.println(filterListUser.getArrayOfName(users));

    }
}
