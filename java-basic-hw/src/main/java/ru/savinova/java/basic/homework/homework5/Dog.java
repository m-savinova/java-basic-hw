package ru.savinova.java.basic.homework.homework5;

public class Dog extends Animal {
    public Dog(String name, int speed, int endurance) {
        super(name, speed, endurance);
    }

    @Override
    public int swim(int distance) {
        int time = Math.round((float) distance / getSpeed());
        endurance -= distance * 2;
        if (endurance < 0) {
            System.out.println("У " + getName() + " появилось состояние усталости.");
            return -1;
        }
        System.out.println(getName() + " потратил(а) " + time + " сек. на заплыв.");
        return time;

    }
}