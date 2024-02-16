package ru.savinova.java.basic.homework.homework7;

public class MainApplication {
    public static void main(String[] args) {
        Man man = new Man("Man1", "Car");
        Car car = new Car();
        Horse horse = new Horse();
        Bike bike = new Bike();
        Vezdehod vezdehod = new Vezdehod();

        man.getOn(new Actions[]{car, horse, bike, vezdehod});
        //man.getOut(new Actions[]{car, horse, bike, vezdehod});
        man.move(new Actions[]{car, horse, bike, vezdehod}, 50, Terrains.PLAIN);
        man.move(new Actions[]{car, horse, bike, vezdehod}, 50, Terrains.DENSE_FOREST);
        man.move(new Actions[]{car, horse, bike, vezdehod}, 50, Terrains.SWAMP);
        man.move(new Actions[]{car, horse, bike, vezdehod}, 500, Terrains.PLAIN);
    }
}
