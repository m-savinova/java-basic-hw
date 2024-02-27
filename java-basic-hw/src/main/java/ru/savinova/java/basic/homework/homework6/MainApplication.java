package ru.savinova.java.basic.homework.homework6;

public class MainApplication {
    public static void main(String[] args) {
        Plate plate = new Plate(10);
        Cat[] cat = {
                new Cat("A"),
                new Cat("B"),
                new Cat("C")
        };
        for (int i = 0; i < cat.length; i++) {
            cat[i].feed(plate, 5);
            cat[i].appetitInfo();
        }
        System.out.println(plate.getCurrentKorm());
        plate.putKorm(15);
        plate.putKorm(8);
        System.out.println(plate.getCurrentKorm());
    }
}