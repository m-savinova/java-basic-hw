package ru.savinova.java.basic.homework.homework7;

public class MainApplication {
    public static void main(String[] args) {
        Man man = new Man("Bob", 100);
        Man man1 = new Man("Mike",100);
        Car car = new Car();
        Horse horse = new Horse();
        Bike bike = new Bike();
        Vezdehod vezdehod = new Vezdehod();

        man1.getIn(bike);
        man1.move(bike, 100, Terrains.PLAIN);
        man.getIn(bike);
        man.move(bike, 100, Terrains.PLAIN);
        man1.getIn(bike);
        man1.move(bike, 100, Terrains.PLAIN);
    }
}