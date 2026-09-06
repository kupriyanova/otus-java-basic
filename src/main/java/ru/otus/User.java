package ru.otus;

public class User {

    // Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;
    private final String fio;
    private final Integer yearOfDate;
    private final String email;

    public Integer getYearOfDate() {
        return yearOfDate;
    }

    // Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;
    public User(String fio, Integer yearOfDate, String email) {
        this.fio = fio;
        this.yearOfDate = yearOfDate;
        this.email = email;
    }

    // В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
    //    ФИО: фамилия имя отчество
    //    Год рождения: год рождения
    //    e-mail: email
    public void printUser() {
        String s = String.format("""
                ФИО: %s
                Год рождения: %d
                e-mail: %s""",
                this.fio, this.yearOfDate, this.email);
        System.out.println(s);
    }

}
