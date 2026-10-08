package ru.otus.hw7;

import ru.otus.hw7.terrain.Terrain;
import ru.otus.hw7.transport.*;

public class Human {

    private final String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public void takeTransport(Transport transport) {
        if (currentTransport == null) {
            currentTransport = transport;
            transport.take();
        } else {
            System.out.println("Сначала нужно оставить " + currentTransport.getName());
        }
    }

    public void leaveTransport() {
        if (currentTransport != null) {
            currentTransport.leave();
            currentTransport = null;
        } else {
            System.out.println(name + " в данный момент не использует никакой транспорт");
        }
    }

    public boolean travel(Terrain terrain, int distance) {
        if (currentTransport == null) {
                System.out.printf("%s протопал пешком по %s %d км \n", name, terrain.getTitle(), distance);
                return true;
        } else {
            return currentTransport.move(terrain, distance);
        }
    }

    @Override
    public String toString() {
        return "Человек { " +
                "имя = '" + name + '\'' +
                ", текущий транспорт = " + (currentTransport==null? "отсутствует" : currentTransport) +
                '}';
    }
}
