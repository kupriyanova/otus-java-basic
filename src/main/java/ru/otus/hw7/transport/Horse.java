package ru.otus.hw7.transport;

import ru.otus.hw7.terrain.Terrain;

import static ru.otus.hw7.terrain.Terrain.SWAMP;

public class Horse  implements Transport{

    int power;

    public Horse(int power) {
        this.power = power;
    }

    @Override
    public String getName() {
        return "лошадь";
    }

    @Override
    public void take() {
        System.out.println("Человек сел на лошадь");
    }

    @Override
    public void leave() {
        System.out.println("Человек слез с лошади");
    }

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (terrain.equals(SWAMP)) {
            System.out.println("Лошадь не может ехать по болоту");
            System.out.println("Пересядьте на другой вид транспорта");
            return false;
        } else if (power < distance) {
            System.out.println("У лошади слишком мало сил");
            return false;
        } else {
            power -= distance;
            System.out.printf("Проехал на лошади по %s %d км\n", terrain.getTitle(), distance);
            return true;
        }
    }


    @Override
    public String toString() {
        return "Лошадь. Запас сил = " + power;
    }
}
