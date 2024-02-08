package ru.savinova.java.basic.homework.homework5;

public abstract class Animal {
    private final String name;
    private final int speed;
    public int endurance;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Animal(String name, int speed, int endurance) {
        this.name = name;
        this.speed = speed;
        this.endurance = endurance;
    }

    public void run(int distance) {
        int time = Math.round((float) distance / speed);
        endurance = endurance - distance;
        if (endurance < 0) {
            System.out.println("Время: -1. У " + name + " появилось состояние усталости");
        } else {
            System.out.println(name + " потратил(а) " + time + " сек. на забег.");
        }
    }

    public abstract void swim(int distance);

    public void info() {
        System.out.println("Выносливость " + name + " = " + endurance + " у.е.\n");
    }
}