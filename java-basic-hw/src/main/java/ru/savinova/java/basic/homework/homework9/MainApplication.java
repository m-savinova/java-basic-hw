package ru.savinova.java.basic.homework.homework9;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        DoArray doArray = new DoArray();
        doArray.fromMinToMax(2, 6);
        ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(10, 2, 3, 20, 5));
        System.out.println("Сумма элементов = " + doArray.sumAllElem(intArrayList));
        doArray.rewrite(1, intArrayList);
        doArray.increaseByNum(3, intArrayList);
    }
}
