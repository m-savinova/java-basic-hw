package ru.savinova.java.basic.homework.homework7;

public class Car implements Actions {
    private int gasoline = 100;

    @Override
    public void getOn() {
        System.out.println(" cел в машину");
    }

    @Override
    public void getOut() {
        System.out.println(" вышел из машины");
    }

    @Override
    public boolean move(int distance, Terrains terrain) {
        if (terrain == Terrains.DENSE_FOREST || terrain == Terrains.SWAMP) {
            System.out.println("Машина не поедет по густому лесу или болоту");
            return false;
        }
        if (gasoline - (distance / 10) > 0) {
            gasoline -= distance / 10;
            System.out.println(" проехал на машине " + distance + " км. У машины осталось "
                    + gasoline + " л. бензина");
            return true;
        } else {
            System.out.println("У машины не хватает бензина.");
            return false;
        }
    }
}