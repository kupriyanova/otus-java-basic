package ru.otus;

public class Main {

    public static void main(String[] args) {

        // 1
        User user1 = new User("name1",  1985, "user1@email.ru");
        User user2 = new User("name2", 1996, "user2@email.ru");
        User user3 = new User("name3", 2006, "user3@email.ru");
        User user4 = new User("name4", 1986, "user4@email.ru");
        User user5 = new User("name5", 1987, "user5@email.ru");
        User user6 = new User("name6", 1988, "user6@email.ru");
        User user7 = new User("name7", 191, "user7@email.ru");
        User user8 = new User("name8",1992, "user8@email.ru");
        User user9 = new User("name9",1976, "user9@email.ru");
        User user10 = new User("name10",1960, "user10@email.ru");

        // В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью цикла выведите информацию только о пользователях старше 40 лет.
        User[] users = {user1, user2, user3, user4, user5, user6, user7, user8, user9, user10};
        for (User u : users) {
            if (2026 - u.getYearOfDate() > 40) u.printUser();
        }

        // 2
        Box box1 = new Box(10, "black", false);
        Box box2 = new Box(15, "red", true, "apples");
        box1.info();
        box2.info();

        box1.put("socks");
        box1.open();
        box1.put("socks");
        box1.close();
        box1.info();

        box2.setColor("purple");
        box2.getOut();

    }
}