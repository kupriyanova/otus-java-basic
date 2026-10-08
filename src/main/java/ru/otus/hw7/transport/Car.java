package ru.otus.hw7.transport;

import ru.otus.hw7.terrain.Terrain;

import static ru.otus.hw7.terrain.Terrain.SWAMP;

public class Car implements Transport{

    int gasoline;

    public Car(int gasoline) {
        this.gasoline = gasoline;
    }

    @Override
    public String getName() {
        return "машину";
    }

    @Override
    public void take() {
        System.out.println("Человек сел в машину");
    }

    @Override
    public void leave() {
        System.out.println("Человек покинул машину");
    }

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (terrain.equals(Terrain.FOREST) | terrain.equals(SWAMP)) {
            System.out.println("Машина не может ехать по " + terrain.getTitle());
            System.out.println("Пересядьте на другой вид транспорта");
            return false;
        } else if (gasoline < distance) {
            System.out.println("Слишком мало бензина");
            return false;
        } else {
            gasoline -= distance;
            System.out.printf("Проехал на машине по %s %d км\n", terrain.getTitle(), distance);
            return true;
        }
    }


    @Override
    public String toString() {
        return "Машина. Запас бензина = " + gasoline;
    }
}
