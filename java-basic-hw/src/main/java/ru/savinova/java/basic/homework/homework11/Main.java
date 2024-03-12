package ru.savinova.java.basic.homework.homework11;

public class Main {
    public static void main(String[] args) {
        PersonDataBase personDataBase = new PersonDataBase();
        personDataBase.add(2L, new Person("Иван Иванов", Position.DEVELOPER));
        personDataBase.add(6L, new Person("Иван Петров", Position.DRIVER));
        personDataBase.add(3L, new Person("Иван Сидоров", Position.SENIOR_MANAGER));
        personDataBase.add(5L, new Person("Bob", Position.PLUMBER));
        personDataBase.add(4L, new Person("John", Position.ENGINEER));
        personDataBase.add(1L, new Person("Tom", Position.DIRECTOR));
        personDataBase.isManager(personDataBase.findById(3L));
        personDataBase.isEmployee(5L);

    }
}
