package ru.otus.hw10;

import java.util.Objects;

public class PhoneBook {

    private String name;
    private String phone;


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
