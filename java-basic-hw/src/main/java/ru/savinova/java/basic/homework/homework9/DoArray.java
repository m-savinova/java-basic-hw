package ru.savinova.java.basic.homework.homework9;

import java.util.ArrayList;

public class DoArray {
    public ArrayList fromMinToMax(int min, int max) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = min; i < max + 1; i++) {
            integerArrayList.add(i);
        }
        System.out.println(integerArrayList);
        return integerArrayList;
    }

    public int sumAllElem(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > 5) {
                sum += arrayList.get(i);
            }
        }
        return sum;
    }

    public void rewrite(int num, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, num);
        }
        System.out.println(list);
    }

    public void increase(int num, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + num);
        }
        System.out.println(list);
    }
}
