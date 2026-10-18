package ru.otus.hw9.Point5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point5 {

    // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
    // увеличивающий каждый элемент списка на указанное число;

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Name1", 10),
                new Employee("Name2", 20),
                new Employee("Name3", 30)
        );

        System.out.println(namesOf(list));

        System.out.println(employeesWithAge(20, list));

        System.out.println(list);

        employeesAverageAge(18, list);

        System.out.println(getYoung(list));
    }


    // Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
    public static List<String> namesOf(List<Employee> list) {
        List<String> names = new ArrayList<>(list.size());
        for (Employee e : list) {
            names.add(e.getName());
        }
        return names;
    }


    // Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
    // и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
    public static List<Employee> employeesWithAge(Integer minAge, List<Employee> list) {
        List<Employee> employees = new ArrayList<>(list);
        employees.removeIf(e -> e.getAge() < minAge);
        return employees;
    }


    // Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
    // и проверяющий, что средний возраст сотрудников превышает указанный аргумент;
    public static void employeesAverageAge(Integer average, List<Employee> list) {
        int sum = 0;
        for (Employee e : list) {
            sum += e.getAge();
        }
        if (sum / list.size() > average) System.out.println("Средний возраст сотрудников превышает указанный аргумент");
        else System.out.println("Средний возраст сотрудников не превышает указанный аргумент");
    }


    // Реализуйте метод, принимающий в качестве аргумента список сотрудников,
    // и возвращающий ссылку на самого молодого сотрудника.
    public static Employee getYoung(List<Employee> list) {
        Employee minAge = list.get(0);
        for (Employee e : list) {
            minAge = e.getAge() < minAge.getAge() ? e : minAge;
        }
        return minAge;
    }
}
