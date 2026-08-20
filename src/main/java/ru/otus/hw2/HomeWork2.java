package ru.otus.hw2;

import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {

        // (1*)
        sumArraysToOne(
                new int[] {1,2,3},
                new int[] {3,2,1},
                new int[] {2,2,2,2,2}
        );

        // (2*)
        findPointOfEquilibrium( 0,3,5, 3, 4, -2,3,0);

        // (3*)
        isSorted(true, 1,2, 2, 3,4,5,6,7);
        isSorted(false, 9,8,7,6,5,4,3,3,3,3,2);

        // (4*)
        revertArray(9,8,7,6,5,4,3,3,3,3,2);

        // (1)
        printSentence(5, "ha");
        // (2)
        sumItemsMore5(15, 30, 4, 5);
        // (3)
        fillArray(17, new int[10]);
        // (4)
        increaseArray(7, 11, 12, 14);
        // (5)
        compareSumOfHalfArray(23, 1, 3, -1, 4, 5, 6, 0);

    }

    // (1)
    //-Реализуйте метод, принимающий в качестве аргументов целое число и строку,
    // и печатающий в консоль строку указанное количество раз
    public static void printSentence(int count, String sentence) {
        for (int i = 0; i < count; i ++) {
            System.out.println(sentence);
        }
    }

    // 2
    // -Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
    // суммирующий все элементы, значение которых больше 5,
    // и печатающий полученную сумму в консоль.
    public static void sumItemsMore5(int... array) {
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

    // (1*) Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
    //массив равный сумме входящих;
    //Пример: { 1, 2, 3 }
    //+ { 2, 2 }
    //+ { 1, 1, 1, 1, 1}
    //= { 4, 5, 4, 1, 1 }
    public static void sumArraysToOne(int[]... arrays) {
        int arrayLength = arrays[0].length;
        for (int[] array : arrays) {
            if (arrayLength < array.length) arrayLength = array.length;
        }
        int[] resultArray = new int[arrayLength];
        for (int[] array : arrays) {
            for (int i = 0; i < array.length; i++) {
                resultArray[i] = resultArray[i] + array[i];
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }


    // (2*) Реализуйте метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой части
    //равны. “Точка находится между элементами”;
    //Пример: { 1, 1, 1, 1, 1, | 5 }, { 5, | 3, 4, -2 }, { 7, 2, 2, 2 }, { 9, 4 }
    public static void findPointOfEquilibrium(int ... array) {
        for (int i = 0; i < array.length; i++) {
            int[] first = Arrays.copyOfRange(array, 0, i);
            int[] second = Arrays.copyOfRange(array, i, array.length);
            int firstSum = Arrays.stream(first).sum();
            int secondSum = Arrays.stream(second).sum();
            if (firstSum == secondSum) System.out.println("точка равновесия в массиве между " + (i-1) + " и " + i);
        }
    }

    // (3*) Реализуйте метод, проверяющий что все элементы массива идут в порядке убывания или
    //возрастания (по выбору пользователя)
    public static void isSorted(boolean isASC, int... array) {
        boolean right = true;
        if (isASC) {
            System.out.println("Проверка отсортирован ли массив по возрастанию");
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    right = false;
                    System.out.println("Нет, массив не отсортирован по возрастанию");
                    break;
                }
            }
            if (right) System.out.println("Да, массив отсортирован по возрастанию");
        } else {
            System.out.println("Проверка отсортирован ли массив по убыванию");
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] < array[i+1]) {
                    right = false;
                    System.out.println("Нет, массив не отсортирован по убыванию");
                    break;
                }
            }
            if (right) System.out.println("Да, массив отсортирован по убыванию");
        }
    }

    // (4*) Реализуйте метод, “переворачивающий” входящий массив
    //Пример: { 1 2 3 4 } => { 4 3 2 1 }
    public static void revertArray(int... array) {
        int tempValue;
        int length = array.length;
        for (int i = 0; i < length/2; i++) {
            tempValue = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 -i] = tempValue;
        }
        System.out.println("Перевернутый массив: " + Arrays.toString(array));
    }
}

