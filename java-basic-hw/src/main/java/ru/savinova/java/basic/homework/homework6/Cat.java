package ru.savinova.java.basic.homework.homework6;

public class Cat {
    private final String name;
    private Boolean appetite;

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
        this.appetite = false;
    }

    public void feed(Plate plate, int countKorm) {
        if (plate.decreaseKorm(countKorm)) {
            appetite = true;
            plate.setCurrentKorm(plate.getCurrentKorm() - countKorm);
        } else {
            System.out.println("В тарелке нет такого количества корма, чтобы покормить кота " + getName());
        }
    }

    public void appetitInfo() {
        if (appetite) {
            System.out.println("Кот " + getName() + " сыт (не голоден)!");
        } else {
            System.out.println("Кот " + getName() + " не сыт (смелый кот, но голоден)");
        }
    }
}