package ru.otus;

public class Box {

//    Попробуйте реализовать класс по его описания:
//    объекты класса Коробка должны иметь размеры и цвет.
    private final int size;
    private String color;
    private Boolean isOpen;
    private String stuff;

    public Box(int size, String color, Boolean isOpen, String stuff) {
        this.size = size;
        this.color = color;
        this.isOpen = isOpen;
        this.stuff = stuff;
    }
    public Box(int size, String color, Boolean isOpen) {
        this.size = size;
        this.color = color;
        this.isOpen = isOpen;
    }

    //    Изменить размер коробки после создания нельзя.
//    public int setSize() {
//        return size;
//    }

    //    Коробку можно перекрашивать.
    public void setColor(String color) {
        this.color = color;
        System.out.println("Теперь цвет коробки " + color);
    }


    //    Коробку можно открывать и закрывать.
    public void open() {
        if (this.isOpen) System.out.println("Коробка уже открыта");
        else {
            this.isOpen = true;
            System.out.println("Вы открыли коробку");
        }
    }

    public void close() {
        if (!this.isOpen) System.out.println("Коробка уже закрыта");
        else {
            this.isOpen = false;
            System.out.println("Вы закрыли коробку");
        }
    }


//    В коробку можно складывать предмет (если в ней нет предмета),
//    или выкидывать его оттуда (только если предмет в ней есть),
//    только при условии, что коробка открыта (предметом читаем просто строку).
    public void put(String stuff) {
        if (!this.isOpen) {
            System.out.println("Коробка закрыта, сначала откройте коробку");
            return;
        }
        if (this.stuff != null) System.out.println("В коробке уже лежит " + this.stuff);
        else {
            this.stuff = stuff;
            System.out.println("Вы положили в коробку " + stuff);
        }
    }

    public void getOut() {
        if (!this.isOpen) {
            System.out.println("Коробка закрыта, сначала откройте коробку");
            return;
        }
        if (this.stuff == null) System.out.println("В коробке ничего не лежит");
        else {
            this.stuff = null;
            System.out.println("Вы освободили коробку");
        }
    }

    //    У коробки должен быть метод, печатающий информацию о ней в консоль.
    public void info() {
        System.out.println("------------------");
        String s = String.format("""
                Размер коробки в литрах: %d
                Цвет коробки: %s""",
                this.size, this.color);
        System.out.println(s);
        System.out.println(this.isOpen ? "Коробка открыта" : "Коробка закрыта");
        System.out.println(this.stuff==null ? "Коробка пуста" : "В коробке лежит " + this.stuff);
        System.out.println("------------------");
    }

//    Выполнение методов должно сопровождаться выводом сообщений в консоль
}
