package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String rsl1 : origin) {
             check.add(rsl1);
        }
        for (String rsl2 : text) {
            if (!check.contains(rsl2)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}