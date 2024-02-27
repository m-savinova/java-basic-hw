package ru.savinova.java.basic.homework.homework7;

public class Car implements Transport {
    private int gasoline = 100;

    @Override
    public String nameOfTransport() {
        return "Car";
    }

    @Override
    public boolean move(int distance, Terrains terrain, String name, Man man) {
        if (terrain == Terrains.DENSE_FOREST || terrain == Terrains.SWAMP) {
            System.out.println("Car will not drive through a dense forest or swamp");
            return false;
        }
        if (gasoline - (distance / 10) > 0) {
            gasoline -= distance / 10;
            System.out.println(name + " проехал на машине " + distance + " км. У машины осталось "
                    + gasoline + " л. бензина");
            return true;
        } else {
            System.out.println("У машины не хватает бензина.");
            return false;
        }
    }
}