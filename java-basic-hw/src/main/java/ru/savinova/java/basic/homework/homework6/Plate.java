package ru.savinova.java.basic.homework.homework6;

public class Plate {
    private final int maxKorm;
    private int currentKorm;

    public int getCurrentKorm() {
        return currentKorm;
    }

    public void setCurrentKorm(int currentKorm) {
        this.currentKorm = currentKorm;
    }

    public Plate(int maxKorm) {
        this.maxKorm = maxKorm;
        this.currentKorm = this.maxKorm;
    }

    public void putKorm(int amountKorm) {
        if (amountKorm > (maxKorm - currentKorm)) {
            System.out.println("Нельзя добавить корма больше, чем помещается в кормушку.");
        } else {
            currentKorm += amountKorm;
            System.out.println("Добавили корм в кормушку.");
        }
    }

    public boolean decreaseKorm(int amountOfDecreaseKorm) {
        if (currentKorm - amountOfDecreaseKorm >= 0) {
            setCurrentKorm(currentKorm - amountOfDecreaseKorm);
            return true;
        } else {
            return false;
        }
    }
}