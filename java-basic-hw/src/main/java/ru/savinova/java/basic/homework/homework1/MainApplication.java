package ru.savinova.java.basic.homework.homework1;

import java.util.Random;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5 включительно:");
        int number = scan.nextInt();
        int a = (int) (Math.random() * 30) - 10;
        int b = (int) (Math.random() * 30) - 10;
        int c = (int) (Math.random() * 30) - 10;
        boolean bln = Math.random() > 0.5;
        if (number == 1) {
            greetings();
        } else if (number == 2) {
            System.out.println("Рандомно подобраны числа: " + a + ", " + b + ", " + c + " ");
            checkSign(a, b, c);
        } else if (number == 3) {
            System.out.println("data = " + a);
            selectColor(a);
        } else if (number == 4) {
            System.out.println("Начальное значение a = " + a + ", b = " + b);
            compareNumbers(a, b);
        } else if (number == 5) {
            System.out.println("initValue = " + a + ", delta = " + b + ", increment = " + bln);
            addOrSubtractAndPrint(a, b, bln);
        }
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Их сумма равна: " + sum);
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(int data) {
        System.out.println("Выбран цвет:");
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data < 21) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}