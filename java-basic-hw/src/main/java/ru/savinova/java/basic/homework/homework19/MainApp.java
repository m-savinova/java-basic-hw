package ru.savinova.java.basic.homework.homework19;

public class MainApp {
    public static void main(String[] args) {
        Box<Orange> boxOrange = new Box<>();
        Box<Apple> boxApple = new Box<>();
        Box<Apple> boxApple2 = new Box<>();
        Box<Fruit> boxFruit = new Box<>();

        boxFruit.addFruit(new Apple());
        boxOrange.addFruit(new Orange());
        boxApple.addFruit(new Apple());
        boxOrange.addFruit(new Orange());
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());

        System.out.println(boxOrange.getBoxWeight());
        System.out.println(boxApple.getBoxWeight());

        System.out.println(boxOrange.compare(boxApple));

        boxApple.pourFruit(boxApple2);
        System.out.println(boxOrange.getBoxWeight());
        System.out.println(boxApple.getBoxWeight());
        System.out.println(boxApple2.getBoxWeight());
    }
}
