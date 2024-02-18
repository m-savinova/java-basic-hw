package ru.savinova.java.basic.homework.homework6;

public class Cat {
    private final String name;
    private boolean appetite;

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
        this.appetite = true;
    }

    public void feed(Plate plate, int countKorm) {
        if (appetite) {
            if (plate.decreaseKorm(countKorm)) {
                appetite = false;
            } else {
                System.out.println("В тарелке нет такого количества корма, чтобы покормить кота " + getName());
            }
        } else {
            System.out.println("Кот " + name + " не голоден.");
        }
    }

    public void appetitInfo() {
        if (!appetite) {
            System.out.println("Кот " + name + " сыт (не голоден)!");
        } else {
            System.out.println("Кот " + name + " не сыт (смелый кот, но голоден)");
        }
    }
}