package ru.savinova.java.basic.homework.homework21;

public class PrintLetter {

    private final Object mon = new Object();

    private String l = "C";

    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (l.equals("A") || l.equals("B")) {
                        mon.wait();
                    }
                    System.out.print("A");
                    l = "A";
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (l.equals("B") || l.equals("C")) {
                        mon.wait();
                    }
                    System.out.print("B");
                    l = "B";
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (l.equals("C") || l.equals("A")) {
                        mon.wait();
                    }
                    System.out.print("C");
                    l = "C";
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}