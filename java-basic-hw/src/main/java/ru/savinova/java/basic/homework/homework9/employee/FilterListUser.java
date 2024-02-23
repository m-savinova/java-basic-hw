package ru.savinova.java.basic.homework.homework9.employee;

import java.util.ArrayList;
import java.util.List;

public class FilterListUser {
    /**
     * возвращает список имен сотрудников
     */
    public List<String> getArrayOfName(List<User> users) {
        List<String> arrayOfName = new ArrayList<>();
        for (User user : users) {
            arrayOfName.add(user.getName());
        }
        return arrayOfName;
    }

    /**
     * возвращает список сотрудников, возраст которых больше либо равен minAge
     */
    public List<User> getOverMinAge(List<User> users, int minAge) {
        List<User> listOverMinAge = new ArrayList<>();
        for (User user : users) {
            if (user.getAge() >= minAge) {
                listOverMinAge.add(user);
            }
        }
        return listOverMinAge;
    }

    /**
     * проверяет, что средний возраст сотрудников превышает minAverageAge
     */
    public Boolean isExceedsAverageAge(List<User> users, int minAverageAge) {
        int averageAgeUsers = 0;
        for (int i = 0; i < users.size(); i++) {
            averageAgeUsers += users.get(i).getAge();
        }
        return ((averageAgeUsers / users.size()) > minAverageAge);
    }

    /**
     * возвращает ссылку на самого молодого сотрудника
     */
    public User getYoungestUser(List<User> users) {
        int minAge = users.get(0).getAge();
        for (int i = 1; i < users.size(); i++) {
            if (users.get(i).getAge() < minAge) {
                minAge = i;
            }
        }
        return users.get(minAge);
    }
}