package ru.savinova.java.basic.homework.homework7;

public class Man {
    private final String name;
    private Transport currentTransport;
    private int powerOfMan;

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
            currentTransport = transport;
            System.out.println(name + " got into the " + currentTransport.nameOfTransport());
        } else {
            System.out.println(name + " in " + currentTransport.nameOfTransport());
        }
    }

    public void getOut() {
        if (currentTransport != null) {
            System.out.println(name + " got out the " + currentTransport.nameOfTransport());
            currentTransport = null;
        } else {
            System.out.println(name + " не в транспорте");
        }
    }

    public boolean move(int distance, Terrains terrain) {
        if (currentTransport != null) {
            currentTransport.move(distance, terrain, name, Man.this);
            return true;
        } else {
            System.out.println(name + " walked, because he didn't get on the transport");
        }
        return false;
    }
}