package ru.savinova.java.basic.homework.homework22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActionsWithArrays {
    public int[] getAllAfterLastOne(int[] arr) {
        int[] res;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 1 && i == arr.length-1) {
                return new int[0];
            }
            if (arr[i] == 1) {
                res = Arrays.copyOfRange(arr, i+1, arr.length);
                return res;
            }
        }
        throw new RuntimeException("В массиве нет ни одной единицы.");
    }

    public boolean containsOnlyOneAndTwo(int[] arr) {
        List<Integer> arrOfOneAndTwo = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 2) {
                arrOfOneAndTwo.add(arr[i]);
            } else {
                return false;
            }
        }
        return (arrOfOneAndTwo.contains(1) && arrOfOneAndTwo.contains(2));
    }
}