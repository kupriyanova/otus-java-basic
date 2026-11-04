package ru.otus.hw10;

import static ru.otus.hw10.PhoneBook.*;

public class Application {

    public static void main(String[] args) {

        PhoneBook vasya = new PhoneBook("Vasya", "33-33-33");
        PhoneBook petya = new PhoneBook("Petya", "44-44-44");
        PhoneBook petya2 = new PhoneBook("Petya", "42-42-42");
        PhoneBook petya3 = new PhoneBook("Petya", "43-43-43");
        PhoneBook masha = new PhoneBook("Masha", "55-55-55");
        PhoneBook masha2 = new PhoneBook("Masha", "52-52-52");
        PhoneBook masha3 = new PhoneBook("Masha", "52-52-52");

        add("00-00-00", "Jane");
        add("00-00-00", "Jane");

        vasya.add();
        petya.add();
        petya2.add();
        petya3.add();
        masha.add();
        masha2.add();
        masha3.add();

        System.out.println(containsPhoneNumber(masha.getPhone()));
        System.out.println(containsPhoneNumber("43-43-43"));
        System.out.println(containsPhoneNumber("11-11-11"));


        System.out.println(find("Masha"));
        System.out.println(find("Misha"));

    }
}
