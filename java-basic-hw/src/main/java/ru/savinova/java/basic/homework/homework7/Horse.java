package ru.savinova.java.basic.homework.homework7;

public class Horse implements Actions {
    private int power = 100;

    @Override
    public void getOn() {
        System.out.println(" сел на лошадь");
    }

    @Override
    public void getOut() {
        System.out.println(" соскочил с лошади");
    }

    @Override
    public boolean move(int distance, Terrains terrain) {
        if (terrain == Terrains.SWAMP) {
            System.out.println("Лошадке нечего делать на болоте");
            return false;
        }
        if (power - (distance / 2) > 0) {
            power -= distance / 2;
            System.out.println(" проехал на лошади " + distance + " км. У лошади осталось "
                    + power + " сил");
            return true;
        } else {
            System.out.println("Лошади не хватает сил");
            return false;
        }
    }
}