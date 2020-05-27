package ru.job4j.collection;

import java.util.Comparator;

import static java.lang.Integer.parseInt;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int leftNum = parseInt(left.split(". ")[0]);
        int rightNum = parseInt(right.split(". ")[0]);
        return Integer.compare(leftNum, rightNum);
    }
}
