package ru.savinova.java.basic.homework.homework8;

public class MainApplication {
    public static void main(String[] args) {
        String[][] array = {{"1", "1", "er", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        Operations operations = new Operations();
        try {
            operations.intAndSumm(array);
        } catch (AppArraySizeException | AppArrayDataException exp) {
            System.out.println(exp.getMessage());
        }
    }
}