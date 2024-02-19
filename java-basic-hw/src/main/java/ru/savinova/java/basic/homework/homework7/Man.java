package ru.savinova.java.basic.homework.homework7;

public class Man {
    private String name;
    private boolean currentTransport;
    private int powerOfMan = 100;

    public boolean isCurrentTransport() {
        return currentTransport;
    }

    public int getPowerOfMan() {
        return powerOfMan;
    }

    public Man(String name) {
        this.name = name;
    }

    public void getOn(Actions[] actions) {
        currentTransport = true;
        for (Actions action : actions) {
            action.getOn();
        }
    }

    public boolean move(Actions[] actions, int distance, Terrains terrain) {
        if (isCurrentTransport()) {
            for (Actions action : actions) {
                action.move(distance, terrain);
            }
            return true;
        } else {
            System.out.println(name + " пошел пешком");
            return false;
        }
    }

    public void getOut(Actions[] actions) {
        currentTransport = false;
        for (Actions actions1 : actions) {
            actions1.getOut();
        }
    }
}