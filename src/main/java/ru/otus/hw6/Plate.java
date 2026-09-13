package ru.otus.hw6;

public class Plate {

    private final int capacity;
    private int amountOfFood;

    public Plate(int capacity, int amountOfFood) {
        this.capacity = capacity;
        this.amountOfFood = amountOfFood;
    }

    // В тарелке должен быть boolean метод уменьшения количества еды,
    // при этом после такого уменьшения, в тарелке не может оказаться отрицательное количество еды
    // (если удалось уменьшить еду так, чтобы в тарелке осталось >= 0 кусков еды,
    // то возвращаем true, в противном случае - false).
    public boolean decriesFood(int amount) {
        if (amountOfFood < amount) return false;
        else {
            amountOfFood -= amount;
            return true;
        }
    }

    // В тарелке должен быть метод, позволяющий добавить еду в тарелку.
    // После добавления в тарелке не может оказаться еды больше максимума
    public void increaseFood(int amount) {
        if (amountOfFood + amount < capacity) amountOfFood += amount;
        else amountOfFood = capacity;
    }

    public void feedAllCats(Cat[] cats) {
        for (Cat cat : cats) {
            cat.eatFrom(this);
            System.out.println(cat);
        }
    }

    @Override
    public String toString() {
        return "Тарелка {" +
                "максимальное количество еды = " + capacity +
                ", текущее количество еды = " + amountOfFood +
                "}\n";
    }
}
