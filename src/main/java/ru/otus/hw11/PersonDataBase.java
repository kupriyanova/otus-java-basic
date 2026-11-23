package ru.otus.hw11;

import java.util.HashMap;
import java.util.Map;

public class PersonDataBase {

    private final Map<Long, Person> map = new HashMap<>();

    public PersonDataBase() {
    }

    public Person findById(Long id) {
        if (!map.containsKey(id)) {
            System.out.println("Работника с таким id в базе данных нет, в ответе вернется null");
        }
        return map.get(id);
    }

    public void add(Person person) {
        map.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        if (person == null) {
            throw new Error("На вход был передан пустой объект");
        }
        return person.getPosition().getIsManager();
    }

    public Boolean isEmployee(Long id) {
        Person person = findById(id);
        if (person == null) {
            System.out.println("Работник не был найден");
            return null;
        }
        return person.getPosition().getIsManager();
    }
}
