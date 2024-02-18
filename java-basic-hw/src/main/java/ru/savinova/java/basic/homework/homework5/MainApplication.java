package ru.savinova.java.basic.homework.homework5;

public class MainApplication {
    public static void main(String[] args) {
        Animal cat = new Cat("Abarmot", 2, 6);
        Animal dog = new Dog("Bobik", 2, 12);
        Animal horse = new Horse("Plotva", 4, 15);
        run(cat);
        run(dog);
        run(dog);
        run(horse);
        swim(cat);
        swim(dog);
        swim(horse);
    }

    public static void run(Animal animal) {
        animal.run(6);
        animal.info();
    }

    public static void swim(Animal animal) {
        animal.swim(2);
        animal.info();
    }
}