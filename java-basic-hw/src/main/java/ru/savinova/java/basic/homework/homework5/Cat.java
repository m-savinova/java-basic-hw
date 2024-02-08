package ru.savinova.java.basic.homework.homework5;

public class Cat extends Animal {
    public Cat(String name, int speed, int endurance) {
        super(name, speed, endurance);
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " плавать не умеет");
    }

}