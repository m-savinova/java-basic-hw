package ru.savinova.java.basic.homework.homework7;

import java.util.Objects;

public class Man {
    public static String NAME;
    public static String CURRENT_TRANSPORT;
    private static int POWER_OF_MAN = 100;

    public static String getName() {
        return NAME;
    }

    public String getCurrentTransport() {
        return CURRENT_TRANSPORT;
    }

    public static int getPowerOfMan() {
        return POWER_OF_MAN;
    }

    public static void setPowerOfMan(int powerOfMan) {
        POWER_OF_MAN = powerOfMan;
    }

    public Man(String name) {
        Man.NAME = name;
    }

    public void getOn(Actions[] actions) {
        for (Actions action : actions) {
            action.getOn();
        }
    }

    public void walk() {
        System.out.println("Пошёл пешком");
    }

    public boolean move(Actions[] actions, int distance, Terrains terrain) {
        if (!Objects.equals(CURRENT_TRANSPORT, "Пешком")) {
            for (Actions action : actions) {
                action.move(distance, terrain);
            }
            return true;
        } else {
            System.out.println(Man.getName() + " пошел пешком");
            return false;
        }
    }

    public void getOut(Actions[] actions) {
        for (Actions actions1 : actions) {
            actions1.getOut();
        }
    }
}