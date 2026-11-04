package ru.otus.hw10;

import java.util.*;

public class PhoneBook {

    // Описание/Пошаговая инструкция выполнения домашнего задания:
    //
    //    Реализуйте класс PhoneBook, который хранит в себе список имен (фио) и телефонных номеров;
    //    Метод add() должен позволять добавлять запись имя-телефон;
    //    Метод find() выполнять поиск номер(-а, -ов) телефона по имени;
    //    Под одним именем может быть несколько телефонов (в случае однофамильцев,
    //    или наличии у одного человека нескольких номеров), тогда при запросе такой фамилии должны выводиться все телефоны;
    //    Метод containsPhoneNumber должен проверять наличие телефона в справочнике.

    private final String name;
    private final String phone;

    public PhoneBook(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    private final static Map<String, String> phoneMap = new HashMap<>();

    public void add() {
        if (phoneMap.containsKey(phone)) {
            System.out.println("Такой номер телефона уже существует");
        } else {
            phoneMap.put(phone, name);
            System.out.println("Была добавлена запись: " + name + ", " + phone);
        }
    }

    public static void add(String number, String name) {
        if (phoneMap.containsKey(number)) {
            System.out.println("Такой номер телефона уже существует: " + number);
        } else {
            phoneMap.put(number, name);
            System.out.println("Была добавлена запись: " + name + ", " + number);
        }
    }

    public static List<String> find(String name) {
        if (phoneMap.containsValue(name)) {
            return phoneMap.entrySet().stream()
                    .filter(p -> p.getValue().equals(name))
                    .map(Map.Entry::getKey).toList();
        } else return new ArrayList<>(0);
    }

    public static boolean containsPhoneNumber(String number) {
        return phoneMap.containsKey(number);
    }


    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(name, phoneBook.name) && Objects.equals(phone, phoneBook.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}
