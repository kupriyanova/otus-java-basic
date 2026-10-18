package ru.otus.hw9;

import java.util.Arrays;
import java.util.List;

public class Point2 {

    // Реализуйте метод, принимающий в качестве аргумента список целых чисел,
    // суммирующий все элементы, значение которых больше 5, и возвращающий сумму;

    public static void main(String[] args) {
        System.out.println(sumGrateFive(Arrays.asList(15, 50, 5)));
        System.out.println(sumGrateFive(Arrays.asList(0, 0, 0, 0)));
        System.out.println(sumGrateFive(Arrays.asList(1, 1, 1, 1)));
        System.out.println(sumGrateFive(Arrays.asList(-10, -10, 10, 10)));
    }


    public static int sumGrateFive(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i > 5 ? i : 0;
        }
        return sum;
    }
}
