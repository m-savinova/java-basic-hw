package ru.savinova.java.basic.homework.homework7;

import static ru.savinova.java.basic.homework.homework7.Man.INTRANSPORT;

public class Bike implements Actions {
    @Override
    public void getOn() {
        INTRANSPORT = true;
        System.out.println("Человек сел на велосипед");
    }

    @Override
    public void getOut() {
        INTRANSPORT = false;
        System.out.println("Человек спешился с велосипеда");
    }

    @Override
    public boolean move(int distance) {
        if (INTRANSPORT) {
            System.out.println("Человек проехал на велосипеде " + distance + " км.");
            return true;
        }
        System.out.println("Человек не в транспорте, ехать не может");
        return false;
    }
}