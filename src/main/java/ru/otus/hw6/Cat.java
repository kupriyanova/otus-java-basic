package ru.otus.hw6;

public class Cat {

    private final String name;
    private int APPETITE = 10;
    private boolean isHungry = true;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.APPETITE = appetite;
    }

    public void eatFrom(Plate plate) {
        if (isHungry) {
            if (plate.decriesFood(APPETITE)) {
                System.out.println(name + " покушал и больше не голоден!");
                isHungry = false;
            } else {
                System.out.println("В тарелке недостаточно еды!");
                System.out.println(name + " все еще голоден!");
            }
        } else System.out.println(name + " не голоден.");
    }

    @Override
    public String toString() {
        return "Кот {" +
                "имя = '" + name + "'" +
                ", аппетит = " + APPETITE +
                ", " + (isHungry ? "сейчас голоден" : "сейчас не голоден") +
                "}\n";
    }
}
