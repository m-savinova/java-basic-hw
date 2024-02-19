package ru.savinova.java.basic.homework.homework7;

public class MainApplication {
    public static void main(String[] args) {
        Man man = new Man("Bob");
        Car car = new Car();
        Horse horse = new Horse();
        Bike bike = new Bike(man.getPowerOfMan());
        Vezdehod vezdehod = new Vezdehod();

        man.getOn(new Actions[]{car});
        man.getOut(new Actions[]{car});
        System.out.println(man.isCurrentTransport());
        man.move(new Actions[]{horse}, 50, Terrains.DENSE_FOREST);
        man.getOn(new Actions[]{car, horse, bike, vezdehod});
        man.move(new Actions[]{car, horse, bike, vezdehod}, 50, Terrains.SWAMP);
        man.move(new Actions[]{car, horse, bike, vezdehod}, 500, Terrains.PLAIN);
        man.move(new Actions[]{car, horse, bike, vezdehod}, 500, Terrains.PLAIN);
        System.out.println(man.isCurrentTransport());
    }
}