package ru.otus.animals;

public abstract class Animal {

    protected String name;
    protected Double speedRun;
    protected Double speedSwim; //
    protected int stamina;

    public Animal(String name, Double speedRun, Double speedSwim, int stamina) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.stamina = stamina;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public abstract void info();

}
