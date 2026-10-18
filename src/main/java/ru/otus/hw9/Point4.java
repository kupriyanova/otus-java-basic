package ru.otus.hw9;

import java.util.Arrays;
import java.util.List;

public class Point4 {

    // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
    // увеличивающий каждый элемент списка на указанное число;

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15, 50, 5);

        addToAllItems(3, list);
        addToAllItems(-1, list);
        addToAllItems(0, list);

        System.out.println(list);
    }


    public static void addToAllItems(Integer value, List<Integer> list) {
        list.replaceAll(i -> i + value);
    }
}
