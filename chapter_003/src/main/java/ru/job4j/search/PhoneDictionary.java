package ru.job4j.search;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = Objects::nonNull;
        combine.or(person -> person.getName().contains(key)).or(person -> person.getSurname().contains(key))
                .or(person -> person.getPhone().contains(key)).or(person -> person.getSurname().contains(key));
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Andrey", "Shalygin", "89258554432", "Podolsk"));
        phones.add(new Person("Sergey", "Shalygin", "89258554435", "Moscow"));
        ArrayList<Person> rsl = phones.find("Shalygin");
        for (var a : rsl) {
            System.out.println(a.getName());
        }
    }
}
