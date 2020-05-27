package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collections;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> second = new ArrayList<>();
        for (int i = 0; i < left.length(); i++) {
            first.add(String.valueOf(left.toCharArray()[i]));
        }
        for (int i = 0; i < right.length(); i++) {
            second.add(String.valueOf(right.toCharArray()[i]));
        }
        Collections.sort(first);
        Collections.sort(second);
        return first.equals(second);
    }

    public static void main(String[] args) {
       FreezeStr.eq("Hello", "Hlloe");
    }
}