package ru.otus.animals;

public class Dog extends Animal {

    public Dog(String name, double speedRun, double speedSwim, int stamina) {
        super(name, speedRun, speedSwim, stamina);
    }

    @Override
    public void run(int distance) {
        if (stamina > distance) {
            double time = distance / this.speedRun;
            System.out.printf("Собака пробежала %d за время %.2f%n", distance, time);
            stamina -= distance;
            System.out.println("Осталось выносливости: "+stamina);
            System.out.println("-----------------------------------------");
            System.out.println();
        } else {
            System.out.println("Собака сильно устала и не может дальше бежать");
        }
    }
    @Override
    public void swim(int distance) {
        if (stamina > 2 * distance) {
            double time = distance / this.speedRun;
            System.out.printf("Собака пробежала %d за время %.2f%n", distance, time);
            stamina -= 2 * distance;
            System.out.println("Осталось выносливости: "+stamina);
            System.out.println("-----------------------------------------");
            System.out.println();
        } else {
            System.out.println("Собака сильно устала и не может дальше бежать");
            System.out.println("-----------------------------------------");
            System.out.println();
        }
    }

    @Override
    public void info() {
        System.out.println("Имя собаки: " + this.name);
        System.out.printf("Скорость бега собаки: %.2f м/с %n", this.speedRun);
        System.out.printf("Скорость плавания собаки: %.2f м/с %n", this.speedSwim);
        System.out.printf("Выносливость собаки: %d ед. %n", this.stamina);
        System.out.println("-----------------------------------------");
        System.out.println();
    }
}
