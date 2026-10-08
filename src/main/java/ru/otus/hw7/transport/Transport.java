package ru.otus.hw7.transport;

import ru.otus.hw7.terrain.Terrain;

public interface Transport {

    String getName();
    void take();
    void leave();
    boolean move(Terrain terrain, int distance);

}