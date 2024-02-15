package ru.savinova.java.basic.homework.homework7;

import static ru.savinova.java.basic.homework.homework7.Man.INTRANSPORT;

public class Horse implements Actions {
    private int power = 100;

    @Override
    public void getOn() {
        INTRANSPORT = true;
        System.out.println("Человек сел на лошадь");
    }

    @Override
    public void getOut() {
        INTRANSPORT = false;
        System.out.println("Человек соскочил с лошади");
    }

    @Override
    public boolean move(int distance) {
        if (power > 0 && INTRANSPORT) {
            power -= distance / 2;
            System.out.println("Человек проехал на лошади " + distance + " км. У лошади осталось осталось " + power + " сил");
            return true;
        }
        if (power <= 0) {
            System.out.println("Сил у лошадки не осталось");
        } else {
            System.out.println("Человек не в транспорте, ехать не может");
        }
        return false;
    }
}