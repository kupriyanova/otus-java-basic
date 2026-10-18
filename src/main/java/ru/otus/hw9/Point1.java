package ru.otus.hw9;

import java.util.ArrayList;
import java.util.List;

public class Point1 {

    // Реализуйте метод, принимающий в качестве аргументов числа min и max,
    // и возвращающий ArrayList с набором последовательных значений в указанном диапазоне
    // (min и max включительно, шаг - 1);

    public static void main(String[] args) {
        System.out.println(getListFromMinMax(15, 50));

        System.out.println(getListFromMinMax(15, 5));

        System.out.println(getListFromMinMax(0, 0));

        System.out.println(getListFromMinMax(100, 100));

        System.out.println(getListFromMinMax(-10, 0));
    }


    public static List<Integer> getListFromMinMax(int min, int max) {
        if (max >= min) {
            List<Integer> miniMax = new ArrayList<>(max - min);
            for (int i = min; i <= max; i ++) {
                miniMax.add(i);
            }
            return miniMax;
        } else {
            System.out.println("max less them min");
            return null;
        }
    }
}
