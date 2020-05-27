package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {
        double rsl = Math.pow((p / 2) / (1 + k), 2) * k;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, square = " + result1);
    }
}
