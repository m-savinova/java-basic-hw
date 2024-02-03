package ru.savinova.java.basic.homework.homework3;

public class mainApplication {
    public static void main(String[] args) {
        int[][] array = {{1, 9, 1}, {9, -2, 2}, {2, 9, 1}};
        System.out.println(sumOfPositiveElements(array));
        squareOfStars(4);
        diagonalZeroing(array);
        System.out.println(findMax(array));
        System.out.println(sumOfSecondString(array));
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void squareOfStars(int count) {
        String[][] arr = new String[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                arr[i][j] = "*";
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }

    public static void diagonalZeroing(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i][j] = 0;
                }
                if (i + j == array.length - 1) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }

    public static int findMax(int[][] array) {
        int maxElem = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > maxElem) {
                    maxElem = array[i][j];
                }
            }
        }
        return maxElem;
    }

    public static int sumOfSecondString(int[][] array) {
        if (existArr(array)) {
            int sum = 0;
            for (int j = 0; j < array[1].length; j++)
                sum += array[1][j];
            return sum;
        } else {
            return -1;
        }
    }

    private static boolean existArr(int[][] array) {
        return array[1].length > 0;
    }
}