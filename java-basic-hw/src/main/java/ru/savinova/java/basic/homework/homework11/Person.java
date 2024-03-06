package ru.savinova.java.basic.homework.homework11;

import javax.swing.text.Position;

public class Person {
    Long id;
    String name;
    Position position;


    public Person(String name, Position position, Long id) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}