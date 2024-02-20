package ru.savinova.java.basic.homework.homework7;

public class Vezdehod implements Transport {
    private int gasoline = 100;

    @Override
    public String nameOfTransport() {
        return "Vezdehod";
    }

    @Override
    public boolean move(int distance, Terrains terrain, String name) {
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