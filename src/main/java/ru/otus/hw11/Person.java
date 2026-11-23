package ru.otus.hw11;

public class Person {

    private final String name;
    private final Position position;
    private final Long id;

    public Person(String name, Position position, Long id) {
        this.name = name;
        this.position = position;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
