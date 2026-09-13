package ru.otus;

import ru.otus.hw6.Cat;
import ru.otus.hw6.Plate;

public class Application {

    public static void main(String[] args) {

        Plate plate1 = new Plate(50, 50);
        System.out.println(plate1);

        Cat[] cats = new Cat[] {
                new Cat("Дымок"),
                new Cat("Рыжик"),
                new Cat("Мурка"),
                new Cat("Беляш"),
                new Cat("Жириска", 15),
                new Cat("Клякса"),
                new Cat("Гренка")
        };

        plate1.feedAllCats(cats);

        plate1.increaseFood(100);
        System.out.println(plate1);
        plate1.feedAllCats(cats);

    }
}
