package ru.savinova.java.basic.homework.homework19;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private int boxWeight;

    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public int getBoxWeight() {
        return boxWeight;
    }

    public boolean compare(Box box) {
        return boxWeight == box.getBoxWeight();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
        boxWeight += fruit.getWeight();
    }

    public void pourFruit(Box<? super T> box) {
        box.boxWeight += this.boxWeight;
        fruits.clear();
        this.boxWeight = 0;
    }
}
