package ru.otus.hw3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 5, 0, -2}, {-1, -2, -3, 0, 1}};
        int[][] arr2 = {{1, 2, 3, 4, 5}, {1, 1, 1, 1, 1}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        int[][] arr3 = {{1, 2, 3, 4, 5}, {3, 3, 3, 3, 3}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};


        // (1)
        int result = sumOfPositiveElements(arr);
        System.out.println(result);

        // (2)
        printSquare(5);

        // (3)
        zeroMatrix(arr2);

        // (4)
        System.out.println("Max = " + findMax(arr2));

        // (5)
        System.out.println("Sum of second row = " + sumOfSecondRow(arr3));
    }

    // (1)
    // Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
    // метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int[] i : arr) {
            for (int j : i) {
                if (j > 0) sum += j;
            }
        }
        return sum;
    }

    // (2)
    // Реализовать метод, который принимает в качестве аргумента int size
    // и печатает в консоль квадрат из символов * со сторонами соответствующей длины;
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // (3)
    // Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
    // и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
    public static void zeroMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 0;
            arr[i][arr.length - 1 - i] = 0;
        }
        printDoubleArray(arr);
    }

    // (4)
    // Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
    public static int findMax(int[][] array) {
        int[] temp = new int[array.length];
        int maxArr = 0;
        for (int i =0; i < array.length; i++) {
            int [] row = array[i];
            if (row.length > 0) {
                int maxInRow = Arrays.stream(row).max().getAsInt();
                temp[i] = maxInRow;
            }
        }
        if (temp.length > 0) {
            maxArr = Arrays.stream(temp).max().getAsInt();
        }
        return maxArr;
    }

    // (5)
    // Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
    // если второй строки не существует, то в качестве результата необходимо вернуть -1
    public static int sumOfSecondRow(int[][] arr) {
        int sum;
        if (arr.length > 2) sum = Arrays.stream(arr[1]).sum();
        else sum = -1;
        return sum;
    }

    // helpMethod
    public static void printDoubleArray(int[][] arr) {
        for (int[] rows : arr) {
            for (int items : rows) {
                System.out.print(items + " ");
            }
            System.out.println();
        }
    }
}