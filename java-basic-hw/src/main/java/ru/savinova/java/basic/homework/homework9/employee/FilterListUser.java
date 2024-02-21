package ru.savinova.java.basic.homework.homework9.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterListUser {
    public List<String> getArrayOfName(List<User> users) {
        List<String> arrayOfName =  new ArrayList<String>();
        for (int i = 0; i < users.size(); i++) {
            arrayOfName.add(users.get(i).getName());
        }
        return arrayOfName;
    }

//    public List<User> getOlder(List<User> users, int minAge) {
//        Iterator<User> iter = users.iterator();
//        while (iter.hasNext()) {
//            }
//        }
//    }
}
