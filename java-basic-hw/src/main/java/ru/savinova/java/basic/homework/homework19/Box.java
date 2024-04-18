package ru.savinova.java.basic.homework.homework19;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private int weight;

    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public int getWeight() {
        return weight;
    }

    public boolean compare(Box box) {
        return weight == box.getWeight();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
        weight += fruit.getWeight();
    }

    public void pourFruit(Box<? super T> box) {
        if (box == this) {
            System.out.println("Нельзя пересыпать из одной и той же коробки в неё же))");
            return;
        }
        if (box == null) {
            System.out.println("Нечего пересыпать из пустой коробки.");
            return;
        }
        box.weight += this.weight;
        fruits.clear();
        this.weight = 0;
    }
}
