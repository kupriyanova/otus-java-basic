package ru.otus.hw1;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int i = sc.nextInt();

        while (i < 1 || i > 5) {
            System.out.println("Введите число от 1 до 5");
            i = sc.nextInt();
        }

        if (i == 1) greetings();
        if (i == 2) checkSign(1, 4, 5);
        if (i == 3) selectColor();
        if (i == 4) compareNumbers();
        if (i == 5) {
            greetings();
            checkSign(1, 4, 5);
            selectColor();
            compareNumbers();
        }
    }

    // (1)
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    // (2)
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    // (3)
    public static void selectColor() {
        int data = -10;
        if (data <= 10) System.out.println("Красный");
        else if (data <= 20) System.out.println("Желтый");
        else if (data > 20) System.out.println("Зеленый");
    }

    // (4)
    public static void compareNumbers() {
        int a = -5;
        int b = 103;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }


}
