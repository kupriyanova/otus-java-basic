package ru.otus.hw7.transport;

import ru.otus.hw7.terrain.Terrain;

import static ru.otus.hw7.terrain.Terrain.SWAMP;

public class Bike implements Transport{

    @Override
    public String getName() {
        return "велосипед";
    }

    @Override
    public void take() {
        System.out.println("Человек сел на велосипед");
    }

    @Override
    public void leave() {
        System.out.println("Человек слез с велосипеда");
    }

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (terrain.equals(SWAMP)) {
            System.out.println("Велосипед не может ехать по " + terrain.getTitle());
            System.out.println("Пересядьте на другой вид транспорта");
            return false;
        } else {
            System.out.printf("Проехал на велосипеде по %s %d км\n", terrain.getTitle(), distance);
            return true;
        }
    }


    @Override
    public String toString() {
        return "Велосипед. Можно ехать бесконечно.";
    }
}
