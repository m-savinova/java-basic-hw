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
        long n = person.getId();
        return manager.contains(base.get(n).getPosition());
    }

    public boolean isEmployee(Long id) {
        return !manager.contains(base.get(id).getPosition());
    }
}
