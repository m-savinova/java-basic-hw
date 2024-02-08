package ru.savinova.java.basic.homework.homework5;

public class Horse extends Animal {
    public Horse(String name, int speed, int endurance) {
        super(name, speed, endurance);
    }

    @Override
    public void swim(int distance) {
        int time = Math.round((float) distance / getSpeed());
        endurance = endurance - distance * 4;
        if (endurance < 0) {
            System.out.println("Время: -1. У " + getName() + " появилось состояние усталости");
        } else {
            System.out.println(getName() + " потратил(а) " + time + " сек. на заплыв.");
        }
    }
}