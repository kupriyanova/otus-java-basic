package ru.otus.animals;

public class Horse extends Animal {

    public Horse(String name, double speedRun, double speedSwim, int stamina) {
        super(name, speedRun, speedSwim, stamina);
    }

    @Override
    public void run(int distance) {
        if (stamina > distance) {
            double time = distance / this.speedRun;
            System.out.printf("Лошадь пробежала %d за время %.2f%n", distance, time);
            stamina -= distance;
            System.out.println("Осталось выносливости: "+stamina);
            System.out.println("-----------------------------------------");
            System.out.println();
        } else {
            System.out.println("Лошадь сильно устала и не может дальше бежать");
        }
    }
    @Override
    public void swim(int distance) {
        if (stamina > 4 * distance) {
            double time = distance / this.speedRun;
            System.out.printf("Лошадь пробежала %d за время %.2f %n", distance, time);
            stamina -= 4 * distance;
            System.out.println("Осталось выносливости: "+stamina);
            System.out.println("-----------------------------------------");
            System.out.println();
        } else {
            System.out.println("Лошадь сильно устала и не может дальше бежать");
            System.out.println("-----------------------------------------");
            System.out.println();
        }
    }

    @Override
    public void info() {
        System.out.println("Имя Лошади: " + this.name);
        System.out.printf("Скорость бега лошади: %.2f м/с %n", this.speedRun);
        System.out.printf("Скорость плавания лошади: %.2f м/с %n", this.speedSwim);
        System.out.printf("Выносливость лошади: %d ед. %n", this.stamina);
        System.out.println("-----------------------------------------");
        System.out.println();
    }
}
