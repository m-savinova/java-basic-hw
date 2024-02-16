package ru.savinova.java.basic.homework.homework7;

import static ru.savinova.java.basic.homework.homework7.Man.CURRENT_TRANSPORT;

public class Vezdehod implements Actions {
    private int gasoline = 100;

    @Override
    public void getOn() {
        CURRENT_TRANSPORT = "Вездеход";
        System.out.println(Man.getName() + " сел в вездеход");
    }

    @Override
    public void getOut() {
        CURRENT_TRANSPORT = "Пешком";
        System.out.println(Man.getName() + " вышел из вездехода");
    }

    @Override
    public boolean move(int distance, Terrains terrain) {
        if (gasoline - (distance / 5) > 0) {
            gasoline -= distance / 5;
            System.out.println(Man.getName() + " проехал на вездеходе " + distance + " км. У вездехода осталось "
                    + gasoline + " л. бензина");
            return true;
        } else {
            System.out.println("У вездехода не хватает бензина");
            return false;
        }
    }
}