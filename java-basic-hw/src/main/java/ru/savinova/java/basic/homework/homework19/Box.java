package ru.savinova.java.basic.homework.homework19;

import java.util.ArrayList;

public class Box<F, A, O> {

    ArrayList<F> boxF = new ArrayList<>();
    ArrayList<A> boxA = new ArrayList<>();
    ArrayList<O> boxO = new ArrayList<>();


    public void weight() {
        // высчитывает вес коробки (например, из веса одного фрукта и их количества, или может через суммирование,
        // как посчитаете нужным). Вес фрукта задаете самостоятельно, единицы измерения не важны
    }

    public void compare() {
        // позволяющий сравнить текущую коробку с переданной в качестве аргумента. true – если их массы равны.
        // Можно сравнивать коробки с разными типами фруктов;
    }

    public void add() {

    }
}
