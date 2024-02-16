package ru.savinova.java.basic.homework.homework7;

public interface Actions {
    void getOn();
    void getOut();
    boolean move(int distance, Terrains terrain);
}