package ru.savinova.java.basic.homework.homework11;

import java.util.*;

import static ru.savinova.java.basic.homework.homework11.Position.*;

public class PersonDataBase {

    ArrayList<Person> base = new ArrayList<>();
    Set<Position> manager = EnumSet.of(MANAGER, DIRECTOR, BRANCH_DIRECTOR, SENIOR_MANAGER);

    public Person findById(Long id) {
        for (Person person : base) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void add(Person person) {
        base.add(person);
    }

    public boolean isManager(Person person) {
        for (Position position : manager) {
            if (person.getPosition().equals(position)) {
                System.out.println(person.getId() + " manager");
                return true;
            }
        }
        System.out.println(person.getId() + " not manager");
        return false;
    }

    public boolean isEmployee(Long id) {
        for (Person person : base) {
            if (Objects.equals(person.getId(), id) && !isManager(person)) {
                System.out.println(person.getId() + " employee");
                return true;
            }
        }
        System.out.println(id + " not employee");
        return false;
    }
}
