package ru.savinova.java.basic.homework.homework7;

public class Vezdehod implements Actions {
    private int gasoline = 100;

    @Override
    public void getOn() {
        System.out.println(" сел в вездеход");
    }

    @Override
    public void getOut() {
        System.out.println(" вышел из вездехода");
    }

    @Override
    public boolean move(int distance, Terrains terrain) {
        if (gasoline - (distance / 5) > 0) {
            gasoline -= distance / 5;
            System.out.println(" проехал на вездеходе " + distance + " км. У вездехода осталось "
                    + gasoline + " л. бензина");
            return true;
        } else {
            System.out.println("У вездехода не хватает бензина");
            return false;
        }
    }
}