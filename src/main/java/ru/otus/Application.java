package ru.otus;

import ru.otus.hw7.Human;
import ru.otus.hw7.terrain.Terrain;
import ru.otus.hw7.transport.AllTerrainVehicle;
import ru.otus.hw7.transport.Bike;
import ru.otus.hw7.transport.Car;
import ru.otus.hw7.transport.Horse;

public class Application {

    public static void main(String[] args) {

        Car car = new Car(50);
        Bike bike = new Bike();
        Horse horse = new Horse(100);
        AllTerrainVehicle jeep = new AllTerrainVehicle(100);

        Human vasya = new Human("Вася");
        Human petya = new Human("Петя");
        Human masha = new Human("Маша");

        System.out.println(vasya);
        vasya.takeTransport(car);
        vasya.takeTransport(bike);
        System.out.println(vasya);
        vasya.leaveTransport();
        vasya.takeTransport(bike);
        System.out.println(vasya);
        System.out.println(vasya.travel(Terrain.PLAIN, 10));


        petya.takeTransport(jeep);
        System.out.println(petya);
        System.out.println(petya.travel(Terrain.SWAMP, 15));
        System.out.println(petya);


        masha.takeTransport(horse);
        System.out.println(masha);
        System.out.println(masha.travel(Terrain.SWAMP, 5));
        System.out.println(masha.travel(Terrain.FOREST, 5));
        System.out.println(masha);

    }
}
