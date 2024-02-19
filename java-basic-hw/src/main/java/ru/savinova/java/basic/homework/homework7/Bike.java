package ru.savinova.java.basic.homework.homework7;

public class Bike implements Actions {
    private int powerOfMan;

    public Bike(int powerOfMan) {
        this.powerOfMan = powerOfMan;
    }

    @Override
    public void getOn() {
        System.out.println(" сел на велосипед");
    }

    @Override
    public void getOut() {
        System.out.println(" спешился с велосипеда");
    }

    @Override
    public boolean move(int distance, Terrains terrain) {
        if (terrain == Terrains.SWAMP) {
            System.out.println("Велосипед не поедет по болоту");
            return false;
        }
        if (powerOfMan - (distance / 8) > 0) {
            powerOfMan = (powerOfMan - distance / 8);
            System.out.println(" проехал на велосипеде " + distance + " км. У человека осталось " + powerOfMan + " сил");
            return true;
        } else {
            System.out.println(" не хватает сил");
            return false;
        }
    }
}