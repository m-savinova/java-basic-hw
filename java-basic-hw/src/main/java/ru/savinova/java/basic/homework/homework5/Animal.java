package ru.savinova.java.basic.homework.homework5;

public class Animal {
    String name;
    int speed;
    int endurance;

    public Animal(String name, int speed, int endurance) {
        this.name = name;
        this.speed = speed;
        this.endurance = endurance;
    }

    public int run(int distance) {
        int time = 0;
        endurance =- 1;
        return time;
    }

    public int swim(int distance) {
        int time = 0;
        endurance =- 1;
        return time;
    }

    public void info() {
        System.out.println(name + " " + endurance);
    }
}
