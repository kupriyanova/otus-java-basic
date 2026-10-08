package ru.otus.hw7.terrain;

public enum Terrain {

    FOREST("густой лес"),
    PLAIN("равнина"),
    SWAMP("болото");

    private final String title;
    public String getTitle() {
        return title;
    }

    Terrain(String title) {
        this.title = title;
    }
}
