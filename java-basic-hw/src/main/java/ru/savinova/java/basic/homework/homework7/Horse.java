package ru.savinova.java.basic.homework.homework7;

import static ru.savinova.java.basic.homework.homework7.Man.CURRENT_TRANSPORT;

public class Horse implements Actions {
    private int power = 100;

    @Override
    public void getOn() {
        CURRENT_TRANSPORT = "Лошадь";
        System.out.println(Man.getName() + " сел на лошадь");
    }

    @Override
    public void getOut() {
        CURRENT_TRANSPORT = "Пешком";
        System.out.println(Man.getName() + " соскочил с лошади");
    }

    @Override
    public boolean move(int distance, Terrains terrain) {
        if (terrain == Terrains.SWAMP) {
            System.out.println("Лошадке нечего делать на болоте");
            return false;
        }
        if (power - (distance / 2) > 0) {
            power -= distance / 2;
            System.out.println(Man.getName() + " проехал на лошади " + distance + " км. У лошади осталось "
                    + power + " сил");
            return true;
        } else {
            System.out.println("Лошади не хватает сил");
            return false;
        }
    }
}