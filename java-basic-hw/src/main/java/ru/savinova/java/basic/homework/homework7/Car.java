package ru.savinova.java.basic.homework.homework7;

import static ru.savinova.java.basic.homework.homework7.Man.CURRENT_TRANSPORT;

public class Car implements Actions {
    private int gasoline = 100;

    @Override
    public void getOn() {
        CURRENT_TRANSPORT = "Машина";
        System.out.println(Man.getName() + " cел в машину");
    }

    @Override
    public void getOut() {
        CURRENT_TRANSPORT = "Пешком";
        System.out.println(Man.getName() + " вышел из машины");
    }

    @Override
    public boolean move(int distance, Terrains terrain) {
        if (terrain == Terrains.DENSE_FOREST || terrain == Terrains.SWAMP) {
            System.out.println("Машина не поедет по густому лесу или болоту");
            return false;
        }
        if (gasoline - (distance / 10) > 0) {
            gasoline -= distance / 10;
            System.out.println(Man.getName() + " проехал на машине " + distance + " км. У машины осталось "
                    + gasoline + " л. бензина");
            return true;
        } else {
            System.out.println("У машины не хватает бензина.");
            return false;
        }
    }
}