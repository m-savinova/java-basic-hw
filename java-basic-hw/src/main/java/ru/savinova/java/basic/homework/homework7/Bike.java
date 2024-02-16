package ru.savinova.java.basic.homework.homework7;

import static ru.savinova.java.basic.homework.homework7.Man.CURRENT_TRANSPORT;

public class Bike implements Actions {
    @Override
    public void getOn() {
        CURRENT_TRANSPORT = "Велосипед";
        System.out.println(Man.getName() + " сел на велосипед");
    }

    @Override
    public void getOut() {
        CURRENT_TRANSPORT = "Пешком";
        System.out.println(Man.getName() + " спешился с велосипеда");
    }

    @Override
    public boolean move(int distance, Terrains terrain) {
        if (terrain == Terrains.SWAMP) {
            System.out.println("Велосипед не поедет по болоту");
            return false;
        }
        if (Man.getPowerOfMan() - (distance / 8) > 0) {
            Man.setPowerOfMan(Man.getPowerOfMan() - distance / 8);
            System.out.println(Man.getName() + " проехал на велосипеде " + distance + " км. У человека осталось " + Man.getPowerOfMan() + " сил");
            return true;
        } else {
            System.out.println(Man.getName() + " не хватает сил");
            return false;
        }
    }
}