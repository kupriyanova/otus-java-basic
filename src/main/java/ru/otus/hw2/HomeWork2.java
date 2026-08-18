package ru.otus.hw2;

import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {
        firstMethod(5, "ha");
        sumArray(15, 30, 4, 5);
        fillArray(17, new int[10]);
        increaseArray(7, 11, 12, 14);
        compareSumOfHalfArray(23, 1, 3, -1, 4, 5, 6, 0);

    }

    // (1)
    //-Реализуйте метод, принимающий в качестве аргументов целое число и строку,
    // и печатающий в консоль строку указанное количество раз
    public static void firstMethod(int count, String sentence) {
        for (int i = 0; i < count; i ++) {
            System.out.println(sentence);
        }
    }

    // 2
    // -Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
    // суммирующий все элементы, значение которых больше 5,
    // и печатающий полученную сумму в консоль.
    public static void sumArray(int... array) {
        int sum = 0;
        for (int i : array) {
            if (i > 5) sum += i;
        }
        System.out.println("Сумма элементов массива, значение которых больше 5, равна: " + sum);
    }

    // 3
    //-Реализуйте метод, принимающий в качестве аргументов
    // целое число и ссылку на целочисленный массив,
    // метод должен заполниться каждую ячейку массива указанным числом.
    public static void fillArray(int value, int... array) {
        Arrays.fill(array, value);
        System.out.println("Значение элементов массива равно: " + Arrays.toString(array));
    }

    // (4)
    //-Реализуйте метод, принимающий в качестве аргументов
    // целое число и ссылку на целочисленный массив,
    // увеличивающий каждый элемент которого на указанное число.
    public static void increaseArray(int increaseValue, int... array) {
        for (int i = 0; i < array.length; i ++) {
            array[i] += increaseValue;
        }
        System.out.println("Новые значения элементов массива равны: " + Arrays.toString(array));
    }

    // (5)
    //-Реализуйте метод, принимающий в качестве аргумента
    // целочисленный массив,
    // и печатающий в консоль сумма элементов какой из половин массива больше.
    public static void compareSumOfHalfArray(int... array) {
        int firstHalfOfArray = 0;
        for (int i = 0; i < array.length / 2; i ++) {
            firstHalfOfArray += array[i];
        }
        System.out.println("Сумма первой половины массива: " + firstHalfOfArray);

        int secondHalfOfArray = 0;
        for (int i = array.length / 2; i < array.length; i ++) {
            secondHalfOfArray += array[i];
        }
        System.out.println("Сумма второй половины массива: " + secondHalfOfArray);

        if (firstHalfOfArray > secondHalfOfArray) System.out.println("Первая половина массива больше");
        else System.out.println("Вторая половина массива больше");
    }
}

