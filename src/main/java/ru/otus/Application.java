package ru.otus;

import ru.otus.animals.Cat;
import ru.otus.animals.Dog;
import ru.otus.animals.Horse;

public class Application {

    public static void main(String[] args) {

        Cat cat = new Cat("Васька", 5, 100);
        cat.info();
        cat.run(5);
        cat.swim(1);

        Dog dog = new Dog("Граф", 10, 3, 100);
        dog.info();
        dog.run(10);
        dog.swim(20);
        dog.info();

        Horse horse = new Horse("Зорька", 100, 5, 90);
        horse.info();
        horse.run(80);
        horse.swim(2);
        horse.swim(2);
        horse.run(10);
        horse.info();
    }
}
