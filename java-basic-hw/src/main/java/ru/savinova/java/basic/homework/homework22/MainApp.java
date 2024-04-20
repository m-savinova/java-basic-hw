package ru.savinova.java.basic.homework.homework22;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ActionsWithArrays a = new ActionsWithArrays();
        System.out.println(Arrays.toString(a.getAllAfterLastOne(new int[]{2, 4})));
        System.out.println(a.containsOnlyOneAndTwo(new int[]{1, 2}));
    }
}