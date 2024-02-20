package ru.savinova.java.basic.homework.homework7;

public class Bike implements Transport {
    @Override
    public String nameOfTransport() {
        return "Bike";
    }

    @Override
    public boolean move(int distance, Terrains terrain, String name) {
        if (terrain == Terrains.SWAMP) {
            System.out.println("Велосипед не поедет по болоту");
            return false;
        }
//        if (powerOfMan - (distance / 8) > 0) {
//            powerOfMan = (powerOfMan - distance / 8);
//            System.out.println(name + " проехал на велосипеде " + distance + " км. У человека осталось " + powerOfMan + " сил");
//            return true;
//        } else {
//            System.out.println(name + " не хватает сил");
//            return false;
//        }
    }
}