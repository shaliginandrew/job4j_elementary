package ru.job4j.lambda;

import java.util.ArrayList;

public class AnonimClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>() {
            @Override
            public boolean add(Integer o) {
                System.out.println("Add a new element to list: " + o);
                return super.add(o);
            }
        };
        list.add(100500);
    }
}
