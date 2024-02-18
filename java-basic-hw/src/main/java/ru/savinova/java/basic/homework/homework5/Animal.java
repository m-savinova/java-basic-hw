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

    public int run(int distance) {
        int time = Math.round((float) distance / speed);
        endurance = endurance - distance;
        if (endurance < 0) {
            System.out.println("У " + getName() + " появилось состояние усталости.");
            return -1;
        }
        System.out.println(getName() + " потратил(а) " + time + " сек. на забег.");
        return time;
    }

    public abstract int swim(int distance);

    public void info() {
        if (endurance < 0) {
            System.out.println("Выносливость " + name + " = 0 у.е.\n");
            } else {
            System.out.println("Выносливость " + name + " = " + endurance + " у.е.\n");
        }
    }
}