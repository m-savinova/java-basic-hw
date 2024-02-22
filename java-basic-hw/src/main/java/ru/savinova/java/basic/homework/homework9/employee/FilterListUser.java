package ru.savinova.java.basic.homework.homework9.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterListUser {
    public List<String> getArrayOfName(List<User> users) {
        List<String> arrayOfName = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            arrayOfName.add(users.get(i).getName());
        }
        return arrayOfName;
    }

    public List<User> getOlder(List<User> users, int minAge) {
        Iterator<User> iter = users.listIterator();
        while (iter.hasNext()) {
            User user = iter.next();
            if (user.getAge() < minAge) {
                iter.remove();
            }
        }
        return users;
    }

    public Boolean isAverageAge(List<User> users, int minAverage) {
        int averageAgeUsers = 0;
        for (int i = 0; i < users.size(); i++) {
            averageAgeUsers += users.get(i).getAge();
        }
        return ((averageAgeUsers / users.size()) > minAverage);
    }

    public User getYoungest(List<User> users) {
        int minAge = 0;
        for (int i = 1; i < users.size(); i++) {
            if (users.get(i).getAge() < users.get(i - 1).getAge()) {
                minAge = i;
            }
        }
        return users.get(minAge);
    }
}