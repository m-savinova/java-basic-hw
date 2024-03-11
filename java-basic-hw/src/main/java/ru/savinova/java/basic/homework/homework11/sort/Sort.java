package ru.savinova.java.basic.homework.homework11.sort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] mas = {101, 9, 8, 9, 10};
        bubbleSort(mas);
        mergeSort(mas, 0, mas.length - 1);
        System.out.println(Arrays.toString(mas));
    }

    /**
     * пузырьки
     */
    public static void bubbleSort(int[] mas) {
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

    /**
     * сортировка слиянием
     */

    public static void merge(int[] mas, int low, int mid, int high) {
        int[] leftArray = new int[mid - low + 1];
        int[] rightArray = new int[high - mid];
        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = mas[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = mas[mid + i + 1];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = low; i < high + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    mas[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    mas[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                mas[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                mas[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void mergeSort(int[] mas, int low, int high) {
        if (high <= low) return;
        int mid = (low + high) / 2;
        mergeSort(mas, low, mid);
        mergeSort(mas, mid + 1, high);
        merge(mas, low, mid, high);
    }
}