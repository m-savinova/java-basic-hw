package ru.savinova.java.basic.homework.simulator;

public class WordUtils {
    public static void main(String[] args) {
        reverseWords("два слова");
    }
    public static String reverseWords(String inputText) {
        String[] result = inputText.split(" ");
        int size = result.length;
        for (int i = 0; i < size /2; i++) {
            String temp = result[i];
            result[i] = result[size -1 -i];
            result[size -1 -i] = temp;
        }
        return String.join(" ", result);
    }
}