package ru.savinova.java.basic.homework.homework7;

public class Man {
    private String name;
    private String currentTransport;
    public static boolean INTRANSPORT;

    public String getName() {
        return name;
    }

    public String getCurrentTransport() {
        return currentTransport;
    }

    public static boolean isINTRANSPORT() {
        return INTRANSPORT;
    }

    public Man(String name, String currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    public void getOn(Actions[] actions) {
        for (Actions action : actions) {
            action.getOn();
        }
    }

    public void move(Actions[] actions, int distance, Terrains terrain) {
        for (Actions action : actions) {
            action.move(distance, terrain);
        }
    }

    public void getOut(Actions[] actions) {
        for (Actions actions1 : actions) {
            actions1.getOut();
        }
    }
}