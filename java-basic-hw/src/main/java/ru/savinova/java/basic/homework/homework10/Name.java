package ru.savinova.java.basic.homework.homework10;

public class Name {
    private String secondName;
    private String name;
    private String middleName;

    public Name(String secondName, String name, String middleName) {
        this.secondName = secondName;
        this.name = name;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "ФИО: " + secondName + ' ' + name + ' ' + middleName;
    }
}
