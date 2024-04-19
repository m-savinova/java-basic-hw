package ru.savinova.java.basic.homework.homework22;

public class MainApp {
    public static void main(String[] args) {
        ActionsWithArrays a = new ActionsWithArrays();
        a.getAllAfterLastOne(new int[]{1, 2, 1, 4, 5});
        System.out.println(a.containsOnlyOneAndTwo(new int[]{1, 1}));
    }
}