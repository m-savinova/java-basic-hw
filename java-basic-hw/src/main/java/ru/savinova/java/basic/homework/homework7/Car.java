package ru.savinova.java.basic.homework.homework7;

import static ru.savinova.java.basic.homework.homework7.Man.INTRANSPORT;

public class Car implements Actions {
    private int gasoline = 100;

    @Override
    public void getOn() {
        INTRANSPORT = true;
        System.out.println("Человек сел в машину");
    }

    @Override
    public void getOut() {
        INTRANSPORT = false;
        System.out.println("Человек вышел из машины");
    }

    @Override
    public boolean move(int distance, Terrains terrain) {
        if (terrain == Terrains.DENSE_FOREST || terrain == Terrains.SWAMP) {
            System.out.println("Машина не поедет по густому лесу или болоту");
            return false;
        }
        if (gasoline - (distance / 10) > 0) {
            if (INTRANSPORT) {
                gasoline -= distance / 10;
                System.out.println("Человек проехал на машине " + distance + " км. У машины осталось " + gasoline + " л. бензина.");
                return true;
            } else {
                System.out.println("Человек не в машине, ехать не может");
                return false;
            }
        } else {
            System.out.println("У машины не хватает бензина.");
            return false;
        }
    }
}