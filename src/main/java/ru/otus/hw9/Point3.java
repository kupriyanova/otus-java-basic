package ru.otus.hw9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Point3 {

    // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
    // метод должен переписать каждую заполненную ячейку списка указанным числом;

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15, 50, 5);

        replaceAllList(-3, list);
        replaceAllList(4, list);

        System.out.println(list);
    }


    public static void replaceAllList(Integer value, List<Integer> list) {
        Collections.fill(list, value);
    }
}
