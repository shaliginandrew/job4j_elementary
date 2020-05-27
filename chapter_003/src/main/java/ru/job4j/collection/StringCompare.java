package ru.job4j.collection;

import java.util.Comparator;

import static java.lang.Math.*;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] charLeft = left.toCharArray();
        char[] charRight = right.toCharArray();
        int compare = 0;
        for (int i = 0; i < min(charLeft.length, charRight.length); i++) {
            compare = Character.compare(charLeft[i], charRight[i]);
            if (compare != 0) {
                break;
            }
        }
        if (compare == 0) {
            compare = Integer.compare(charLeft.length, charRight.length);
        }
        return compare;
    }
}
