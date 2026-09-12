package ru.otus.animals;

public class Cat extends Animal {

    public Cat(String name, double speedRun, int stamina) {
        super(name, speedRun, null, stamina);
    }

    @Override
    public void run(int distance) {
        if (stamina > distance) {
            double time = distance / this.speedRun;
            System.out.printf("Кот пробежал %d за время %.2f%n", distance, time);
            stamina -= distance;
            System.out.println("Осталось выносливости: "+stamina);
            System.out.println("-----------------------------------------");
            System.out.println();
        } else {
            System.out.println("Кот сильно устал и не может дальше бежать");
            System.out.println("-----------------------------------------");
            System.out.println();
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот плавать не умеет");
        System.out.println("-----------------------------------------");
        System.out.println();
    }

    @Override
    public void info() {
        System.out.println("Имя кота: " + this.name);
        System.out.printf("Скорость бега кота: %.2f м/с %n", this.speedRun);
        System.out.println("Кот плавать не умеет");
        System.out.printf("Выносливость кота: %d ед. %n", this.stamina);
        System.out.println("-----------------------------------------");
        System.out.println();
    }
}
