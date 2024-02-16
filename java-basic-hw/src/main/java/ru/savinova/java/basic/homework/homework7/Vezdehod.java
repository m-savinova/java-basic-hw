package ru.savinova.java.basic.homework.homework7;

import static ru.savinova.java.basic.homework.homework7.Man.INTRANSPORT;

public class Vezdehod implements Actions {
    private static int gasoline = 100;

    @Override
    public void getOn() {
        INTRANSPORT = true;
        System.out.println("Человек сел в вездеход");
    }

    @Override
    public void getOut() {
        INTRANSPORT = false;
        System.out.println("Человек вышел из вездехода");
    }

    @Override
    public boolean move(int distance, Terrains terrain) {
        if (gasoline - (distance / 10) > 0) {
            if (INTRANSPORT) {
                gasoline -= distance / 5;
                System.out.println("Человек проехал на вездеходе " + distance + " км. Бензина осталось "
                        + gasoline + " л.");
                return true;
            } else {
                System.out.println("Человек не в транспорте, ехать не может");
                return false;
            }
        } else {
            System.out.println("Бензина не хватает");
            return false;
        }
    }
}