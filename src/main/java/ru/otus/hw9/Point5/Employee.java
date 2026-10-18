package ru.otus.hw9.Point5;

import java.util.Objects;

public class Employee {

    // Создайте класс Сотрудник с полями: имя, возраст;

    private final String name;
    private final Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(age, employee.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
