package ru.otus;

import ru.otus.hw11.Person;
import ru.otus.hw11.PersonDataBase;

import static ru.otus.hw11.Position.*;

public class Application {

    public static void main(String[] args) {


        PersonDataBase personDataBase = new PersonDataBase();

        personDataBase.add(new Person("Aylin", DIRECTOR, 1L));
        personDataBase.add(new Person("Maria", QA, 2L));
        personDataBase.add(new Person("Ann", DRIVER, 3L));
        personDataBase.add(new Person("Denis", PLUMBER, 4L));

        Person person3 = personDataBase.findById(3L);
        System.out.println(personDataBase.isManager(person3));


        Person person5 = personDataBase.findById(5L);
        System.out.println(personDataBase.isManager(person5));


        System.out.println(personDataBase.isEmployee(1L));

    }
}
