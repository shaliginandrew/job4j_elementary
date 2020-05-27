package ru.job4j.lambda;

import java.util.Comparator;

import static java.util.Arrays.sort;

public class Fi {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        System.out.println("Сравниваем строки лексикографически по полю name:");
        Comparator<Attachment> cmpText = (left, right) -> left.getName().compareTo(right.getName());
        sort(atts, cmpText);
        System.out.println(atts[0].getName());
        System.out.println(atts[1].getName());
        System.out.println(atts[2].getName());
        System.out.println("Сравниваем строки по убыванию длины по полю size:");
        Comparator<Attachment> cmpDescSize = (left, right) -> Integer.compare(right.getSize(), left.getSize());
        sort(atts, cmpDescSize);
        System.out.println(atts[0].getSize());
        System.out.println(atts[1].getSize());
        System.out.println(atts[2].getSize());
    }
}