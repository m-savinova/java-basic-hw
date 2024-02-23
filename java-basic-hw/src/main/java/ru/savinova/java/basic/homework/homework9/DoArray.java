package ru.savinova.java.basic.homework.homework9;

import java.util.ArrayList;
import java.util.List;

public class DoArray {
    /**
     * возвращает ArrayList в диапазоне от min до max включительно
     */
    public void fromMinToMax(int min, int max) {
        List<Integer> integerArrayList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            integerArrayList.add(i);
        }
        System.out.println(integerArrayList);
    }

    /**
     * возвращает сумму всех элементов ArrayList, значение которых больше 5
     */
    public int sumAllElem(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (Integer integer : arrayList) {
            if (integer > 5) {
                sum += integer;
            }
        }
        return sum;
    }

    /**
     * заменяет все элементы списка указанным числом (num)
     */
    public void rewrite(int num, List<Integer> list) {
        list.replaceAll(ignored -> num);
        System.out.println(list);
    }

    /**
     * увеличивает каждый элемент списка на указанное число (num)
     */
    public void increaseByNum(int num, List<Integer> list) {
        list.replaceAll(integer -> integer + num);
        System.out.println(list);
    }
}
