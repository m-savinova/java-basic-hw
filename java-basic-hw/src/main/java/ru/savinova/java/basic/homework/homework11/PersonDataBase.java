package ru.savinova.java.basic.homework.homework11;

import java.util.*;

import static ru.savinova.java.basic.homework.homework11.Position.*;

public class PersonDataBase {

    ArrayList<Person> base = new ArrayList<>();

    public Person findById(Long id) {
        return null;
    }

    public void add(Person person) {
        base.add(person);
    }

    public boolean isManager(Person person) {
        Set<Position> Managers = EnumSet.of(MANAGER, DIRECTOR, BRANCH_DIRECTOR, SENIOR_MANAGER);
        for (Position position : Managers) {
            if (person.getPosition().equals(position)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmployee(Long id) {
        return false;
    }
}
