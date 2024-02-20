package ru.savinova.java.basic.homework.homework7;

public interface Transport {
    String nameOfTransport();

    boolean move(int distance, Terrains terrain, String name);
}