package ru.savinova.java.basic.homework.homework11;

public class Main {
    public static void main(String[] args) {
        PersonDataBase personDataBase = new PersonDataBase();
        personDataBase.add(new Person("Иван Иванов", Position.DEVELOPER, 2L));
        personDataBase.add(new Person("Иван Петров", Position.DRIVER, 6L));
        personDataBase.add(new Person("Иван Сидоров", Position.SENIOR_MANAGER, 3L));
        personDataBase.add(new Person("Bob", Position.PLUMBER, 5L));
        personDataBase.add(new Person("John", Position.ENGINEER, 4L));
        personDataBase.add(new Person("Tom", Position.DIRECTOR, 1L));
    }
}
