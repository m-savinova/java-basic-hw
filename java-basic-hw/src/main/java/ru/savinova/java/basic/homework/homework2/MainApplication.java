package ru.savinova.java.basic.homework.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        printString(3, "Строка");
        printString2(5, "ЕщёСтрока");
        printSum(1, 6, 150, 0, -8);
        fillCell(5, new int[5]);
        increaseNum(100, new int[]{1, 2, 3, 4});
        sumOfHalf(1, 2, 2, 1, 1, 100);
        sumArrs(new int[]{1, 1}, new int[]{2, 2, 2,}, new int[]{3, 3, 3, 3, 3});
        point(1, 1, 1, 1, 1, 5);
        order(3, 2, 1, 0);
        reverse(0, 1, 2, 3, 4, 5);
    }

    public static void printString(int count, String str) {
        int n = 0;
        while (n < count) {
            System.out.println(str);
            n++;
        }
    }

    public static void printString2(int count, String str) {
        for (int i = 0; i < count; i++)
            System.out.println(str);
    }

    public static void printSum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillCell(int a, int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = a;
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void increaseNum(int n, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] += n;
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void sumOfHalf(int... arr3) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr3.length / 2; i++) {
            sum1 += arr3[i];
        }
        for (int i = arr3.length / 2; i < arr3.length; i++) {
            sum2 += arr3[i];
        }
        if (sum1 > sum2) {
            System.out.println("Сумма первой половины массива больше, чем второй.");
        } else if (sum1 < sum2) {
            System.out.println("Сумма второй половины массива больше, чем первой.");
        } else {
            System.out.println("Суммы обеих половин массива равны.");
        }
    }

    public static void sumArrs(int[] arr1, int[] arr2, int[] arr3) {
        int[] lengthArrs = new int[]{arr1.length, arr2.length, arr3.length};
        int maxLengthOfArrs = 0;
        for (int i = 1; i < lengthArrs.length; i++) {
            if (lengthArrs[i] > maxLengthOfArrs) {
                maxLengthOfArrs = lengthArrs[i];
            }
        }
        System.out.println("Максимальная длина входящих массивов: " + maxLengthOfArrs + " элементов");
        int[] sum = sumElem(maxLengthOfArrs, arr1, arr2, arr3);
        System.out.println(Arrays.toString(sum));
    }

    private static int[] sumElem(int maxLengthOfArrs, int[] arr1, int[] arr2, int[] arr3) {
        int[] sum = new int[maxLengthOfArrs];
        for (int i = 0; i < maxLengthOfArrs; i++) {
            sum[i] = (i < arr1.length ? arr1[i] : 0) +
                     (i < arr2.length ? arr2[i] : 0) +
                     (i < arr3.length ? arr3[i] : 0);
        }
        return sum;
    }

    public static void point(int... arr) {
        int len = arr.length;
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        int lSum = 0;
        int rSum = sum;
        for (int i = 0; i < arr.length; ++i) {
            if (lSum == arr[i]) {
                System.out.println("true");
                return;
            }
            lSum += arr[i];
            rSum -= arr[i];
        }
        if (lSum == rSum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void order(int... arr) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Если вы хотите проверить, что все элементы массива идут в порядке возрастания введите v. " +
                "Если в порядке возрастания введите что-нибудь другое или оставьте поле пустым.");
        String answer = scan.nextLine();
        if (answer.equals("v")) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");
        }
    }

    public static void reverse(int... arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}