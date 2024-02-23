package ru.savinova.java.basic.homework.homework7;

import java.util.Objects;

public class Man {
    private final String name;
    private String currentTransport;
    private int powerOfMan;

    public String getCurrentTransport() {
        return currentTransport;
    }

    public int getPowerOfMan() {
        return powerOfMan;
    }

    public void setPowerOfMan(int powerOfMan) {
        this.powerOfMan = powerOfMan;
    }

    public Man(String name, int powerOfMan) {
        this.name = name;
        this.powerOfMan = powerOfMan;
    }

    public void getIn(Transport transport) {
        if (currentTransport == null) {
            currentTransport = transport.nameOfTransport();
            System.out.println(name + " got into the " + currentTransport);
        } else {
            System.out.println(name + " in " + currentTransport);
        }
    }

    public void getOut() {
        if (currentTransport != null) {
            System.out.println(name + " got out the " + currentTransport);
            currentTransport = null;
        } else {
            System.out.println(name + " не в транспорте");
        }
    }

    public boolean move(Transport transport, int distance, Terrains terrain) {
        if (currentTransport != null) {
            if (Objects.equals(currentTransport, transport.nameOfTransport())) {
                transport.move(distance, terrain, name, Man.this);
                return true;
            } else {
                System.out.println(name + " сейчас не в " + transport.nameOfTransport());
                return false;
            }
        } else {
            System.out.println(name + " walked, because he didn't get on the transport");
            return false;
        }
    }
}