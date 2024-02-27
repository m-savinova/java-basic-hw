package ru.savinova.java.basic.homework.homework7;

public class Bike implements Transport {
    @Override
    public String nameOfTransport() {
        return "Bike";
    }

    @Override
    public boolean move(int distance, Terrains terrain, String name, Man man) {
        if (terrain == Terrains.SWAMP) {
            System.out.println("Велосипед не поедет по болоту");
            return false;
        }
        if (man.getPowerOfMan() - (distance / 8) > 0) {
            man.setPowerOfMan(man.getPowerOfMan() - distance / 8);
            System.out.println(name + " проехал на велосипеде " + distance + " км. У человека осталось "
                    + man.getPowerOfMan() + " сил");
            return true;
        } else {
            System.out.println(name + " не хватает сил");
            return false;
        }
    }
}