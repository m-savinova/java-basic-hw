package ru.savinova.java.basic.homework.homework11;

public class Person {
    private final String name;
    private final Position position;
    private Long id;

    public Person(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}