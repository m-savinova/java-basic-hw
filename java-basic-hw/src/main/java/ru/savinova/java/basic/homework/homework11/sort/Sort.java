package ru.savinova.java.basic.homework.homework11.sort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] mas = {101, 9, 8, 9, 10};
        arrayBubble(mas);
    }

    /**
     * пузырьки
     */
    public static void arrayBubble(int[] mas) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}