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
    public boolean move(int distance, Terrains terrain) {
        if (terrain == Terrains.SWAMP) {
            System.out.println("Лошадке нечего делать на болоте");
            return false;
        }
        if (power - (distance / 10) > 0) {
            if (INTRANSPORT) {
                power -= distance / 2;
                System.out.println("Человек проехал на лошади " + distance + " км. У лошади осталось " + power + " сил");
                return true;
            } else {
                System.out.println("Человек не в транспорте, ехать не может");
                return false;
            }
        } else {
            System.out.println("У лошадки не хватает сил");
            return false;
        }
    }
}