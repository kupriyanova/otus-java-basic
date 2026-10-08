package ru.otus.hw7.transport;

import ru.otus.hw7.terrain.Terrain;

public class AllTerrainVehicle implements Transport {

    int gasoline;

    public AllTerrainVehicle(int gasoline) {
        this.gasoline = gasoline;
    }

    @Override
    public String getName() {
        return "вездеход";
    }

    @Override
    public void take() {
        System.out.println("Человек сел в вездеход");
    }

    @Override
    public void leave() {
        System.out.println("Человек покинул вездеход");
    }

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (gasoline < distance * 2) { // наверняка вездеход тратит больше бензина
            System.out.println("Слишком мало бензина");
            return false;
        } else {
            gasoline -= distance * 2;
            System.out.printf("Проехал на вездеходе по %s %d км\n", terrain.getTitle(), distance);
            return true;
        }
    }


    @Override
    public String toString() {
        return "Вездеход. Запас бензина = " + gasoline;
    }
}
