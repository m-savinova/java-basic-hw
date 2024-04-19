package ru.savinova.java.basic.homework.homework22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActionsWithArrays {
    public int[] getAllAfterLastOne(int[] arr) {
        int[] res = null;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == 1) {
                res = Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        if (res == null) {
            throw new RuntimeException("В массиве нет ни одной единицы.");
        } else {
            return res;
        }
    }

    public boolean containsOnlyOneAndTwo(int[] arr) {
        List<Integer> arrOfOneAndTwo = new ArrayList<>();
        List<Integer> arrOfElse = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 2) {
                arrOfOneAndTwo.add(arr[i]);
            } else {
                arrOfElse.add(arr[i]);
            }
        }
        return (arrOfOneAndTwo.contains(1) || arrOfElse.contains(2)) && arrOfElse.isEmpty();
    }
}
