package ru.savinova.java.basic.homework.homework11;

import java.util.*;

import static ru.savinova.java.basic.homework.homework11.Position.*;

public class PersonDataBase {

    ArrayList<Person> base = new ArrayList<>();
    Set<Position> Managers = EnumSet.of(MANAGER, DIRECTOR, BRANCH_DIRECTOR, SENIOR_MANAGER);

    public Person findById(Long id) {
        for (Person person: base) {
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
        for (Position position : Managers) {
            if (person.getPosition().equals(position)) {
                System.out.println(person.getId() + " менеджер");
                return true;
            }
        }
        System.out.println(person.getId() + " не менеджер");
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
