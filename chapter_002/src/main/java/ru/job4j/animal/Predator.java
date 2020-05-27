package ru.job4j.animal;

public class Predator extends Animal {

    public Predator() {

    }

    public Predator(String name) {
        super(name);
        name = "Predator";
        System.out.println(name);
    }

}
