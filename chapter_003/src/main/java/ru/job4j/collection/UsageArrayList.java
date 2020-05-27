package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");
        for (Object value : names) {
            System.out.println(value);
        }
    }
}
