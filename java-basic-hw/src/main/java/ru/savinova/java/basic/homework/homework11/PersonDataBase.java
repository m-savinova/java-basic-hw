package ru.savinova.java.basic.homework.homework11;

import java.util.*;

import static ru.savinova.java.basic.homework.homework11.Position.*;

public class PersonDataBase {

    private final Map<Long, Person> base = new HashMap<>();
    private final Set<Position> manager = EnumSet.of(MANAGER, DIRECTOR, BRANCH_DIRECTOR, SENIOR_MANAGER);

    public Person findById(Long id) {
        return base.get(id);
    }

    public void add(Long id, Person person) {
        person.setId(id);
        base.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        for (Position position : manager) {
            if (person.getPosition().equals(position)) {
                System.out.println(person.getName() + ", ID:" + person.getId() + ", manager");
                return true;
            }
        }
        System.out.println(person.getName() + ", ID:" + person.getId() + ", not manager");
        return false;
    }

    public boolean isEmployee(Long id) {
        for (Person person : base.values()) {
            if (Objects.equals(person.getId(), id) && !isManager(person)) {
                System.out.println(person.getName() + ", ID:" + person.getId() + ", employee");
                return true;
            }
        }
        System.out.println("ID:" + id + ", not employee");
        return false;
    }
}
